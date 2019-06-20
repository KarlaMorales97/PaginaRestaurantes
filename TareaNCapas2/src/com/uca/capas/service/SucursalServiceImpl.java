package com.uca.capas.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Sucursal;
import com.uca.capas.repositories.SucursalRepository;

@Service
public class SucursalServiceImpl implements SucursalService{
	
     @Autowired
     SucursalRepository sRepo;
     
     public List<Sucursal> findAll() throws DataAccessException{
		return sRepo.findAll();
    	 
     }

	@Override
	public Sucursal save(Sucursal sucursal) throws DataAccessException {
		// TODO Auto-generated method stub
		return sRepo.save(sucursal);
	}

	@Override
	public com.uca.capas.domain.Sucursal Sucursal(Integer id) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer idSucursal) throws DataAccessException {
		sRepo.deleteById(idSucursal);
	}
}
