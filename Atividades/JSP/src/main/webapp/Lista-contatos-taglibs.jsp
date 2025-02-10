<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TagLibs</title>
</head>
<body>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@ page import="java.util.*" %>
    
	<jsp:useBean id="dao" class="br.edu.ifsp.spo.lp2a4.dao.ContatoDao"/>  
      
    <c:import url="Header.jsp"/>
	
	<c:if test="${not empty dao.banco}">
	<c:forEach items="${dao.banco}" var="banco">
		<br/>
			<td>${banco.value}</td>
		<br/>
	</c:forEach>
	</c:if>
	
	<c:if test="${empty dao.banco}">
		<h3>Nenhum Contato Adicionado!</h3> 
		<a href=\LP2-Maven-JSP/Adiciona-contatos.html><button>Adicionar Contatos</button></a>
		<br/>
	</c:if>
	
	<br/>
	<c:import url="Footer.jsp"/>
</body>
</html>





