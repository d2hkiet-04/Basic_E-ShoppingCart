package com.edu.asm.service;

import java.util.List;

import com.edu.asm.entity.Account;


public interface AccountService {
	public List<Account> findAll() ;
	public Account findById(String username) ;
	public List<Account> getAdministrators() ;
}
