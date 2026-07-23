<%-- 
    Document   : aula
    Created on : 14 de jul. de 2026, 15:54:43
    Author     : QI
--%>
<%@page language="java"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        
    </head>
    <body>
        <%
            String texto = "Olá mundo!";
            int x = 7;
            int y = 8;
            int soma = x + y;
            int maior;
            if(x>y){
              maior = x;
            }else{
              maior = y;
            }
        %>   
        <h1><%=texto %></h1>
        <p class="p-3 mb-2 bg-warning text-dark">Valor de x: <%=x %></p>
        <p class="p-3 mb-2 bg-success text-white">Valor de y: <%=y %></p>
        <P class="p-3 mb-2 bg-warning text-dark">Soma: <%=soma %></p>
        <P class="p-3 mb-2 bg-success text-white">Maior: <%=maior %></p>
    </body>
</html>