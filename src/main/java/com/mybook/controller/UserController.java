package com.mybook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybook.entity.Users;
import com.mybook.repository.EmployeeRepository;
import com.mybook.service.UsersService;

@RestController
@RequestMapping("/clients")
public class UserController {

	@Autowired
	UsersService usersService;

	@Autowired
	EmployeeRepository employeeRepository;
	@GetMapping
	public ResponseEntity<List<Users>> getUser() {
		System.out.println("yo");
		List<Users> allUsers = usersService.getAllUsers();
		return new ResponseEntity<>(allUsers, HttpStatus.CREATED);
	}

	@PostMapping
	public ResponseEntity<Users> addUser(@RequestBody Users users) {
		Users user = usersService.createUser(users);
		return new ResponseEntity<>(user, HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> removeUser(@PathVariable long id) {
		usersService.removeUser(id);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	  @GetMapping("/{id}")
	    public Users getClient(@PathVariable Long id) {
	        return employeeRepository.findById(id).orElseThrow(RuntimeException::new);
	    }
	@PutMapping("/{id}")
	public ResponseEntity<Users> editUser(@PathVariable long id, @RequestBody Users user) {
		user = usersService.editUser(id, user);
		return new ResponseEntity<>(user, HttpStatus.CREATED);
	}

}
