<%-- 
    Document   : jsp1
    Created on : 16 Feb, 2019, 12:30:25 PM
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
        <h1>Hello World!</h1>
        
        <%!
        String d;
    %>
        <%
            int a=Integer.parseInt(request.getParameter("val1"));
            int b=Integer.parseInt(request.getParameter("val2"));
            int c=a+b;
             d=String.valueOf(c);
            
        %>
        <%= 
                "<input type='text' value='"+d+"'>"
                %>
            
    </body>
</html>
