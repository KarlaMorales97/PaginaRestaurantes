package com.uca.capas.repositories;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;

import com.uca.capas.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{
	
	public Usuario findByUsuarioAndClave(String usuario, String pass) throws DataAccessException;
	
}
