<%-- 
    Document   : newUser
    Created on : 9 Mar, 2019, 12:59:50 PM
    Author     : Chanpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="package1.*" %>
<jsp:useBean id="u" class="package1.Employee"></jsp:useBean>
<jsp:setProperty name="u" property="*"></jsp:setProperty>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New User jsp page</title>
    </head>
    <body>
        <%
            int i=EmployeeDao.save(u);
            if(i>0)
            {
                response.sendRedirect("success.jsp");
            }
            else
            {
                response.sendRedirect("eror.jsp");
            }
        %>
    </body>
</html>
