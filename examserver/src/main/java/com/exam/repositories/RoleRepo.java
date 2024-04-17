package com.exam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.entity.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {

}
