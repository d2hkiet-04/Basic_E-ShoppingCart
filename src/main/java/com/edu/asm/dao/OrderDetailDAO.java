package com.edu.asm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.asm.entity.OrderDetail;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long>{
}