package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name = "usuario")
public class Usuario {
	@Column(name = "usuario")
	@Id
	@NotNull(message="Credenciales invalidas")
	String usuario;
	@Column(name = "clave")
	@NotNull(message="Credenciales invalidas")
	String clave;
	
	
	public Usuario(String usuario, String clave) {
		super();
		this.usuario = usuario;
		this.clave = clave;
	}


	public Usuario() {
		super();
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
	

}
