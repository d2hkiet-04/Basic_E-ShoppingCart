package com.edu.asm.service;

import java.util.List;

import com.edu.asm.entity.Order;
import com.fasterxml.jackson.databind.JsonNode;


public interface OrderService {
	public Order create(JsonNode orderData) ;
	
	public Order findById(Long id) ;
	
	public List<Order> findByUsername(String username) ;
}
