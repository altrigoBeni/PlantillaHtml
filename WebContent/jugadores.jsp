<%@page import="java.util.Map"%>
<%@page import="com.cice.gestionequipo.dao.DataSource"%>
<%@page import="com.cice.gestionequipo.entidades.Personal"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cice Jugadores</title>
</head>
<body>

<%
HttpSession httpSession = request.getSession();
DataSource dataSource = (DataSource)httpSession.getAttribute("DATASOURCE"); 
Map<Integer,Personal> plantilla = dataSource.plantilla;

for(int i =1; i<= plantilla.size();i++){%>

<h4>Key <%=i %> value: <%=plantilla.get(i) %></h4>

<%} %>





</body>
</html>