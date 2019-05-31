package com.cice.gestionequipo.entidades;

public class Utillero extends Personal {

	
	private boolean viaja;

	public Utillero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Utillero(int id, String nombre, String apellido, double salario) {
		super(id, nombre, apellido, salario);
		// TODO Auto-generated constructor stub
	}

	public Utillero(boolean viaja) {
		super();
		this.viaja = viaja;
	}

	public boolean isViaja() {
		return viaja;
	}

	public void setViaja(boolean viaja) {
		this.viaja = viaja;
	}

	@Override
	public String toString() {
		return super.toString()+ " Utillero [viaja=" + viaja + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (viaja ? 1231 : 1237);
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
		Utillero other = (Utillero) obj;
		if (viaja != other.viaja)
			return false;
		return true;
	}
	
	
	
}
