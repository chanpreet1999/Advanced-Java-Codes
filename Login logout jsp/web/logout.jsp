<%-- 
    Document   : logout
    Created on : 7 Mar, 2019, 1:11:26 AM
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
            HttpSession s=request.getSession();
            s.invalidate();
        %>
        <jsp:include page="link.html"></jsp:include>
        <h1>Logout Successful!</h1>
    </body>
</html>
