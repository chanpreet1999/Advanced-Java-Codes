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

/**
 *
 * @author Chanpreet
 */
public class EditServlet2 extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        String sid = request.getParameter("id");
        int id=Integer.parseInt(sid);
        
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        String email=request.getParameter("email");
        String country=request.getParameter("country");
        
        Emp e=new Emp();
        e.setName(name);
        e.setPassword(password);
        e.setId(id);
        e.setEmail(email);
        e.setCountry(country);
        
        int status=EmpDao.update(e);
        if(status>0)
        {
            response.sendRedirect("ViewServlet");
        }
        else
        {
        
            out.print("Record not updated");
        }
        out.close();
    }

   

}
