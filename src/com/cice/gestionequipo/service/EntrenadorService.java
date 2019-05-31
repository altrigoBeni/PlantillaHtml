package com.cice.gestionequipo.service;

import java.util.List;

import com.cice.gestionequipo.dao.DataSource;

public interface EntrenadorService extends PersonalService{

	public List<String> recuperarPalmares(int Id, DataSource dataSource);
	public void agregarTitulo(String titulo,DataSource dataSource);
	public void agregarListadeEquiposAnteriores(int id,List<String> equipos,DataSource dataSource);
	
}
