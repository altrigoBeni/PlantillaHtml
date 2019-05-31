package com.cice.gestionequipo.entidades;

import java.util.List;

public class Paritido {

	
	private String competicion;
	private List<Jugador> convocados;
	private List<Jugador> titulares;
	private Utillero utillero;
	private Entrenador entrenador;
	private String resultado;
	private boolean JugadoEnCasa;
	public Paritido() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Paritido(String competicion, List<Jugador> convocados, List<Jugador> titulares, Utillero utillero,
			Entrenador entrenador, String resultado, boolean jugadoEnCasa) {
		super();
		this.competicion = competicion;
		this.convocados = convocados;
		this.titulares = titulares;
		this.utillero = utillero;
		this.entrenador = entrenador;
		this.resultado = resultado;
		JugadoEnCasa = jugadoEnCasa;
	}
	public String getCompeticion() {
		return competicion;
	}
	public void setCompeticion(String competicion) {
		this.competicion = competicion;
	}
	public List<Jugador> getConvocados() {
		return convocados;
	}
	public void setConvocados(List<Jugador> convocados) {
		this.convocados = convocados;
	}
	public List<Jugador> getTitulares() {
		return titulares;
	}
	public void setTitulares(List<Jugador> titulares) {
		this.titulares = titulares;
	}
	public Utillero getUtillero() {
		return utillero;
	}
	public void setUtillero(Utillero utillero) {
		this.utillero = utillero;
	}
	public Entrenador getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public boolean isJugadoEnCasa() {
		return JugadoEnCasa;
	}
	public void setJugadoEnCasa(boolean jugadoEnCasa) {
		JugadoEnCasa = jugadoEnCasa;
	}
	@Override
	public String toString() {
		return "Paritido [competicion=" + competicion + ", convocados=" + convocados + ", titulares=" + titulares
				+ ", utillero=" + utillero + ", entrenador=" + entrenador + ", resultado=" + resultado
				+ ", JugadoEnCasa=" + JugadoEnCasa + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (JugadoEnCasa ? 1231 : 1237);
		result = prime * result + ((competicion == null) ? 0 : competicion.hashCode());
		result = prime * result + ((convocados == null) ? 0 : convocados.hashCode());
		result = prime * result + ((entrenador == null) ? 0 : entrenador.hashCode());
		result = prime * result + ((resultado == null) ? 0 : resultado.hashCode());
		result = prime * result + ((titulares == null) ? 0 : titulares.hashCode());
		result = prime * result + ((utillero == null) ? 0 : utillero.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paritido other = (Paritido) obj;
		if (JugadoEnCasa != other.JugadoEnCasa)
			return false;
		if (competicion == null) {
			if (other.competicion != null)
				return false;
		} else if (!competicion.equals(other.competicion))
			return false;
		if (convocados == null) {
			if (other.convocados != null)
				return false;
		} else if (!convocados.equals(other.convocados))
			return false;
		if (entrenador == null) {
			if (other.entrenador != null)
				return false;
		} else if (!entrenador.equals(other.entrenador))
			return false;
		if (resultado == null) {
			if (other.resultado != null)
				return false;
		} else if (!resultado.equals(other.resultado))
			return false;
		if (titulares == null) {
			if (other.titulares != null)
				return false;
		} else if (!titulares.equals(other.titulares))
			return false;
		if (utillero == null) {
			if (other.utillero != null)
				return false;
		} else if (!utillero.equals(other.utillero))
			return false;
		return true;
	}
	
	
	
}
