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
	<a href="GestionarMejora">Volver</a>
	<hr>
	<c:if test="${ccmensaje == null}">
		<h1>Ingresar Mejora para ${nomcli}</h1>
	</c:if>
	<c:if test="${ccmensaje != null}">
		<h3><c:out value="${ccmensaje}"></c:out></h3>
	</c:if>
	
	<c:if test="${ccmensaje == null}">
		<form method="post" action="AgregarMejora">
		<table>
			<tr>
				<td>
					Fecha:
				</td>
				<td>
					<input type="text" name="fecha"><br>
				</td>
			</tr>
			<tr>
				<td>
					Motivo: 
				</td>
				<td>
					<input type="text" name="motivo" /><br/>						
				</td>
			</tr>
			<tr>
				<td>
					Actividad: 
				</td>
				<td>
					<input type="text" name="actividad" /><br/>
				</td>
			</tr>		
			<tr>
				<td>
					Estado: 
				</td>
				<td>
					<select name ="estado">
						<option>En Curso</option>
						<option>Pendiente</option>
						<option>Finalizada</option>
						<option>No Iniciada</option>
					</select>
					<!-- <input type="text" name="estado" /><br/> -->
				</td>
			</tr>
			<tr>
				<td>
					<input type="hidden" name="idcliente" value="${idcli}" readonly>
					<input type="submit" value="Ingresar Mejora" />
				</td>
			</tr>
		</table>
		</form>
	</c:if>

</body>
</html>