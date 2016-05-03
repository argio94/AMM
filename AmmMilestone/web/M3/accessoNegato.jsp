<%-- 
    Document   : AccessoNegato
    Created on : 3-mag-2016, 16.56.04
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
        <h1>Accesso negato</h1>
        <a href="/AmmMilestone/login.html">Login</a>
    </body>
</html>


if(session.getAttribute("loggedIn").equals(true)) {
                if(request.getParameter("Logout") != null) {
                    session.invalidate();
                }
                else {
                    if(session.getAttribute("Cliente") != null) {
                        request.getRequestDispatcher("/AmmMilestone/cliente.html").forward(request, response);
                    }
                    else {
                        request.getRequestDispatcher("/AmmMilestone/venditore.html").forward(request, response);
                    }
                }
                request.getRequestDispatcher("M3/login.jsp").forward(request, response);
            }