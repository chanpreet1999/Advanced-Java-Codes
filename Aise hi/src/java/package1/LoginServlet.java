/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Chanpreet
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        String uname=request.getParameter("uname");
        String pass=request.getParameter("pass");
        
        request.getRequestDispatcher("index.html").include(request, response);
        
        if(uname.equals("xyz")&& pass.equals("xyz"))
        {
            out.println("<h3>LOGIN SUCCESSFUL</h3>");
            out.println("Welcome "+uname);
            Cookie ck=new Cookie("uname1",uname);
            response.addCookie(ck);
        }
        else
        {
            out.println("Wrong Details");
            request.getRequestDispatcher("Login.html").include(request, response);
        }
    
    
    
    }


}
