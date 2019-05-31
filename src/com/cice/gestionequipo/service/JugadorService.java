package com.cice.gestionequipo.service;

import java.util.List;

import com.cice.gestionequipo.dao.DataSource;
import com.cice.gestionequipo.entidades.Paritido;

public interface JugadorService extends EntrenadorService{

	
	public void seleccionarTitularProximoPartido(int idJugador,DataSource dataSource);
	public List<Paritido> getPartidosComoConvocado(int idPartido,DataSource dataSource);
	public List<Paritido> getPartidosComoTitular(int idPartido,DataSource dataSource);
}
