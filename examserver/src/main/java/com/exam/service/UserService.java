package com.exam.service;

import java.util.Set;

import com.exam.entity.User;
import com.exam.entity.UserRole;

public interface UserService {
	
	//creating user
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;

	//get User By username
	public User getUserByUserName(String username);
	
	// delete user by userId
	public void deleteUserById(Long userId);
	
	//Update User
	public User updateUser(Long userId);
}
