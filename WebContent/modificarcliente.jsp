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
	<a href="ListarClientes">Volver</a>
	<hr>
	<h1>Modificar cliente</h1>
	<c:if test="${txt != null}">
		<h3><c:out value="${txt}"></c:out></h3>
	</c:if>
	
	<form method="post" action="ModificarCliente">
		<table>
			<tr>
				<td>
					Nombre: 
				</td>
				<td>
					<input type="text" name="nombre" value="${regcli.getNombreCliente()}"/><br/>
				</td>
			</tr>
			<tr>
				<td>
					Telefono: 
				</td>
				<td>
					<input type="text" name="telefono" value="${regcli.getTelefonoCliente()}"/><br/>
				</td>
			</tr>
			<tr>
				<td>
					Correo electrónico: 
				</td>
				<td>
					<input type="text" name="correo" value="${regcli.getEmailCliente()}"/><br/>
				</td>
			</tr>
			<tr>
				<td>
					Rubro: 
				</td>
				<td>
					<input type="text" name="rubro" value="${regcli.getRubroCliente()}"/><br/>
				</td>
			</tr>
			<tr>
				<td>
					Dirección: 
				</td>
				<td>
					<input type="text" name="direccion" value="${regcli.getDireccionCliente()}"/><br/>
					<input type="hidden" name="idcliente" value="${regcli.getIdCliente()}"/>
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="Modificar" />
				</td>
			</tr>
		</table>
	</form>

</body>
</html>