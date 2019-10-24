<%-- 
    Document   : index
    Created on : 10 Mar, 2019, 1:16:08 PM
    Author     : Chanpreet
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.*,java.io.*, java.sql.*" %>
<%@page import="javax.servlet.http.*,javax.servlet.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>jstl crud</title>
    </head>
    <body>
        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
                           url="jdbc:mysql://localhost:3306/jspcrud"
                           user="root"
                           password="root"
                           />
        <sql:query dataSource="${db}" var="rs">
            select * from table1;
        </sql:query>
        <table border="1" width="100%">
            <tr>
                
                <th>Name</th>
                <th>Password</th>
                <th>Email</th>
                <th>Country</th>
            </tr>
            <c:forEach var="table" items="${rs.rows}" >
                <tr>
                    
                    <td><c:out value="${table.name}"/></td>
                    <td><c:out value="${table.password}"/></td>
                    <td><c:out value="${table.email}"/></td>
                    <td><c:out value="${table.country}"/></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
s