<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Video</title>
</head>
<body>
	<c:import url="/WEB-INF/JSP/widgets/Header.jsp" />
	<div>
		<H2>Onze sugesties</H2>
	</div>
	<div>
		<h2>Zoeken per genre</h2>
		<c:import url="/WEB-INF/JSP/widgets/GenreMenu.jsp" />
	</div>
	<div>
		<h2>Zoeken</h2>
		<c:import url="/WEB-INF/JSP/widgets/Zoeken.jsp">
			<c:param name="soort" value="eenvoudig" />
		</c:import>
		
	</div>

</body>
</html>