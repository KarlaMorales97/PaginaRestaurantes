package com.uca.capas.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Sucursal;

@Repository
public class SucursalDAOImpl implements SucursalDAO{
	
	@PersistenceContext(unitName="capas")
	private EntityManager entityManager;

	@Override
	public Sucursal findOne(Integer idSucursal) throws DataAccessException {
		Sucursal sucursal = entityManager.find(Sucursal.class, idSucursal);
		return sucursal;
	}

}
