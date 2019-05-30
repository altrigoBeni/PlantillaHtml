<%@page import="com.cice.PlantillaHtml.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
HttpSession httpSession = request.getSession();
Usuario usuario = (Usuario)httpSession.getAttribute("USUARIO");
%>

<%if(usuario == null){ %>
<form action="Login" method="post">
  First name:<br>
  <input type="text" name="firstname" value="Mickey">
  <br>
  Last name:<br>
  <input type="text" name="lastname" value="Mouse">
  <br><br>
  <input type="submit" value="Submit">
</form> 
<%} else{%>
<h2>Hola <%= usuario.getNombre() %> <%=usuario.getApellido() %> tienes unas orejas muy grandes</h2>
<%} %>

</body>
</html>