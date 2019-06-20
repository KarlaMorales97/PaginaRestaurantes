package com.uca.capas.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity(name = "sucursal")
public class Sucursal {
	
	@Column(name = "codigo")
	@Id
	@GeneratedValue(generator = "sucursal_codigo_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "sucursal_codigo_seq" , sequenceName = "public.sucursal_codigo_seq", allocationSize = 1)
	Integer codigoSucursal;
	
	@NotEmpty(message="Este campo no puede estar vacio")
	@Column(name = "nombre")
	String nombre;

	@NotEmpty(message="Este campo no puede estar vacio")
	@Column(name = "ubicacion")
	String ubicacion;
	
	@NotEmpty(message="Este campo no puede estar vacio")
	@Column(name = "horario_apertura")
	String horarioApertura;
	
	@NotNull(message="Este campo no puede estar vacio")
	@Column(name = "nmesas")
	Integer nMesas;
	
	@NotEmpty(message="Este campo no puede estar vacio")
	@Column(name = "nomgerente")
	String nomGerente;

	@NotEmpty(message="Este campo no puede estar vacio")
	@Column(name = "horario_cierre")
	String horarioCierre;
	
	@OneToMany(mappedBy = "sucursal", fetch = FetchType.EAGER)
	List<Empleado> empleados;

	public Integer getCodigoSucursal() {
		return codigoSucursal;
	}

	public void setCodigoSucursal(Integer codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getHorarioApertura() {
		return horarioApertura;
	}

	public void setHorarioApertura(String horarioApertura) {
		this.horarioApertura = horarioApertura;
	}

	public Integer getnMesas() {
		return nMesas;
	}

	public void setnMesas(Integer nMesas) {
		this.nMesas = nMesas;
	}

	public String getNomGerente() {
		return nomGerente;
	}

	public void setNomGerente(String nomGerente) {
		this.nomGerente = nomGerente;
	}

	public String getHorarioCierre() {
		return horarioCierre;
	}

	public void setHorarioCierre(String horarioCierre) {
		this.horarioCierre = horarioCierre;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	

}
