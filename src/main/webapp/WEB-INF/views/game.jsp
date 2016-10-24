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
        <form:form modelAttribute="dto">
            Joueur Cible : 
            <form:select items="${victimes}" itemLabel="pseudo" itemValue="id" path="idVictime"/>
              
            Sort :
            <form:select path="typeSort">
                <c:forEach items="${sorts}" var="sort">
                    <form:option value="${sort}"/>
                </c:forEach>
            </form:select>
            <br>
            <input name="boutonLancer" type="submit" value="Lancer Un Sort" />
        </form:form>
        
        <br>
        <input name="boutonPasser" type="submit" value="Passer Son Tour" />
        <div id="listeCartes"></div>
        <div>
            <c:forEach items="${cards}" var="card">

                Cartes Disponibles : ${card.typecarte}

            </c:forEach> 

        </div>
    </body>
</html>
