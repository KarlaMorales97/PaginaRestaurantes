package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "empleado")
public class Empleado {

	@Column(name = "codigo")
	@Id
	@GeneratedValue(generator = "sucursal_codigo_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "sucursal_codigo_seq" , sequenceName = "public.sucursal_codigo_seq", allocationSize = 1)
	Integer codigoEmpleado;
	
	@Column(name = "nombre")
	String nombre;
	
	@Column(name = "edad")
	Integer edad;
	
	@Column(name = "genero")
	String genero;
	
	@Column(name = "estado")
	Boolean estado;
	
	@ManyToOne(fetch = FetchType.EAGER)
	Sucursal sucursal;
	
}
