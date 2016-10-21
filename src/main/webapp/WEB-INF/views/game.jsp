<%-- 
    Document   : wait
    Created on : 20 oct. 2016, 11:44:04
    Author     : Ayo Boo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Game Page</title>
        <link href="<spring:url value="/CSS/style.css"/>" rel="stylesheet" type="text/css"/> 
        <script src="<spring:url value="/JS/jquery-3.1.1.js"/>" type="text/javascript"></script>
        <script src="<spring:url value="/JS/game.js"/>" type="text/javascript"></script>
    </head>
    <body>
        <h1> Magie Magie </h1>
        <br>

        <br>

        <c:set var="route">
            <spring:url value="/game"/>
        </c:set>

        <input name="boutonLancer" type="submit" value="lancer un sort" />
        <br>
        <input name="boutonPasser" type="submit" value="passer son tour" />
        <br>
        <div id="listeCartes"></div>
        <div>
            <c:forEach items="${cards}" var="card">

                Carte disponible : ${card.typecarte}

                <br>
            </c:forEach> 

        </div>
    </body>
</html>
