<%-- 
    Document   : jsp3
    Created on : 5 Mar, 2019, 9:43:42 PM
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
        
        <h1>cookies,session</h1>
          
        <%
            out.print("jsp is not used nowadays");
            out.print("well that does not matter");
         %>
            
        <h4>Jsp page chanpreet singh!</h4>
        
        <%="okay this is cool"%>
        
        <%
        String value=request.getParameter("uname");
        session.setAttribute("user", value);
        Cookie ck=new Cookie("user", value);
        response.addCookie(ck);
        
        HttpSession s=request.getSession();
        
        %>
        
        <a href="jsp4.jsp?id=2">2nd jsp page</a>
    </body>
</html>
