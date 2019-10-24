<%-- 
    Document   : success
    Created on : 17 Feb, 2019, 1:27:47 PM
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
        <h1>Login successful!</h1>
        <%
            response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
            response.setHeader("Pragma", "no-cache");
            
            if(session.getAttribute("uname1")==null)
            {
                response.sendRedirect("index.html");
            }
            
            else{
                 out.println("hi there "+session.getAttribute("uname1"));
            }
        %>
            <form action="Logout.jsp">
                <input type="submit" value="Logout">
                
            </form>
            
    </body>
</html>
