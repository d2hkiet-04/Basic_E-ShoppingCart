package com.edu.asm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.asm.entity.Role;

public interface RoleDAO extends JpaRepository<Role, String> { }
