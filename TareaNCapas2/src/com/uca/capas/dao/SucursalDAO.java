package com.uca.capas.dao;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Sucursal;


public interface SucursalDAO {
	
	public Sucursal findOne(Integer idSucursal) throws DataAccessException;

}
