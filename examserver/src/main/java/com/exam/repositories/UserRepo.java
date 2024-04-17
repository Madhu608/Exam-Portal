package com.exam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

	public User findByUsername(String username);

	

}
