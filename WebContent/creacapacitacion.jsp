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
	<c:if test="${msg != null}">
		<h3><c:out value="${msg}"></c:out></h3>
	</c:if>

	<br>
	<c:if test="${msg == null}">
	<h2>Creacion de Capacitacion para cliente</h2>
	<form method="post" action="GenerarCapacitacion">
		<table>
			<tr>
				<td>Fecha Capacitacion</td>
				<td> <input type="text" name="fecha" required 
					pattern="[0-9]{4}-[0-9]{2}-[0-9]{2}" 
					title="Ingrese con formato YYYY-MM-DD" placeholder="YYYY-MM-DD"><br> </td>
			</tr>
			<tr>
				<td>Hora Capacitacion </td>
				<td><input type="text" name="hora"><br></td>
			</tr>
			<tr>
				<td>Numero asistente capacitacion</td>
				<td><input type="number" name="numasistente"><br></td>
			</tr>
			<tr>
				<td>Numero visita</td>
				<td><input type="number" name="idvisita" value="${idvisita}" readonly><br></td>
			</tr>
			<tr>
			<td colspan="2">
				<input type="submit" value="Enviar Capacitacion">  
			</td>
			</tr>
		</table>
	</form>
	</c:if>
</body>
</html>