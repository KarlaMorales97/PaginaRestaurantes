package com.uca.capas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Usuario;
import com.uca.capas.repositories.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	
	@Autowired
	UsuarioRepository uRepo;
	

	@Override
	public Usuario findOne() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean findByUserPass(String usuario, String pass) throws DataAccessException {
		if(uRepo.findByUsuarioAndClave(usuario, pass) == null) {
			return false;
		}
		return true;
	}

	
}
