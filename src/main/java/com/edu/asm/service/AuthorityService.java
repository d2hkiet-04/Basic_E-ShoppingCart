package com.edu.asm.service;

import java.util.List;

import com.edu.asm.entity.Authority;


public interface AuthorityService {
	public List<Authority> findAll() ;

	public Authority create(Authority auth) ;

	public void delete(Integer id) ;

	public List<Authority> findAuthoritiesOfAdministrators() ;
}
