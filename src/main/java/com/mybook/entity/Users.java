package com.mybook.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "mb_users")
@Data
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String userName;
	String email;
	String password;
	String passwordSalt;
	Date dateRegistred;
	String userType;
	boolean accountStatus;
}
