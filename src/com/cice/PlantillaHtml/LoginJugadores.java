package com.cice.PlantillaHtml;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cice.gestionequipo.dao.DataSource;
import com.cice.gestionequipo.entidades.Personal;

/**
 * Servlet implementation class LoginJugadores
 */
@WebServlet("/LoginJugadores")
public class LoginJugadores extends HttpServlet {
	private static final long serialVersionUID = 1L;
     DataSource dataSource = new DataSource();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginJugadores() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession httpSession = request.getSession();		
		httpSession.setAttribute("DATASOURCE", dataSource); //Se ke incluye el dataSource porque ya contiene toda la info de plantilla
		dataSource.plantilla.forEach((clave,valor)->{System.out.println("Key: " + clave + " Value: " + valor);});
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jugadores.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
