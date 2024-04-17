package com.exam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.exam.entity.User;
import com.exam.repositories.UserRepo;

@Service
public class UserDetailsServiceImpl  implements UserDetailsService{
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		//loading user from database by username		
		User user = this.userRepo.findByUsername(username);
		if (user==null) {
			System.out.println("User not fount");
			throw new UsernameNotFoundException("No User Found !!");
		} 
		return user;
	}

}
