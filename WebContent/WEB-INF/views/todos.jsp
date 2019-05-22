<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>    
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todos los Libros</title>
</head>
<body>

<h3>Hay ${cantLibros} libros en existencia, de ${numAutores} autores
diferentes</h3>

	<table>
		<tr>
			<th>ISBN</th>
			<th>Autor</th>
			<th>Titulo</th>
			<th>Género</th>
			<th>Cantidad</th>
		</tr>
			<c:forEach items="${libros}" var="libros">
				<tr>
					<td>${libros.isbn}</td>
					<td>${libros.autor}</td>
					<td>${libros.titulo}</td>
					<td>${libros.genero}</td>
					<td>${libros.cantidad}</td>
				</tr>	
			</c:forEach>
	</table>
	
	<form action="${pageContext.request.contextPath}/" method = "post">
	<input type="submit" value = "Regresar">
	</form>
</body>
</html>