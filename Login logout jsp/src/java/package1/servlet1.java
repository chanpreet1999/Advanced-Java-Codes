/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Chanpreet
 */
public class servlet1 extends HttpServlet {

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        String uname=request.getParameter("uname");
        String pass=request.getParameter("pass");
        if(uname.equals("abc") && pass.equals("abc"))
        {
            HttpSession session=request.getSession();
            session.setAttribute("uname", uname);
            response.sendRedirect("profile.jsp");
        }
        else
        {
          out.println("Wrong username or password");
          request.getRequestDispatcher("index.html").include(request, response);
        }
    }

}
