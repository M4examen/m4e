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
	<h1>Administrar Empleados (Agregar/Modificar/Eliminar)</h1>	
	<c:if test="${txt != null}">
	<h3><c:out value="${txt}"></c:out></h3>
</c:if>
	<table>
		<tr>
			<th>Nombre</th>
			<th>Especialidad</th>
		</tr>
		<c:forEach items="${listaempleados}" var="emp">
			<tr>
				<td>${emp.getNombreEmpleado()}</td>
				<td>${emp.getEspecialidadEmpleado()}</td>
				<td><a href="${pageContext.request.contextPath}/EliminarEmpleado?id=${emp.getIdEmpleado()}">Eliminar</a></td>
				<td><a href="${pageContext.request.contextPath}/ModificarEmpleado?id=${emp.getIdEmpleado()}">Modificar</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="${pageContext.request.contextPath}/AgregarEmpleado">Agregar Empleado</a>
</body>
</html>