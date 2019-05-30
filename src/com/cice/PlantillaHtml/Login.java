package com.cice.PlantillaHtml;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.coyote.Request;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    } 
    

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/main.jsp");
		dispatcher.forward(req, resp);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("firstname");
		String apellido = request.getParameter("lastname");
		Usuario usuario = new Usuario(nombre, apellido);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("USUARIO", usuario);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/main.jsp");
		dispatcher.forward(request, response);
	}


	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Double peso = Double.parseDouble(req.getParameter("weight"));
		Double altura = Double.parseDouble(req.getParameter("hight"));
		String telefono = req.getParameter("phone");		
		HttpSession httpSession = req.getSession();
		Usuario usuario = (Usuario)httpSession.getAttribute("USUARIO");
		usuario.setPeso(peso);
		usuario.setAltura(altura);
		usuario.setTelefono(telefono);
		httpSession.setAttribute("USUARIO", usuario);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/main.jsp");
		dispatcher.forward(req, resp);
	}

	
}
