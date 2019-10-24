/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.sql.*;

/**
 *
 * @author Chanpreet
 */
public class Login {
public static boolean  validate(String uname,String pass) throws Exception{
    boolean status=false;
    String username="root",password="root";
    String url="jdbc:mysql://localhost:3306/login";
    String query="select * from table1 where username='"+uname+"' and password='"+pass+"'";
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection(url,username,password);
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery(query);
    status=rs.next();
    
    return status;
}    
}
