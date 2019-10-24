/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectivity;

import java.io.File;
import java.io.FileInputStream;
import java.sql.*;


public class Connectivity {
    
    public static Connection getConnection() throws Exception{
     String url="jdbc:mysql://localhost:3306/arcore";
     String username="root";
     String password="root";
      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection(url,username,password);
     return con;
     } 
    
    
    
    
    
    
    

	public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
     Connection con=null;  
      String query="insert into table1(pdfname) values(?)";
      File f=new File("E:\\Chan\\Advance java\\connectivity\\src\\connectivity\\sample1.jpeg");
      FileInputStream fis=new FileInputStream(f);
        
      con=Connectivity.getConnection();
      PreparedStatement ps=con.prepareStatement(query);
      ps.setBinaryStream(1,fis);
      int status= ps.executeUpdate();
      if(status>0)
      {
          System.out.println("pdf inserting ");
          System.out.println("Record saved successfully");
      }
      else
            System.out.println("Record not saved!!");    
    
    
    fis.close();
   
    }
    
    
    
  
}

	
	
	
	
    