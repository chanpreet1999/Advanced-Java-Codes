<%-- 
    Document   : Login
    Created on : 17 Feb, 2019, 1:07:32 PM
    Author     : Chanpreet
--%>

<%@page import="java.sql.*"%>
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
            boolean status=false;
            String query="select * from table1 where username='"+uname+"' and password='"+pass+"'";
            try{
                
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            
            status=rs.next();
           if(status)
           {
               session.setAttribute("uname1", uname);
               response.sendRedirect("success.jsp");
           }
           else
           {    
               %>
               
               <h1>Invalid username or password</h1>
               <jsp:include page="index.html"></jsp:include>
               
               
               <%
           }
            }catch(Exception exp){System.out.println("Error "+exp);}
        %>
    </body>
</html>
