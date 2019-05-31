package com.cice.gestionequipo.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cice.gestionequipo.entidades.Entrenador;
import com.cice.gestionequipo.entidades.Jugador;
import com.cice.gestionequipo.entidades.Paritido;
import com.cice.gestionequipo.entidades.Personal;
import com.cice.gestionequipo.entidades.Utillero;

public class DataSource {

	
	public static Map<Integer, Paritido> partidos ;
	public static Map<Integer, Personal> plantilla;
	public DataSource() {
		super();
		Entrenador entrenador = new Entrenador(1, "Pep", "Guardiola", 8000000.00);
		Entrenador entrenador2 = new Entrenador(2, "Jose", "Mohurinio", 10000000.00);
		Jugador jugador = new Jugador(3, "Lionel", "Messi", 15000000.00);
		Jugador jugador2 = new Jugador(4, "Iker", "Casillas", 5000000.00);
		Jugador jugador3 = new Jugador(5, "Pepe", "Feo y Calvo", 3000000.00);
		Jugador jugador4 = new Jugador(6, "Cristiano", "Ronaldo", 25000000.00);
		Jugador jugador5 = new Jugador(7, "Favio", "Canavaro", 2000000.00);
		Jugador jugador6 = new Jugador(8, "", "Casillas", 1000000.00);
		Jugador jugador7 = new Jugador(9, "Roberto", "Soldado", 5000000.00);
		Jugador jugador8 = new Jugador(10, "Sergio", "Ramos", 5000000.00);
		Jugador jugador9 = new Jugador(11, "Juan", "Batistao", 5000000.00);
		Jugador jugador10 = new Jugador(12, "Tomas", "Turbado", 2000000.00);
		Jugador jugador11 = new Jugador(13, "Robinson", "Crusoe", 5000000.00);
		Jugador jugador12 = new Jugador(14, "Paquito", "Casillas", 5000000.00);
		Jugador jugador13 = new Jugador(15, "Juaquin", "Cachondo", 5000000.00);
		Jugador jugador14 = new Jugador(16, "Andres", "Iniesta", 5000000.00);
		Jugador jugador15 = new Jugador(17, "Raul", "Bravo", 5000000.00);
		Utillero utillero = new Utillero(18, "Pedro", "el rey de la toalla", 2700.50);
		plantilla = new HashMap<>();
		partidos = new HashMap<>();
		plantilla.put(entrenador.getId(), entrenador);
		plantilla.put(entrenador2.getId(), entrenador2);
		plantilla.put(jugador.getId(), jugador);
		plantilla.put(jugador2.getId(), jugador2);
		plantilla.put(jugador3.getId(), jugador3);
		plantilla.put(jugador4.getId(), jugador4);
		plantilla.put(jugador5.getId(), jugador5);
		plantilla.put(jugador6.getId(), jugador6);
		plantilla.put(jugador7.getId(), jugador7);
		plantilla.put(jugador8.getId(), jugador8);
		plantilla.put(jugador9.getId(), jugador9);
		plantilla.put(jugador10.getId(), jugador10);
		plantilla.put(jugador11.getId(), jugador11);
		plantilla.put(jugador12.getId(), jugador12);
		plantilla.put(jugador13.getId(), jugador13);
		plantilla.put(jugador14.getId(), jugador14);
		plantilla.put(jugador15.getId(), jugador15);
		plantilla.put(utillero.getId(), utillero);
		
		
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
