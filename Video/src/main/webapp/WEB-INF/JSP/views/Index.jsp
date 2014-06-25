<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Video</title>
</head>
<body align="center">
	<h1>Hello Video</h1>
	<form methode="get" action="start">
		<div>
			Voer uw klantenkaart in. <br /> <input id='klantennummer'
				name='klantennummer' type='text' value='000-000000-00000'></input>
		</div>
		<br />
		<div>
			Geef uw pincode <br /> <input id='pincode' name='pincode'
				type='password' />
		</div>
		<input type="submit" value="Begin">
	</form>
	<div style="margin-left:300px">
		<div align="left" style="background-color: aqua;">
			<p>Deze applicatie is volop in ontwikkeling. Uw opdracht, als u
				kiest deze te aanvaarden, is om deze zo volledig mogelijk af te
				werken.</p>
			<p>
			<h2>Stappenplan</h2>
			<h3>Clonen van de repository</h3>
			<ul>
				<li>Je vindt de sourcecode van deze applicatie op <a
					href="https://github.com/StijnVA/VDABVideo/wiki" target="_new">github</a>.
				</li>
				<li>Je neemt hiervan een fork.</li>
				<li>Je cloned jouw fork naar je lokale machine: <i>git
						clone https://github.com/StijnVA/VDABVideo.git</i><br /> Je gebruikt
					hier natuurlijk wel de url van jouw eigen fork!
				</li>
				<li>Je gaat naar de root van het project (VideoVDAB/Video)
				<li>
				<li>Je voert een maven build uit met het volgende commando: <i>mvn
						tomcat7:run</i><br /> Dit deployed de applicatie op een embedded
					tomcatserver. Je kan ook naar een lokale server deployen met <a
					href="http://tomcat.apache.org/maven-plugin-2.0/tomcat7-maven-plugin/deploy-mojo.html">tomcat7:deploy</a><br />
				<li>je kan nu de applicatie lokaal bekijken <a
					href="localhost:8088/Video/">localhost:8088/Video/</a></li>
			</ul>
			<h3>Opzetten van continues integration</h3>
			Op <a href="www.cloudbees.com">cloudbees</a> maak je een applicatie
			aan. Je zet ook een Jenkins build op om deze applicatie automatisch
			te bouwen.
			<p>
		</div>
	</div>
</body>
</html>