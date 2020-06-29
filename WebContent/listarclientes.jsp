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
	<h1>Administrar Clientes (Agregar/Modificar/Eliminar)</h1>	
	<c:if test="${txt != null}">
	<h3><c:out value="${txt}"></c:out></h3>
</c:if>
	<table>
		<tr>
			<th>Nombre</th>
			<th>Telefono</th>
			<th>Email</th>
			<th>Rubro</th>
			<th>Direccion</th>
		</tr>
		<c:forEach items="${listaclientes}" var="cli">
			<tr>
				<td>${cli.getNombreCliente()}</td>
				<td>${cli.getTelefonoCliente()}</td>
				<td>${cli.getEmailCliente()}</td>
				<td>${cli.getRubroCliente()}</td>
				<td>${cli.getDireccionCliente()}</td>
				<td><a href="${pageContext.request.contextPath}/EliminarCliente?id=${cli.getIdCliente()}">Eliminar</a></td>
				<td><a href="${pageContext.request.contextPath}/ModificarCliente?id=${cli.getIdCliente()}">Modificar</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="AgregarCliente">Agregar Cliente</a>
</body>
</html>