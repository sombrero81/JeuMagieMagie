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
            <form:form action="/wait">
                <label>Veuillez saisir votre pseudo</label>
                <input name="pseudo" type="text" />
                
                <br/>
                <br/>
                <br/>
                
                <label>Veuillez choisir votre avatar</label>
                
                <c:forEach items="${avatars}" var="avatar">
                    
                    <img src="${avatar.src}" />
                    <form:radiobutton path="$(avatar.id)" value="$(avatar.url)" /> $(avatar.name)
                    <br/>
                </c:forEach>
                
                <br/>
                <br/>
                
                <input name="join" type="submit" value="Rejoindre la partie !!!" />
            </form:form>
                
        </div>
            
        
    </body>
</html>
