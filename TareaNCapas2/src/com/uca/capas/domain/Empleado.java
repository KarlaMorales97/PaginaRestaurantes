package com.uca.capas.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity(name = "empleado")
public class Empleado {

	@Column(name = "codigo")
	@Id
	@GeneratedValue(generator = "sucursal_codigo_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "sucursal_codigo_seq" , sequenceName = "public.sucursal_codigo_seq", allocationSize = 1)
	Integer codigoEmpleado;
	
	@NotEmpty(message="Este campo no puede estar vacio")
	@Column(name = "nombre")
	String nombre;
	
	@NotNull(message="Este campo no puede estar vacio")
	@Column(name = "edad")
	Integer edad;
	
	@Column(name = "genero")
	String genero;
	
	@Column(name = "estado")
	Boolean estado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="sucursal")
	private Sucursal sucursal;

	public Integer getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(Integer codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
	
	//METODO DELEGATE
	public String getEstadoDelegate() {
		if(this.estado == null) {
			return "";
		}
		else {
			if(this.estado) return "ACTIVO";
			else return "INACTIVO";
		}
		
	}
	
}
