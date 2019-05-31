package com.cice.gestionequipo.service.impl;

import com.cice.gestionequipo.dao.DataSource;
import com.cice.gestionequipo.entidades.Personal;
import com.cice.gestionequipo.entidades.Utillero;
import com.cice.gestionequipo.service.UtilleroService;

public class UtilleroServiceImpl extends PersonalServiceImpl implements UtilleroService  {

	@Override
	public void modificacionEstadoCapacidadDeViajar(int idUtillero, boolean nuevoEstado, DataSource dataSource) {
		Utillero utillero = (Utillero)dataSource.plantilla.get(idUtillero);
		Personal personal = dataSource.plantilla.get(idUtillero);
		if (personal.getId()==idUtillero) {
			utillero.setViaja(nuevoEstado);
			
			System.out.println("El utillero con id: "+idUtillero+" puede viajar: "+utillero.toString());
	
		}
		
	}

	

}
