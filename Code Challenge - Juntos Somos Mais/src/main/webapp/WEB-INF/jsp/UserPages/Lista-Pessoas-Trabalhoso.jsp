<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="css/Style.css" var="yourStyleCSS"></spring:url>
<%@ page import="java.util.*"%>
<%@ page import="java.sql.*"%>
<%@ page import="br.edu.ifsp.spo.lp2a4.spring.repository.PessoaRepository"%>
<%@ page import="br.edu.ifsp.spo.lp2a4.spring.model.Results"%>
<%@ page import="br.edu.ifsp.spo.lp2a4.spring.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id="dao" class="br.edu.ifsp.spo.lp2a4.spring.dao.PessoaDao" />
<!DOCTYPE html>
<html>
<head>
<script>
function checkRegion(){
	if(document.getElementById('norte').checked) {
		location.href = "http://localhost:8080/spring/regionNorte";
	}
	if(document.getElementById('centro-oeste').checked) {
		location.href = "http://localhost:8080/spring/regionCentroOeste";
	}
	if(document.getElementById('nordeste').checked) {
		location.href = "http://localhost:8080/spring/regionNordeste";
	}
	if(document.getElementById('sudeste').checked) {
		location.href = "http://localhost:8080/spring/regionSudeste";
	}
	if(document.getElementById('sul').checked) {
		location.href = "http://localhost:8080/spring/regionSul";
	}
}

function checkUser(){
	if(document.getElementById('Especial').checked) {
		location.href = "http://localhost:8080/spring/UserEspecial";
	}
	if(document.getElementById('Normal').checked) {
		location.href = "http://localhost:8080/spring/UserNormal";
	}
}

function checkMainPage(){
	location.href = "http://localhost:8080/spring/MainPage";
}
</script>
<link rel="stylesheet" type="text/css" href="${yourStyleCSS}">
<meta charset="UTF-8">
<title>Lista de Pessoas Trabalhoso</title>
</head>
<body>
	<div class="Header">
	<c:import url="Header.jsp" />
	</div>
	<div class="container">
		<div class="container-size">
			<div class="left-box">
				<div class="filters">
					<p>
						<strong>Filtrar por usuário:</strong>
					</p>

					<div class="inputs">
						<input class="radio" type="radio" name="filter" id="Especial" onclick="checkUser()"></input>
						<label for="Especial">Especial</label>
					</div>

					<div class="inputs">
						<input class="radio" type="radio" name="filter" id="Normal" onclick="checkUser()"></input> <label
							for="Normal">Normal</label>
					</div>

					<div class="inputs">
						<input class="radio" type="radio" name="filter" id="Trabalhoso" checked></input> <label
							for="Trabalhoso">Trabalhoso</label>
					</div>

				</div>
				<div class="filters">
					<p>
						<strong>Filtrar por Região:</strong>
					</p>

					<div class="inputs">
						<input class="radio" type="radio" name="filter" id="norte" onclick="checkRegion()"></input> <label
							for="norte">Norte</label>
					</div>

					<div class="inputs">
						<input class="radio" type="radio" name="filter" id="nordeste" onclick="checkRegion()"></input> <label
							for="nordeste">Nordeste</label>
					</div>

					<div class="inputs">
						<input class="radio" type="radio" name="filter" id="centro-oeste" onclick="checkRegion()"></input> <label
							for="centro-oeste">Centro-Oeste</label>
					</div>

					<div class="inputs">
						<input class="radio" type="radio" name="filter" id="sudeste" onclick="checkRegion()"></input> <label
							for="sudeste">Sudeste</label>
					</div>

					<div class="inputs">
						<input class="radio" type="radio" name="filter" id="sul" onclick="checkRegion()"></input> <label
							for="sul">Sul</label>
					</div>
				</div>
				<div class="filters">
					<div class="inputs">
						<input class="radio" type="radio" name="filter" id="mainPage" onclick="checkMainPage()"></input> <label
							for="norte">Pagina Inicial</label>
					</div>
				</div>
			</div>
			<div class="right-box">
				<!-- Repete tudo -->
				<c:forEach var="listpicture" items="${listpicture}" varStatus="status">
					<c:if test="${listcoordinates[status.index].longitude <= '-15.196998'}">
					<c:if test="${listcoordinates[status.index].longitude <= '-30.411580'}">
					<c:if test="${listcoordinates[status.index].latitude >= '20.361899'}">
					<c:if test="${listcoordinates[status.index].latitude >= '14.276938'}">
					<div class="card">
					<a href="MainPage/${listResults[status.index].id}"><img src="${listpicture.large}"></a>
					<h3>${listname[status.index].first} ${listname[status.index].last}</h3>
					<h3>${listlocation[status.index].street}</h3>
					<h3>${listlocation[status.index].city} , ${listlocation[status.index].state}</h3>
					</div></c:if></c:if></c:if></c:if>
				</c:forEach>
			</div>
		</div>
	</div>
</body>
</html>