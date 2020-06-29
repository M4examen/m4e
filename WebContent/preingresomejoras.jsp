<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="index.jsp">Menu Principal</a>
	<hr>
	<h1>Ingresar Mejoras</h1>	
	<c:if test="${txt != null}">
	<h3><c:out value="${txt}"></c:out></h3>
</c:if>
	<table>
		<tr>
			<th>Nombre</th>
			<th>Telefono</th>
			<th>Email</th>
		</tr>
		<c:forEach items="${listaclientes}" var="cli">
			<tr>
				<td>${cli.getNombreCliente()}</td>
				<td>${cli.getTelefonoCliente()}</td>
				<td>${cli.getEmailCliente()}</td>
				<td>
					<form action="GestionarMejora" method="post">
						<input type="hidden" name="idcliente" value="${cli.getIdCliente()}">
						<input type="hidden" name="nombrecliente" value="${cli.getNombreCliente()}">
						<input type="submit" value="Ingresar Mejora">
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
	<br>
</body>
</html>