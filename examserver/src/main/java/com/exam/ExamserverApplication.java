package com.exam;

import java.util.HashSet;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.entity.Role;
import com.exam.entity.User;
import com.exam.entity.UserRole;
import com.exam.service.UserService;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner{
	
  @Autowired
  private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	 @Override
	    public void run(String... args) throws Exception {
//	        System.out.println("Starting code");
//
//	        // Create a user
//	        User user = new User();
//	        user.setFirstName("Madhu");
//	        user.setLastName("S");
//	        user.setUsername("Madhu608");
//	        user.setPassword("madhu@608");
//	        user.setEmail("madhu@gmail.com");
//	        user.setPhone("7894561235");
//	        user.setProfile("default.png");
//
//	        // Create a role
//	        Role role1 = new Role();
//	        role1.setRoleId(50L);
//	        role1.setRoleName("ADMIN");
//	    
//	        // Set user roles
//	        Set<UserRole> userRoleSet = new HashSet<>();
//	        UserRole userRole = new UserRole();
//	        userRole.setRole(role1);
//	        userRole.setUser(user);
//
//	       
//	        userRoleSet.add(userRole);
//
//	        // Save user with roles
//	        User savedUser = this.userService.createUser(user, userRoleSet);
//	        System.out.println(savedUser.getUsername());
	    }

}
