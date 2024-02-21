package com.mybook.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybook.entity.Users;
import com.mybook.repository.EmployeeRepository;
import com.mybook.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Users> getAllUsers() {
		List<Users> allUsers = employeeRepository.findAll();
		return allUsers;
	}

	@Override
	public Users createUser(Users users) {
		Users user = employeeRepository.save(users);
		return user;
	}

	@Override
	public void removeUser(long id) {
		employeeRepository.deleteById(id);

	}

	@Override
	public Users editUser(long id,Users uiUser) {
		Users user = employeeRepository.findById(id).orElseThrow(RuntimeException::new);
		user.setUserName(uiUser.getUserName());
		user.setEmail(uiUser.getEmail());
		return user = employeeRepository.save(user);
		
	}

}
