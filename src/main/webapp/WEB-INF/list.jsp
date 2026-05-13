<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: catb
  Date: 13/05/2026
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String nom = (String)request.getAttribute("noms");
        List<String> emails = (List<String>)request.getAttribute("emails");
    %>
    <p> Le nom est <%= nom %></p>
    <% for (String email : emails) {%>
    <p><%= email%></p>
    <%}%>
<h1>Bienvenue </h1>

</body>
</html>
