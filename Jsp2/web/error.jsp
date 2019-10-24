<%-- 
    Document   : error
    Created on : 17 Feb, 2019, 12:12:18 PM
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
        <%@page isErrorPage="true" %>
        <h1>Error Encountered</h1>
        Exception is <%=exception %>
    </body>
</html>
