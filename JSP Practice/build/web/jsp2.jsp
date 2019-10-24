<%-- 
    Document   : jsp2
    Created on : 16 Feb, 2019, 7:34:18 PM
    Author     : Chanpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Session example in jsp</h1>
        <%
            String name = (String)session.getAttribute("name");
            out.println("Welcome to 2nd jsp page "+name);
        %>
    </body>
</html>
