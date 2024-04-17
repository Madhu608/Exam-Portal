package com.exam.service.impl;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entity.User;
import com.exam.entity.UserRole;
import com.exam.repositories.RoleRepo;
import com.exam.repositories.UserRepo;
import com.exam.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private RoleRepo roleRepo;

	
	// creating User

	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
	    User local = this.userRepo.findByUsername(user.getUsername());

	    if (local != null) {
	        System.out.println("User is already there!!");
	        throw new Exception("User already present!!");
	    } else {
	        // Save roles first to avoid cascading issues
	        for (UserRole ur : userRoles) {
	            roleRepo.save(ur.getRole());
	        }

	        // Set the user roles without triggering cascading operations	    
	        user.getUserRoles().addAll(userRoles);
	        local = this.userRepo.save(user);
	    }

	    return local;
	}


	@Override
	public User getUserByUserName(String username) {
		return this.userRepo.findByUsername(username);
		
	}


	@Override
	public void deleteUserById(Long userId) {
		 this.userRepo.deleteById(userId);		
	}


	@Override
	public User updateUser(Long userId) {
		return null;
	}

}
