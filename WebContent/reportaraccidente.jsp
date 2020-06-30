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
	<h2>Reportar Accidente</h2>	
	<c:if test="${ccmensaje != null}">
		<h4>
			<c:out value="${ccmensaje}"></c:out> 
			<c:if test="${idtrue == false }"><a href="${urlrc}">Revisar Cliente</a></c:if>
		</h4>
	</c:if>
	
	<c:if test="${idtrue == null}">
		<form action="ReportarAccidente" method="post">
		Ingrese Id Cliente 
		<input type="number" name="idcli" required>
		<input type="submit" value="Revisar">
		</form>
	</c:if>
	
	<c:if test="${idtrue == false}">
		<form action="ReportarAccidente" method="post">
		Ingrese Id Cliente 
		<input type="number" name="idcli" required>
		<input type="submit" value="Revisar">
		</form>
	</c:if>
	
	<c:if test="${idtrue != null}">
		<c:if test="${idtrue == true }">
			<form action="AgregarAccidente" method="post">
			<table>
				<tr>
					<td>Fecha Accidente</td>
					<td><input type="text" name="fechaaccidente" required 
					pattern="[0-9]{4}-[0-9]{2}-[0-9]{2}" 
					title="Ingrese con formato YYYY-MM-DD" placeholder="YYYY-MM-DD"></td>
				</tr>
				<tr>
					<td>Hora Accidente</td>
					<td><input type="text" name="horaaccidente"></td>
				</tr>
				<tr>
					<td>Suceso Accidente</td>
					<td><input type="text" name="sucesoaccidente"></td>
				</tr>
				<tr>
					<td>Lugar Accidente</td>
					<td><input type="text" name="lugaraccidente"></td>
				</tr>
				<tr>
					<td>
						<input type="hidden" name="idcliente" value="${datocli.getIdCliente()}" readonly>
						<input type="submit" value="ingresar accidente">
					</td>
				</tr>
			</table>
			</form>
		</c:if>
	</c:if>
	
	
</body>
</html>