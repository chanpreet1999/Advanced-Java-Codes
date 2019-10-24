<%-- 
    Document   : jsp4
    Created on : 5 Mar, 2019, 10:11:07 PM
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
        <h1>Jsp redirect from file jsp3</h1>
        <%
        int id=Integer.parseInt(request.getParameter("id"));
         out.print("the id passed is :"+id);
         out.println("Well the name passed from session attribute is:"+(String)session.getAttribute("user"));
        
        %>
        <br>
        <h4>Cookies</h4>
        <%
         out.print("just the last one cookies");
         Cookie ck[]=request.getCookies();
         out.println("The data passed by cookies is :"+ck[0].getValue());
        %>
        
    </body>
</html>
