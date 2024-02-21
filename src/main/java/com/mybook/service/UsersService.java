package com.mybook.service;

import java.util.List;

import com.mybook.entity.Users;


public interface UsersService {
	
	public List<Users> getAllUsers();

	public Users createUser(Users users);

	public void removeUser(long id);

	Users editUser(long id, Users uiUser);
	

}
