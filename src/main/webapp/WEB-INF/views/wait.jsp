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
        <title>Waiting Page</title>
        <link href="CSS/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1> Magie Magie </h1>
        <br>

        <c:set var="route">
            <spring:url value="/wait"/>
        </c:set>
        
        <input name="boutonGame" type="submit" value="Commencez la partie !" />
        
        <br>
        <h1> -- Liste des joueurs -- </h1>
        <br>
        <br>
        <div>
            <c:forEach items="${players}" var="player">

                Pseudo : ${player.pseudo}


                <br>
            </c:forEach> 

        </div>
    </body>
</html>
