<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<c:set var="cp" value="${pageContext.servletContext.contextPath}" />

<header>
 
 <div>
 	[Flashy logo]
 </div>
 
 <h1>Video "Indrukwekkende naam"</h1>
<!-- TODO: afmelden gaat niet enkel terug naar het begingscherm. Het meld effectief de huidige gebruiker af. -->
<a href="${cp}">Afmelden</a>
<a href="${cp}/start">Start</a>
<a href="${cp}/zoeken?soort=complex">Zoeken</a>

<c:import url="/WEB-INF/JSP/widgets/Mandje.jsp"></c:import> 	
	
</header>
