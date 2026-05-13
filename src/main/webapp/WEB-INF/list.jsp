<%@ page import="java.util.List" %>
<%@ page import="com.example.intrjee2.Model.Etudiant" %>
<%--
  Created by IntelliJ IDEA.
  User: catb
  Date: 13/05/2026
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        List<Etudiant> etudiants = (List<Etudiant>)request.getAttribute("etudiants");
    %>
    <% for (Etudiant etudiant : etudiants) {%>
    <p><%= etudiant.getNom()%></p>
    <%}%>


    <c:out value="${nom}"/>
    <c:forEach items="${etudiants}" var="etudiant">
        <p> ${etudiant.getEmail()}</p>
    </c:forEach>

    <h1>Bienvenue Page Liste</h1>

    <a href="${pageContext.request.contextPath}/etudiant/">Aller sur la liste</a>

    <a href="${pageContext.request.contextPath}/etudiant/add">
        Aller sur la page d'ajout
    </a>

    <a href="${pageContext.request.contextPath}/etudiant/edit">
        Aller sur la page edit
    </a>

</body>
</html>
