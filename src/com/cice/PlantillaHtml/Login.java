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

import com.sun.org.apache.bcel.internal.generic.NEW;


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
		HttpSession httpSession = request.getSession();
		Usuario usuario = (Usuario)httpSession.getAttribute("USUARIO");
		
		if (usuario==null) {
			String nombre = request.getParameter("firstname");
			String apellido = request.getParameter("lastname");
			usuario = new Usuario (nombre, apellido);
			httpSession.setAttribute("USUARIO", usuario);
		}else {
			Double peso = Double.parseDouble(request.getParameter("weight"));
			Double altura = Double.parseDouble(request.getParameter("hight"));
			String telefono = request.getParameter("phone");
			usuario.setPeso(peso);
			usuario.setAltura(altura);
			usuario.setTelefono(telefono);
			httpSession.setAttribute("USUARIO", usuario);					
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/main.jsp");
		dispatcher.forward(request, response);
	}



	
}
