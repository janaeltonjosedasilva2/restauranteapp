/*
 * Esta classe é pertencente ao cadastro de restaurantes, onde temos seus métodos e atibutos
 * */
package com.restauranteapp.restauranteapp.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evento implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public long getCidogo() {
		return cidogo;
	}

	public void setCidogo(long cidogo) {
		this.cidogo = cidogo;
	}

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long cidogo;
	private String restaurante;

	public String getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(String restaurante) {
		this.restaurante = restaurante;
	}
	
	
}
