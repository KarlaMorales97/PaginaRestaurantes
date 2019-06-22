<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<br> 
	&nbsp&nbsp&nbsp&nbsp<input type="button" class="btn btn-info btn-lg" value="REGRESAR" onclick="location.href='${pageContext.request.contextPath}/regresarAdministrador'"/>
	<h1 class="text-center text-white">Sucursal ${sucursalEncontrada.nombre}</h1>
	<br><br>
	
	<div class="d-flex container justify-content-center">
		<div>
		   <div class="d-flex justify-content-center bg-gradient-success" style="padding:1em">
				<h3 class="text-center text-white">Horario de apertura:&nbsp&nbsp</h3><h2 class="text-center text-white"><b>${sucursalEncontrada.horarioApertura}</b></h2><br>
			</div>
			<div class="d-flex justify-content-center bg-gradient-secondary" style="padding:1em">
				<h3 class="text-center text-white">Horario de cierre:&nbsp&nbsp</h3><h2 class="text-center text-white"><b>${sucursalEncontrada.horarioCierre}</b></h2><br>
			</div>
			<div class="d-flex justify-content-center bg-gradient-success" style="padding:1em">
				<h3 class="text-center text-white">Ubicaci&oacuten:&nbsp&nbsp</h3><h2 class="text-center text-white"><b>${sucursalEncontrada.ubicacion}</b></h2><br>
			</div>	
			<div class="d-flex justify-content-center bg-gradient-secondary" style="padding:1em">
				<h3 class="text-center text-white">N&uacutemero de mesas:&nbsp&nbsp</h3><h2 class="text-center text-white"><b>${sucursalEncontrada.nMesas}</b></h2><br>
			</div>
			<div class="d-flex justify-content-center bg-gradient-success" style="padding:1em">
				<h3 class="text-center text-white">Nombre del gerente:&nbsp&nbsp</h3><h2 class="text-center text-white"><b>${sucursalEncontrada.nomGerente}</b></h2><br>

			</div>
		</div>
	</div>
	<br><br><h2 class="text-center text-secondary"><b>Lista de empleados</b></h2></div>
	<input type="button" style="width:70%" class="btn btn-outline-light btn-lg btn-space d-flex container justify-content-center" value="Registrar empleado" onclick="location.href='${pageContext.request.contextPath}/registrarEmpleado?codigoSucursal=${sucursalEncontrada.codigoSucursal}'"><br>
	
	<table class="table table-dark d-flex container justify-content-center" style="width:70%">
		<tr>
			<th>Nombre empleado</th>
			<th>Edad empleado</th>
			<th>Genero empleado</th>
			<th>Estado</th>
			<th>Editar empleado</th>
			<th>Eliminar empleado</th>
		</tr>
		
			<c:forEach items="${sucursalEncontrada.empleados}" var="empleado">
				<tr>				
					<td>${empleado.nombre}</td>
					<td class="text-center">${empleado.edad}</td>
					<td class="text-center">${empleado.genero}</td>
					<td class="text-center">${empleado.estadoDelegate}</td>
					<td><input type="button" class="btn btn-outline-light" value="Editar empleado"
					onclick="location.href='${pageContext.request.contextPath}/editarEmpleado?codigoEmpleado=${empleado.codigoEmpleado}'"></td>
					<td><input type="button" class="btn btn-outline-light" value="Eliminar empleado"
					onclick="location.href='${pageContext.request.contextPath}/eliminarEmpleado?codigoEmpleado=${empleado.codigoEmpleado}'"></td>
				</tr>	
			</c:forEach>
		</table>	
</body>
</html>