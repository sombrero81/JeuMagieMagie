<%-- 
    Document   : lister_partie
    Created on : 18 oct. 2016, 16:16:05
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/style.css" rel="stylesheet" type="text/css"/>
        <title>HOME Page</title>
    </head>
    <body>
        <h1> Magie Magie </h1>
        <br>
        <h1> -- Liste des parties -- </h1>
        <br>
        <br>
        <div>
            <c:forEach items="${lesgames}" var="ungame">

                Partie N° :
                ${ungame.id}
                
                <a href="<spring:url value="/"/>join/${ungame.id}">Joindre Partie</a>
                
                <br>
            </c:forEach> 
        
    </body>
</html>
