<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
	<h1 class="text-center text-white">ACTUALIZAR SUCURSAL</h1>
	

	<div class="container p-5 ">
		<div class="d-flex justify-content-center h-100 p-3 mb-2 bg-gradient-secondary text-white">
			<form:form action="${pageContext.request.contextPath}/updateDataSucursal?codigoSucursal=${sucursal.codigoSucursal}" method="POST" modelAttribute="sucursal">
			
			    <br>
			    <h4><label>Nombre de sucursal:&nbsp&nbsp</label>
				<form:input  class="redondeadonorelieve col-sm-6" type="text;hidden" name="snombre" path="nombre"/></h4>
				<form:errors path="nombre" class="p-1 mb-2 bg-danger text-white"></form:errors><br><br>
				
				<h4><label>Ubicacion de sucursal:&nbsp&nbsp</label>
				<form:input type="text" class="redondeadonorelieve col-sm-6" name="subicacion" path="ubicacion"/></h4>
				<form:errors path="ubicacion" class="p-1 mb-2 bg-danger text-white"></form:errors><br><br>
				
				<h4><label>Horario de apertura de sucursal:&nbsp&nbsp</label>
				<form:input type="time" class="redondeadonorelieve col-sm-5" name="shorarioApertura" path="horarioApertura"/></h4>
				<form:errors path="horarioApertura" class="p-1 mb-2 bg-danger text-white"></form:errors><br><br>
				
				<h4><label>Horario de cierre de sucursal:&nbsp&nbsp</label>
				<form:input type="time" class="redondeadonorelieve col-sm-5" name="shorarioCierre" path="horarioCierre"/></h4>
				<form:errors path="horarioCierre" class="p-1 mb-2 bg-danger text-white"></form:errors><br><br>
				
				<h4><label>Numero de mesas de sucursal:&nbsp&nbsp</label>
				<form:input type="number" class="redondeadonorelieve col-sm-2" name="snMesas" path="nMesas"/></h4>
				<form:errors path="nMesas" class="p-1 mb-2 bg-danger text-white"></form:errors><br><br>
				
				<h4><label>Nombre del gerente de sucursal:&nbsp&nbsp</label>
				<form:input type="text" name="snomGerente" path="nomGerente"/></h4>
				<form:errors path="nomGerente" class="p-1 mb-2 bg-danger text-white"></form:errors><br><br><br><br>
				
				<input type="submit" class="btn btn-dark btn-lg" value="Actualizar sucursal">
			</form:form>
		</div>	
		<h1 class="p-3 mb-2 bg-dark text-white">${message2}</h1>
	</div>		
</body>
</html>