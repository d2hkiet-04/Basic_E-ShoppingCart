package com.edu.asm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.asm.entity.Category;

public interface CategoryDAO extends JpaRepository<Category, String>{
}
