package com.cice.gestionequipo.service;

import com.cice.gestionequipo.dao.DataSource;

public interface PersonalService {

	
	public void contratar(Integer fechaInicio, int id, String name , String surname,DataSource dataSource);
	public void despedir(Integer fechaFin, int id,DataSource dataSource);
	public void modificarSalario(int Id,  double nuevoSalario,DataSource dataSource);
	
	
}
