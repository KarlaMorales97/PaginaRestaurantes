<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br>
	&nbsp&nbsp&nbsp&nbsp<input type="button" class="btn btn-info btn-lg" value="SALIR" onclick="location.href='${pageContext.request.contextPath}/'"/>
	<h1 class="text-center text-white">BIENVENIDO USUARIO ADMINISTRADOR</h1><br><br>
	<table class="table table-dark">
		<tr>
			<th>Nombre sucursal</th>
			<th>Registrar sucursal</th>
			<th>Ver perfil</th>
			<th>Editar</th>
			<th>Eliminar</th>
		</tr>
		
			<c:forEach items="${sucursales}" var="sucursal">
				<tr>				
					<td>${sucursal.nombre}</td>
					
				</tr>	
			</c:forEach>
	</table>

</body>
</html>