<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<ul>
	<c:forEach var="f" items="${films}">
	<!-- zet de film op de request. Zo kan deze ook benaderd worden in de geïncludeerde pagina's -->
	<c:set scope="request" var="film" value="${f}"/>
	<li>
		<div class="filmContainer" >
			<jsp:include page="/WEB-INF/JSP/widgets/FilmDetails.jsp" >
				<jsp:param name="size" value="medium" />			
			</jsp:include>			
		</div>	
	</li>
	</c:forEach>
</ul>
