<%-- 
    Document   : login
    Created on : 27-apr-2016, 16.17.59
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
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
            <h1>Login</h1>
        </div>
        <div id="content">
            <form method="post" action="/AmmMilestone/login.html">
                <input type="hidden" name="cmd" value="login">
                <div>
                    <label for="Username">Username</label>
                        <input type="text" name="Username" id="Username">
                    <label for="Password">Password</label>
                        <input type="password" name="Password" id="Password">
                </div>
                <div id="button">
                    <input type="submit" name="Submit" value="Invia">
                    <input type="reset" value="Cancella">
                    <input type="submit" name="Logout" value="Logout">
                </div>
            </form>
        </div>
        <div id="sidebar">
            <h3>Collegamenti</h3>
            <a href="/AmmMilestone/descrizione.html">Descrizione</a>
            <a href="/AmmMilestone/cliente.html">Cliente</a>
            <a href="/AmmMilestone/venditore.html">Venditore</a>
        </div>
        <div id="footer">
        </div>
    </body>
</html>