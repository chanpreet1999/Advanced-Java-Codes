<%-- 
    Document   : editjsp
    Created on : 9 Mar, 2019, 10:24:54 PM
    Author     : Chanpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="package1.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit jsp Page</title>
    </head>
    <body>
        <h1>Edit a record</h1>
        <%
            String id = request.getParameter("id");
            Employee e = EmployeeDao.getRecordById(Integer.parseInt(id));
        %>
        
        <form action="editjsp2.jsp">
            <input type="hidden" value="<%= e.getId() %>">
            <table>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name" value="<%=e.getName() %>"></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" value="<%=e.getPassword() %>"></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><input type="email" name="email" value="<%=e.getEmail() %>"></td>
                </tr>
                <tr>
                    <td>Country:</td>
                    <td>
                        <select name="country">
                            <option>India</option>
                            <option>China</option>
                            <option>USA</option>
                        </select>
                    </td>
                </tr>

                <tr>
                    <td></td>
                    <td><input type="submit" name="Edit"></td>
                </tr>

            </table>
        </form> 

    </body>
</html>
