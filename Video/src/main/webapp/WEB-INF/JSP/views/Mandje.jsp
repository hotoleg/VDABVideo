<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mandje</title>
</head>
<body>
	<c:import url="/WEB-INF/JSP/widgets/Header.jsp" />

	<table>
		<thead>
			<tr>
				<th>Afbeelding</th>
				<th>Film</th>
				<th>Eenheidsprijs</th>
				<th>Aantal</th>
				<th>Prijs</th>
				<th>Actie</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="bestellijn" items="${bestellijnen}">
				<tr>
					<td>*</td>					
					<td>${ bestellijn.video.titel }</td>
					<td>${ bestellijn.video.omschrijving}</td>
					<td>${ bestellijn.video.prijs}</td>					 
					<td>${ bestellijn.aantal}</td>
					<td>${ bestellijn.prijs}</td>
					<td>+ - x</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>