<%-- 
    Document   : ajax_cartes_joueur_act
    Created on : 21 oct. 2016, 16:02:53
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:forEach items="${cartes}" var="carte">
    <img src="<spring:url value="/"/>${carte.typeCard}" alt="${carte.typeCard}"/>
    &n&nbsp;&n&nbsp;&n&nbsp;
</c:forEach>