package com.uca.capas.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Sucursal;

public interface SucursalService {
	
	public List<Sucursal> findAll() throws DataAccessException;
	
	public Sucursal save(Sucursal sucursal) throws DataAccessException;
	
	public Sucursal Sucursal(Integer id) throws DataAccessException;
	
	public void delete(Integer sucursal) throws DataAccessException;
	
	public Sucursal findById(Integer idSucursal) throws DataAccessException;

}
