<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="film, ${param.size}" >
	<h3>${film.titel}</h3>
	Prijs: ${film.prijs} <br/>
	Genre: ${film.genre} <br/>
	${film.aantalBeschikbareExemplaren} beschikbaar<br />
	<i>${film.omschrijving}</i> 	
</div>