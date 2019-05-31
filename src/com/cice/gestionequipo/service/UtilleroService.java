package com.cice.gestionequipo.service;

import com.cice.gestionequipo.dao.DataSource;

public interface UtilleroService extends PersonalService {
	
	public void modificacionEstadoCapacidadDeViajar(int idUtillero,boolean nuevoEstado,DataSource dataSource);

}
