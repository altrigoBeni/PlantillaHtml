package com.cice.gestionequipo.entidades;

import java.util.List;

public class Entrenador extends Personal{

	private String nacionalidad;
	private boolean comunitario;
	private List<String> equiposAnteriores;
	private List<String> palmares;
	public Entrenador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entrenador(int id, String nombre, String apellido, double salario) {
		super(id, nombre, apellido, salario);
		// TODO Auto-generated constructor stub
	}
	public Entrenador(String nacionalida, boolean comunitario, List<String> equiposAnteriores, List<String> palmares) {
		super();
		this.nacionalidad = nacionalida;
		this.comunitario = comunitario;
		this.equiposAnteriores = equiposAnteriores;
		this.palmares = palmares;
	}
	public String getNacionalida() {
		return nacionalidad;
	}
	public void setNacionalida(String nacionalida) {
		this.nacionalidad = nacionalida;
	}
	public boolean isComunitario() {
		return comunitario;
	}
	public void setComunitario(boolean comunitario) {
		this.comunitario = comunitario;
	}
	public List<String> getEquiposAnteriores() {
		return equiposAnteriores;
	}
	public void setEquiposAnteriores(List<String> equiposAnteriores) {
		this.equiposAnteriores = equiposAnteriores;
	}
	public List<String> getPalmares() {
		return palmares;
	}
	public void setPalmares(List<String> palmares) {
		this.palmares = palmares;
	}
	@Override
	public String toString() {
		return super.toString()+" Entrenador [nacionalidad=" + nacionalidad + ", comunitario=" + comunitario + ", equiposAnteriores="
				+ equiposAnteriores + ", palmares=" + palmares + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (comunitario ? 1231 : 1237);
		result = prime * result + ((equiposAnteriores == null) ? 0 : equiposAnteriores.hashCode());
		result = prime * result + ((nacionalidad == null) ? 0 : nacionalidad.hashCode());
		result = prime * result + ((palmares == null) ? 0 : palmares.hashCode());
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
		Entrenador other = (Entrenador) obj;
		if (comunitario != other.comunitario)
			return false;
		if (equiposAnteriores == null) {
			if (other.equiposAnteriores != null)
				return false;
		} else if (!equiposAnteriores.equals(other.equiposAnteriores))
			return false;
		if (nacionalidad == null) {
			if (other.nacionalidad != null)
				return false;
		} else if (!nacionalidad.equals(other.nacionalidad))
			return false;
		if (palmares == null) {
			if (other.palmares != null)
				return false;
		} else if (!palmares.equals(other.palmares))
			return false;
		return true;
	}
	
	
	
}
