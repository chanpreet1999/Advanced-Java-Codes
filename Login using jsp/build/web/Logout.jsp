<%-- 
    Document   : Logout
    Created on : 17 Feb, 2019, 1:39:29 PM
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
        <%
            session.removeAttribute("uname1");
            session.invalidate();
        %>
        <h1>Logout successful</h1>
    </body>
</html>
