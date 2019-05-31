package com.cice.gestionequipo.service.impl;

import com.cice.gestionequipo.dao.DataSource;
import com.cice.gestionequipo.entidades.Personal;
import com.cice.gestionequipo.service.PersonalService;

public class PersonalServiceImpl implements PersonalService{
	@SuppressWarnings("static-access")
	@Override
	public void contratar(Integer fechaInicio, int id, String name, String surname, DataSource dataSource) {
		Personal personal = dataSource.plantilla.get(id);
		if(name.equalsIgnoreCase(personal.getNombre())
				&&surname.equalsIgnoreCase(personal.getApellido())){
			System.out.println("El Nombre de "+personal.getNombre()+" Coincide");
			System.out.println("El Apellido de "+personal.getApellido()+" Coincide");
		personal.setFechaIncorporacion(fechaInicio);
		dataSource.plantilla.put(id, personal);
		System.out.println(personal.toString()+ " Contratado");
		}else{
		System.out.println(personal.toString()+" no contratada");
		}
		System.out.println("Verificando fecha de Entrada "
		+ dataSource.plantilla.get(id).getFechaIncorporacion());
		
	}

	@Override
	public void despedir(Integer fechaFin, int id, DataSource dataSource) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarSalario(int Id, double nuevoSalario, DataSource dataSource) {
		// TODO Auto-generated method stub
		
	}

	

	

}
