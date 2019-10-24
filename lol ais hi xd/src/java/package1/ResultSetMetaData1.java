/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Chanpreet
 */
public class ResultSetMetaData1 extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            String uname="root";
            String pass="root";
            String url="jdbc:mysql://localhost:3306/chan";
            
            Class.forName("com.mysql.jdbc.driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ResultSetMetaData1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
