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
	<h2>
		Reporte Global Clientes
	</h2>	
	<h3>Reporte de Mejoras</h3>
		<table>
			<tr>
				<th>Id </th>
				<th>Nombre </th>
				<th>Rubro</th>
				<th>Fecha</th>
				<th>Motivo</th>
				<th>Estado</th>
			</tr>
				<c:forEach items="${listmejora}" var="lm">
					<tr>
						<td>${lm.getIdcliente()}</td> 
						<td>${lm.getNombrecliente()}</td>
						<td>${lm.getRubrocliente()}</td>
						<td>${lm.getFechamejora()}</td>
						<td>${lm.getMotivomejora()}</td>
						<td>${lm.getEstadomejora()}</td>
					</tr>
				</c:forEach>
		</table>
		<hr>
		<h3>Reporte de Accidentes</h3>
		<table>
			<tr>
				<th>Id </th>
				<th>Nombre </th>
				<th>Rubro</th>
				<th>Fecha</th>
				<th>Hora</th>
				<th>Suceso</th>
				<th>Lugar</th>
			</tr>
				<c:forEach items="${listaccidente}" var="la">
					<tr>
						<td>${la.getIdcliente()}</td>
						<td>${la.getNombrecliente()}</td>
						<td>${la.getRubrocliente()}</td>
						<td>${la.getFechaaccidente()}</td>
						<td>${la.getHoraaccidente()}</td>
						<td>${la.getSucesoaccidente()}</td>
						<td>${la.getLugaraccidente()}</td>
					</tr>
				</c:forEach>
		</table>
		<hr>
		<h3>Reporte de Visitas</h3>
		<table>
			<tr>
				<th>Id </th>
				<th>Nombre </th>
				<th>Rubro</th>
				<th>Direccion</th>
				<th>Fecha</th>
				<th>Ciudad</th>
				<th>Resumen</th>
				<th>Empleado</th>
			</tr>
				<c:forEach items="${listvisita}" var="lv">
					<tr>
						<td>${lv.getIdcliente()}</td>
						<td>${lv.getNombrecliente()}</td>
						<td>${lv.getRubrocliente()}</td>
						<td>${lv.getDireccionvisita()}</td>
						<td>${lv.getFechavisita()}</td>
						<td>${lv.getCiudadvisita()}</td>
						<td>${lv.getResumenvisita()}</td>
						<td>${lv.getNombremepleado()}</td>
					</tr>
				</c:forEach>
		</table>
		
		<hr>
		<h3>Reporte de Visitas y Capacitacion</h3>
		<table>
			<tr>
				<th>Id </th>
				<th>Nombre </th>
				<th>Rubro</th>
				<th>Fecha</th>
				<th>Fecha</th>
				<th>Ciudad</th>
				<th>Resumen</th>
				<th>Empleado</th>
				<th>Fecha</th>
				<th>Hora</th>
				<th>Asistentes</th>
			</tr>
				<c:forEach items="${listvisitacapacitacion}" var="lvc">
					<tr>
						<td>${lvc.getIdcliente()}</td> 
						<td>${lvc.getNombrecliente()}</td>
						<td>${lvc.getRubrocliente()}</td>
						<td>${lvc.getDireccionvisita()}</td>
						<td>${lvc.getFechavisita()}</td>
						<td>${lvc.getCiudadvisita()}</td>
						<td>${lvc.getResumenvisita()}</td>
						<td>${lvc.getNombremepleado()}</td>
						<td>${lvc.getFechacapacitacion()}</td>
						<td>${lvc.getHoracapacitacion()}</td>
						<td>${lvc.getNumasistcapacitacion()}</td>
					</tr>
				</c:forEach>
		</table>

</body>
</html>