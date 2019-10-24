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
public class Servlet1 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
       String uname= request.getParameter("uname");
        String pass=request.getParameter("pass");
        
        if(uname.equals("abc")&& pass.equals("abc"))
        {
            out.print("Welcome Mr"+uname);
            Cookie ck=new Cookie("uname1",uname);
            response.addCookie(ck);
            request.getRequestDispatcher("Servlet2").forward(request, response);
        }
        else
        {
            out.println("Wrong id or password!");
            request.getRequestDispatcher("index.html").include(request, response);
            
        }
    }


}
