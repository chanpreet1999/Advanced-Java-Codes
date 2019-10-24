/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chanpreet
 */
public class EmpDao {
    public static Connection getConnection() {
        
    Connection con=null;
    
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","root");
    System.out.println("helooo==============="+con);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    return con;
    }
    
public static int save(Emp e) {
    
    int status=0;
try{
    Connection con=EmpDao.getConnection();
    System.out.println(con);
    
    
    PreparedStatement ps=con.prepareStatement("insert into table1(Name,Password,Email,Country) values(?,?,?,?)");
    ps.setString(1, e.getName());
    ps.setString(2, e.getPassword());
    ps.setString(3, e.getEmail());
    ps.setString(4, e.getCountry());
    status=ps.executeUpdate();
    con.close();
    }
    catch(Exception ex){
        System.out.println(ex);
    }
    return status;
}

public static List<Emp> getAllElements(){
List<Emp> list=new ArrayList<Emp>(); 
try{
    Connection con=EmpDao.getConnection();
    PreparedStatement ps=con.prepareStatement("select * from table1");
    ResultSet rs=ps.executeQuery();
    while(rs.next()){
    Emp e=new Emp();
    e.setName(rs.getString(1));
    e.setPassword(rs.getString(2));
    e.setEmail(rs.getString(3));
    e.setCountry(rs.getString(4));
    e.setId(rs.getInt(5));
    list.add(e);
    
    }
con.close();
   }
catch(Exception ex){
    System.out.println(ex);

    }

return list;
}

public static Emp getElementbyId(int id)
{
    Emp e=new Emp();
    try{
       
    Connection con=EmpDao.getConnection();
    PreparedStatement ps=con.prepareStatement("select * from table1 where id=?");
    ps.setInt(1, id);
    ResultSet rs=ps.executeQuery();
    if(rs.next())
    {
      e.setId(rs.getInt(5));
      e.setName(rs.getString(1));
      e.setPassword(rs.getString(2));
      e.setEmail(rs.getString(3));
      e.setCountry(rs.getString(4));
    }
    con.close();
    
    }catch(Exception ex){System.out.println("Error "+ex);}
    

return e;
}

public static int update(Emp e)
 { int status=0;
 
   try
   {
       Connection con=EmpDao.getConnection();
       PreparedStatement ps=con.prepareStatement("update table1 set Name=?,Password=?,Email=?,Country=? where id=? ");
       ps.setString(1, e.getName());
       ps.setString(2, e.getPassword());
       ps.setString(3, e.getEmail());
       ps.setString(4, e.getCountry());
       ps.setInt(5, e.getId());
       status=ps.executeUpdate();
       con.close();
   }
   catch(Exception ex){System.out.println("Error in updation "+ex);}
     
     
return status;
  }


public static int delete(int id)
{
    int status=0;
    try
    {
        Connection con=EmpDao.getConnection();
        PreparedStatement ps=con.prepareStatement("delete from table1 where id=?");
        ps.setInt(1, id);
        status=ps.executeUpdate(); 
        
        con.close();
        
    }catch(Exception ex){System.out.println("error in deletion "+ex);}

return status;
}

}
