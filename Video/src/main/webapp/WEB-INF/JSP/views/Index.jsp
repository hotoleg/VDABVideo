<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>Video</title>
	</head>
	<body align="center">
		<h1>Hello Video</h1>
		<form methode="get" action="start" >
		<div>
			Voer uw klantenkaart in. <br />
			<input id='klantennummer' name='klantennummer' type='text' value='000-000000-00000' ></input>
			</div>
			<br />
			<div>
			Geef uw pincode <br />
			<input id='pincode' name='pincode' type='password' />
			</div>
			<input type="submit" value="Begin">		
		</form>
	</body>
</html>