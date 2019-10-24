/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Chanpreet
 */
@WebServlet(name = "SaveServlet", urlPatterns = {"/SaveServlet"})
public class SaveServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
            
            String name=request.getParameter("uname");
            String password=request.getParameter("pass");
            String email=request.getParameter("email");
            String country=request.getParameter("country");
            
            Emp e=new Emp();
            e.setName(name);
            e.setPassword(password);
            e.setEmail(email);
            e.setCountry(country);
            
            int status=EmpDao.save(e);
            if(status>0){
                out.println("Record saved ");
                request.getRequestDispatcher("index.html").include(request, response);
            }
            
            else {
                out.println("Error record not saved!");
            request.getRequestDispatcher("index.html").include(request, response);
            }
        out.close();
        } 
        
        catch (Exception ex) {
System.out.println(ex);
        }
        
    }

  
}
