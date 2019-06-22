package com.uca.capas.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Empleado;
import com.uca.capas.domain.Sucursal;

public interface EmpleadoService {
	
	public Empleado save(Empleado empleado) throws DataAccessException;
	
	public Empleado findOne(Integer idEmpleado) throws DataAccessException;
	
	public List<Empleado> findAll() throws DataAccessException;

}
