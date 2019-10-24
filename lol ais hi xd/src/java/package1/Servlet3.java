/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Chanpreet
 */
public class Servlet3 extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out =response.getWriter();
        
        String uname=request.getParameter("uname");
        int pass=Integer.parseInt(request.getParameter("pass"));
        HttpSession session=request.getSession();
        session.setAttribute(uname,uname);
        session.setAttribute(String.valueOf(pass), pass);
        response.sendRedirect("Servlet4");
        
        
    
    }

}
