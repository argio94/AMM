<%-- 
    Document   : venditore
    Created on : 21-apr-2016, 18.24.24
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Venditore</title>
        <meta name="keywords" content="HTML, AMM, Milestone1">
        <meta name="description" content="Prima milestone del corso di Amministrazione di Sistema ">
        <meta name="author" content="Alessandro Argiolas">
        <meta http-equiv="refresh" content="120">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="/AmmMilestone/M3/style.css" rel="stylesheet" type="text/css" media="screen"/>
    </head>
    <body>
        <div id="header">
        </div>
        <div id="content">
            
            <jsp:include page="venditore_input.jsp" />
            
            <form method="post" action="AmmMilestone/venditore.html">
                <div>
                        <label for="Nome">Nome dell'oggetto</label>
                            <input type="text" name="Nome" id="Nome">
                        <label for="URL">URL dell'oggetto</label>
                            <input type="url" name="URL" id="URL">
                        <label id="Descrizione" for="Descrizione">Descrizione</label>
                            <textarea rows="5" cols="20"
                                      name="Descrizione" id="Descrizione">
                                      Descrizione dell'oggetto
                            </textarea>
                        <label for="Prezzo">Prezzo</label>
                            <input type="number" name="Prezzo" id="Prezzo">
                        <label for="Quantità">Quantità</label>
                            <input type="number" name="Quantità" id="Quantità">
                            
                            <div id="button">
                        <input type="submit" value="Invia">
                        <input type="reset" value="Cancella">
                            </div>
                </div>
            </form>
        </div>
        <hr/>
        <div id="sidebar">
            <h3>Collegamenti</h3>
            <a href="/AmmMilestone/M3/descrizione.jsp">Descrizione</a>
            <a href="/AmmMilestone/login.html">Login</a>
        </div>
        <div id="footer">
            
        </div>
    </body>
</html>


