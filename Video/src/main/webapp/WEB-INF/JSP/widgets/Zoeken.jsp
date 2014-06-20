<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="cp" value="${pageContext.servletContext.contextPath}" />
<form>
	<c:choose>
		<c:when test="${param.soort=='eenvoudig'}">
	titel: <input id='titel' name='titel' />
			<input type="submit" value="Zoeken"><br/>
			<a href="${cp}/zoeken?soort=complex">Geavanceerd zoeken</a>
		</c:when>
		<c:otherwise>
			Deze manier (${param.soort}) van zoeken is ongeldig.
	</c:otherwise>
	</c:choose>
</form>