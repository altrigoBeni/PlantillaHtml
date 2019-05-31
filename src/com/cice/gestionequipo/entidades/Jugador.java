package com.cice.gestionequipo.entidades;

import java.util.List;

public class Jugador extends Entrenador{

	private int numero;
	private String posicion;
	private boolean titular;
	public Jugador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jugador(int id, String nombre, String apellido, double salario) {
		super(id, nombre, apellido, salario);
		// TODO Auto-generated constructor stub
	}
	public Jugador(String nacionalida, boolean comunitario, List<String> equiposAnteriores, List<String> palmares) {
		super(nacionalida, comunitario, equiposAnteriores, palmares);
		// TODO Auto-generated constructor stub
	}
	public Jugador(int numero, String posicion, boolean titular) {
		super();
		this.numero = numero;
		this.posicion = posicion;
		this.titular = titular;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public boolean isTitular() {
		return titular;
	}
	public void setTitular(boolean titular) {
		this.titular = titular;
	}
	@Override
	public String toString() {
		return super.toString()+" Jugador [numero=" + numero + ", posicion=" + posicion + ", titular=" + titular + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numero;
		result = prime * result + ((posicion == null) ? 0 : posicion.hashCode());
		result = prime * result + (titular ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		if (numero != other.numero)
			return false;
		if (posicion == null) {
			if (other.posicion != null)
				return false;
		} else if (!posicion.equals(other.posicion))
			return false;
		if (titular != other.titular)
			return false;
		return true;
	}
	
	
	
	
}
