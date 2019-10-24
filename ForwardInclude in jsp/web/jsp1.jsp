<%-- 
    Document   : jsp1
    Created on : 17 Feb, 2019, 12:35:22 PM
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
        String uname=request.getParameter("uname");
        String pass=request.getParameter("pass");
        if(uname.equals("abc") && pass.equals("abc"))
        {
            %><jsp:forward page="success.jsp"></jsp:forward><%
        
        }
        else
        {
            %><h1>Invalid username or password</h1>
            <jsp:include page="index.html"></jsp:include>
            <%
        }
        %>
    </body>
</html>
