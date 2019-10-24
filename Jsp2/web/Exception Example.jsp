<%-- 
    Document   : Exception Example
    Created on : 17 Feb, 2019, 12:05:45 PM
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
        <h1>Exceptipn Example</h1>
        <%@page errorPage="error.jsp"%>
        <%
            double a=Double.parseDouble(request.getParameter("val1"));
            double b=Double.parseDouble(request.getParameter("val2"));
            double c=a/b;
            out.println("division is="+c);
        
        %>
    </body>
</html>
