package com.uca.capas.domain;

import java.util.List;

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

@Entity(name = "sucursal")
public class Sucursal {
	
	@Column(name = "codigo")
	@Id
	@GeneratedValue(generator = "sucursal_codigo_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "sucursal_codigo_seq" , sequenceName = "public.sucursal_codigo_seq", allocationSize = 1)
	Integer codigo;
	
	@Column(name = "nombre")
	String nombre;

	@Column(name = "ubicacion")
	String ubicacion;
	
	@Column(name = "horario_apertura")
	String horarioApertura;
	
	@Column(name = "nmesas")
	Integer nMesas;
	
	@Column(name = "nomgerente")
	String nomGerente;

	@Column(name = "horario_cierre")
	String horarioCierre;
	
	@OneToMany(mappedBy = "sucursal", fetch = FetchType.LAZY)
	List<Empleado> empleados;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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
