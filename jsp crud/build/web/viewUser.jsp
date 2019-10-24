<%-- 
    Document   : viewUser
    Created on : 9 Mar, 2019, 2:01:23 PM
    Author     : Chanpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="package1.EmployeeDao,package1.Employee,java.util.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ViewUser Jsp page</title>
    </head>
    <body>
        <h1>Employee list</h1>
        <%
            List<Employee> list = EmployeeDao.getAllRecords();
            request.setAttribute("list", list);

        %>

        <table border="1" width="100%">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Password</th>
                <th>Email</th>
                <th>Country</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            <c:forEach items="${list}" var="u">
                <tr>
                    <td> ${u.getId()}</td>
                    <td>${u.getName()}</td>
                    <td>${u.getPassword()}</td>
                    <td>${u.getEmail()}</td>
                    <td>${u.getCountry()}</td>
                      <td><a href="editjsp.jsp?id=${u.getId()}">edit</a></td>
                    <td><a href="deletejsp.jsp?id=${u.getId()}">delete</a></td>
                </tr>
            </c:forEach>

        </table>
        <br>
        <a href="userform.html">Add a New Employee</a>
    </body>
</html>
