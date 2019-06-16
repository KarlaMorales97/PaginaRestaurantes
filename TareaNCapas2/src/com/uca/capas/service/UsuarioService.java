package com.uca.capas.service;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Usuario;

public interface UsuarioService {

	public Boolean findByUserPass(String usuario, String pass) throws DataAccessException;
	
	public Usuario findOne() throws DataAccessException;
}
