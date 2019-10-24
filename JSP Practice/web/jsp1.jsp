<%-- 
    Document   : jsp1
    Created on : 16 Feb, 2019, 7:04:33 PM
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
            out.println("This is an example of session in jsp");
            String uname=request.getParameter("uname");
            out.println("Welcome "+uname);
            session.setAttribute("name", uname);
            
        %>
        <a href="jsp2.jsp">click here</a>
    </body>
</html>
