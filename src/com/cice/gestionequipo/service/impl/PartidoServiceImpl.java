package com.cice.gestionequipo.service.impl;

import java.util.List;
import java.util.Map;

import com.cice.gestionequipo.dao.DataSource;
import com.cice.gestionequipo.entidades.Jugador;
import com.cice.gestionequipo.entidades.Paritido;
import com.cice.gestionequipo.service.PartidoService;


public class PartidoServiceImpl implements PartidoService {
	
	@Override
	public void prepararPartido(int idEntrenador, List<Jugador> convocados, boolean enCasa, int IdUtillero,
			DataSource dataSource) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void guardarResultadoPartido(int idPartido, String resultado, DataSource dataSource) {
		Paritido paritido = dataSource.partidos.get(idPartido);
		paritido.setResultado(resultado);
		dataSource.partidos.put(idPartido, paritido);
		System.out.println("El Partido "+idPartido+" ha registrado su resultado");
		System.out.println("Resultado -> "+dataSource.partidos.get(idPartido).getResultado());
	
		
	}
	@Override
	public List<Jugador> jugadoresNoConvocados(int idPartido, DataSource dataSource) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Jugador> listaDeTitulares(int idPartido, DataSource dataSource) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Jugador> listaDeConvocados(int idPartido, DataSource dataSource) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
