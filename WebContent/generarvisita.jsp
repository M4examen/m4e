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
	<a href="PlanificarVisita">Volver</a>
	<hr>
	<h1>Generar Visita Cliente ${cliente}</h1>
	<c:if test="${ccmensaje != null}">
		<h3><c:out value="${ccmensaje}"></c:out></h3>
	</c:if>
	
	<form method="post" action="GenerarVisita">
		<table>
			<tr>
				<td>
					Fecha de Visita: 
				</td>
				<td>
					<input type="date" name="fecha" required 
					pattern="[0-9]{4}-[0-9]{2}-[0-9]{2}" 
					title="Ingrese con formato YYYY-MM-DD" placeholder="YYYY-MM-DD"><br>
				</td>
			</tr>
			<tr>
				<td>
					Ciudad: 
				</td>
				<td>
					<input type="text" name="ciudad"><br>
				</td>
			</tr>
			<tr>
				<td>
					Direccion: 
				</td>
				<td>
					<input type="text" name="direccion"><br>
				</td>
			</tr>
			<tr>
				<td>
					Observaciones: 
				</td>
				<td>
					<input type="text" name="obs"><br>
				</td>
			</tr>
			<tr>
				<td>
					Resumen: 
				</td>
				<td>
					<input type="text" name="resumen"><br>
				</td>
			</tr>
			<tr>
				<td>
					Empleado: 
				</td>
				<td>
					<select name="idempleado">
						<c:forEach items="${listemp}" var="emp">
							<option value="${emp.getIdEmpleado()}">${emp.getNombreEmpleado()} (${emp.getEspecialidadEmpleado()})</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>
					<input type="hidden" name="idcliente" value="${idcli}" readonly><br>
					<input type="submit" value="Generar visita" />
				</td>
			</tr>
		</table>
		<br>
	</form>

</body>
</html>