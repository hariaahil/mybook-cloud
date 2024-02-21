package com.mybook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mybook.entity.Users;

public interface EmployeeRepository extends JpaRepository<Users, Long> {

}