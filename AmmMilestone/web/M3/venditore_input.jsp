<%-- 
    Document   : venditore_input
    Created on : 27-apr-2016, 14.46.28
    Author     : User
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="inputs" value="${['Nome', 'URL', 'Descrizione', 'Prezzo', 'Quantità']}"/>
    <ul>
        <c:forEach var="input" items="${inputs}">
            <li>${input}</li>
        </c:forEach>
     </ul>