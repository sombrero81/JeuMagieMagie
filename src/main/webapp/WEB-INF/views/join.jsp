<%-- 
    Document   : join
    Created on : 19 oct. 2016, 10:10:41
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Joindre la partie</title>
    </head>
    <body>
        <h1>magie magie!</h1>
        
        <div>
            <form:form action="/">
                <label>Veuillez saisir votre pseudo</label>
                <input name="pseudo" type="text" />
                
                <label>Veuillez choisir votre avatar</label>
                
                <c:forEach items="${avats}" var="avat">
                    
                    <img src="${avat.src}" />
                    <form:radiobutton path="$(avat.id)" value="$(avat.url)" /> $(avat.name)
                    <br/>
                </c:forEach>                
                
                <input name="join" type="submit" value="Rejoindre la partie !!!" />
            </form:form>
                
        </div>
            
        
    </body>
</html>
