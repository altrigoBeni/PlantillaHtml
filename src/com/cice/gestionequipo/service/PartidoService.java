package com.cice.gestionequipo.service;

import java.util.List;

import com.cice.gestionequipo.dao.DataSource;
import com.cice.gestionequipo.entidades.Jugador;

public interface PartidoService {
	
	
	public void prepararPartido(int idEntrenador,List<Jugador> convocados, boolean enCasa, int IdUtillero,DataSource dataSource);
	public void guardarResultadoPartido(int idPartido,String resultado,DataSource dataSource);
	public List<Jugador> jugadoresNoConvocados(int idPartido,DataSource dataSource);
	public List<Jugador> listaDeTitulares(int idPartido,DataSource dataSource);
	public List<Jugador> listaDeConvocados(int idPartido,DataSource dataSource);


}
