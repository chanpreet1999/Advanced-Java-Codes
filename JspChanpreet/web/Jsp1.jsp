<%-- 
    Document   : Jsp1
    Created on : 13 Feb, 2019, 8:34:28 PM
    Author     : Chanpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <h1>Hello World!</h1>
        <h3>Declaration tag</h3>
       <br>Current time: 
       <%=      
               java.util.Calendar.getInstance().getTime() 
       %>
               <br>
               <br><br>
       
               <h3>Scriptlet tag</h3>
    <%      int i=10;
            out.println("Scriptlet tag");
            out.println("This is my first jsp page");
            
            String name=request.getParameter("uname");
            int age=Integer.parseInt(request.getParameter("age"));
            out.println("Your name :"+name+" Your age:"+age);
            
            out.println("Calling a function now Cube of 3 is:"+cube(3));

            %>
            <br><br>
               <br>
            
            
            
   <%!         int cube(int n)
                {
                return n*n*n;
                }
            %>
    

