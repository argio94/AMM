<%-- 
    Document   : cliente
    Created on : 27-apr-2016, 16.16.03
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cliente</title>
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
            <h1>Lista Tavole</h1>
        </div>
        <div id="content">
            <div id="table">
            <table>
                <tr>
                    <th>Nome</th>
                    <th>Foto</th>
                    <th>Pezzi disponibili</th>
                    <th>Prezzo</th>
                    <th>Metti nel carrello</th>
                </tr>
                    <td>Baker verde pua</td>
                    <td><img title="baker1" alt="Baker verde pua"
                        src="img/baker1.jpg" width="150" height="150"></td>
                    <td>50 disponibili</td>
                    <td>45 €</td>
                    <td><a href="cliente.html">Acquista</a></td>
                </tr>
                <tr class="even">
                    <td>Baker Reynolds blue</td>
                    <td><img title="baker2" alt="Baker Reynolds blue"
                        src="img/baker2.jpg" width="150" height="150"></td>
                    <td>30 disponibili</td>
                    <td>50 €</td>
                    <td><a href="cliente.html">Acquista</a></td>
                </tr>
                <tr>
                    <td>Blind rossa bianca</td>
                    <td><img title="blind1" alt="Blind rossa bianca"
                        src="img/blind1.jpg" width="150" height="150"></td>
                    <td>20 disponibili</td>
                    <td>45 €</td>
                    <td><a href="cliente.html">Acquista</a></td>
                </tr>
                <tr class="even">
                    <td>Element Mark rossa</td>
                    <td><img title="element1" alt="Element Mark rossa"
                        src="img/element1.jpg" width="150" height="150"></td>
                    <td>0 disponibili</td>
                    <td>50 €</td>
                    <td><a href="cliente.html">Acquista</a></td>
                </tr>
                <tr>
                    <td>PlanB bianca verde</td>
                    <td><img title="planb1" alt="PlanB bianca verde"
                        src="img/planb1.jpg" width="150" height="150"></td>
                    <td>25 disponibili</td>
                    <td>45 €</td>
                    <td><a href="cliente.html">Acquista</a></td>
                </tr>
            </table>    
            </div>
        </div>
        <div id="sidebar">
            <h3>Collegamenti</h3>
            <a href="/AmmMilestone/M3/descrizione.jsp">Descrizione</a>
            <a href="/AmmMilestone/login.html">Login</a>
        </div>
        
        <div id="footer">
        </div>
    </body>
</html>


