<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Menu Principal</h1>
		<hr>
		<h4>ÁREA ADMINISTRADOR</h4>
		<ol>
		<li>CU01
			<a href="${pageContext.request.contextPath}/ListarClientes">Administrar Clientes</a>
		</li>
		<li>CU02
			<a href="${pageContext.request.contextPath}/ListarEmpleados">Administrar Empleados</a>
		</li>
		</ol>
		<hr>
		<h4>ÁREA EMPLEADO</h4>	
		<ol start="3">
		<li>CU03
			<a href="${pageContext.request.contextPath}/AgregarCapacitacion">Crear capacitacion</a>
		</li>
		<li>CU04 
			<a href="${pageContext.request.contextPath}/PlanificarVisita">Planificar Visita</a>
		</li>
		<li>CU05 
			<a href="${pageContext.request.contextPath}/RevisarCliente">Revisar Cliente</a>
		</li>
		<li>CU06 
			<a href="${pageContext.request.contextPath}/ReportarAccidente">Reportar accidente</a>
		</li>		
		<li>CU08 
			<a href="${pageContext.request.contextPath}/GestionarMejora">Ingresar Actividad de mejora</a>
		</li>
		<li>CU09 
			<a href="${pageContext.request.contextPath}/RevisarMejora">Revisar Actividad de mejora</a>
		</li>
		<li>CU19 Generar reporte cliente (Pendiente)</li>
		<li>CU20 Generar reporte global (Pendiente)</li>
	</ol>
</body>
</html>
