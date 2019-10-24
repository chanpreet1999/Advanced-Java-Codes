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
public class Servlet4 extends HttpServlet {

  
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    response.setContentType("text/html");
    PrintWriter out=response.getWriter();
    
    HttpSession session=request.getSession(false);
    out.println("Maximum interaction time of the session:"+session.getMaxInactiveInterval());
    out.println("Creation time of the session:"+session.getCreationTime());
    out.print("Session id:"+session.getId());
    
    
    
    }


}
