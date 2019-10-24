<%-- 
    Document   : editjsp2
    Created on : 9 Mar, 2019, 11:13:50 PM
    Author     : Chanpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="package1.*" %>
<jsp:useBean id="e" class="package1.Employee"></jsp:useBean>
<jsp:setProperty property="*" name="e"></jsp:setProperty>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit jsp 2</title>
    </head>
    <body>
        <%
            EmployeeDao.update(e);
            System.out.println("===editjsp2======"+e);
            response.sendRedirect("viewUser.jsp");
        %>
    </body>
</html>
