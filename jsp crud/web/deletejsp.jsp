<%-- 
    Document   : deletejsp
    Created on : 10 Mar, 2019, 12:36:53 AM
    Author     : Chanpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="package1.EmployeeDao" %>
<jsp:useBean id="e" class="package1.Employee"></jsp:useBean>
<jsp:setProperty property="*" name="e"></jsp:setProperty>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete JSP page</title>
    </head>
    <body>
        <%
            EmployeeDao.deleteIt(e);
            response.sendRedirect("viewUser.jsp");
        %>
    </body>
</html>
