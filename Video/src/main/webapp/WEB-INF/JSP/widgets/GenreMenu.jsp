<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<c:set var="cp" value="${pageContext.servletContext.contextPath}" />

<style>
li {
	float: left;
	padding-right: 20px
}
</style>


<div>
	<!--  
	TIP: 
		Open the Preferences (Window->Preferences) and select General->Editors->Structured Text Edit->Task Tags.
		From there you can mark the "Enable searching for Task Tags" setting. Please be sure JSP is active in the Filters tab.
	 -->

	<!-- TODO: Deze lijst hoort uiteraard dynamisch te worden opgebouwd. -->
	<ul>	
		<li><a href="${cp}/genres/?genre=Actie" >Actie</li>
		<li><a href="${cp}/genres/?genre=Avontuur" >Avontuur</a></li>
		<li><a href="${cp}/genres/?genre=SF" >SF</a></li>
	</ul>
	<!-- TODO: Quickfix om te voorkomen dat de float in het menu hierboven volgende items overlapt. -->
	<br />
</div>