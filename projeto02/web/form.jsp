<%-- 
    Document   : form
    Created on : 16 de jul. de 2026, 15:05:10
    Author     : QI
--%>
<%@page language="java" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulário JSP</title>
        
        
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">

    </head>
    <body>
        <section class="container">
            <h1>Dados do formulário</h1>
            <!-- Pegando os dados do formulário -->
            <%
                String user = request.getParameter("nome");
                String senha = request.getParameter("senha");
                String nomecompleto = request.getParameter("nome completo");
                String idade = request.getParameter("idade");
                String curso = request.getParameter("curso");
                %>
                <p class="text-secundary">
                    <%
                        out.print("Uruário: " + user);
                    %>
                </p>   
                
                <p class="text-secundary">
                    <%
                        out.print("Senha: " + senha);
                    %>
                </p>
                
                <p class="text-secundary">
                    <%
                        out.print("nome completo: " + nomecompleto);
                    %>
                </p>
                
                <p class="text-secundary">
                    <%
                        out.print("idade: " + idade);
                    %>
                </p>
                
                <p class="text-secundary">
                    <%
                        out.print("curso: " + curso);
                    %>
                </p>
                
                <a href="index.html">Voltar</a>
        </section>
    </body>
</html>
