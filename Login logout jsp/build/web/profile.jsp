<%-- 
    Document   : profile
    Created on : 6 Mar, 2019, 6:00:10 PM
    Author     : Chanpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Page</title>
    </head>
    <body>
        <jsp:include page="link.html"></jsp:include>
        <h1>
        <%
            HttpSession s=request.getSession(false);
            if(s!=null){
            String uname=(String)s.getAttribute("uname");
        %>
         
          <%
            out.print("Welcome to your profile "+uname);
            }
            
            else
            {
                out.print("Please login first");
              
          %>
          <jsp:include page="index.html"></jsp:include>
          <%
            }
          %>
        </h1>
          
    </body>
</html>
