<%@page import="com.sun.org.apache.bcel.internal.generic.SWITCH"%>
<%@page import="com.sun.org.apache.bcel.internal.generic.Select"%>
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
<%}else if((usuario.getPeso() == null) || (usuario.getAltura()==null) || (usuario.getTelefono()==null)){%>

<h2>Hola <%= usuario.getNombre() %> <%=usuario.getApellido() %>, introduce el resto de tus datos</h2>
<form action="Login" method="post">
  Weight:<br>
  <input type="number" name="weight">
  <br>
  Hight:<br>
  <input type="number" name="hight">
  <br>
  Phone:<br>
  <input type="text" name="phone">
  <br><br>
  <input type="submit" value="Submit">
</form> 

<%}else {%>
<h2>Hola <%= usuario.getNombre() %> <%=usuario.getApellido() %>, pesas <%=usuario.getPeso() %>, mides <%=usuario.getAltura() %> Tu telf es: <%=usuario.getTelefono() %></h2>
<%} %>

</body>
</html>