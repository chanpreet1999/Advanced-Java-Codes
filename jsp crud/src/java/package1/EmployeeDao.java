/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Chanpreet
 */
public class EmployeeDao {

    public static Connection getConnection() throws Exception {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspCrud", "root", "root");

        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return con;
    }

    public static int save(Employee u) {
        int i = 0;
        Connection con = null;
        try {

            con = EmployeeDao.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into table1(name,password,email,country) values(?,?,?,?)");

            ps.setString(1, u.getName());
            ps.setString(2, u.getPassword());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getCountry());

            i = ps.executeUpdate();
            con.close();

        } catch (Exception ex) {
            System.out.println(ex);;
        }
        return i;
    }

    public static List<Employee> getAllRecords() {
        List<Employee> list = new ArrayList<Employee>();
        try {

            Connection con = EmployeeDao.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from table1");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setPassword(rs.getString("password"));
                e.setEmail(rs.getString("email"));
                e.setCountry(rs.getString("country"));
                list.add(e);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return list;
    }
    
    public static Employee getRecordById(int id)
    {
       Employee e=null; 
        try 
        {
            Connection con=EmployeeDao.getConnection();
            PreparedStatement ps=con.prepareStatement("select * from table1 where id=?");
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                e=new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setPassword(rs.getString("password"));
                e.setEmail(rs.getString("email"));
                e.setCountry(rs.getString("country"));
            }
        } 
        catch (Exception ex) 
        {
            System.out.println(ex);
        }
        return e;
    }

    public static int update(Employee e)
    { 
       int status=0;
      Connection con=null;
        try {
            con=EmployeeDao.getConnection();
            PreparedStatement ps=con.prepareStatement("update table1 set name=?,password=?,email=?,country=? where id=?");
            ps.setString(1,e.getName());
            ps.setString(2,e.getPassword());
            ps.setString(3,e.getEmail());
            ps.setString(4,e.getCountry());
            ps.setInt(5, e.getId());
           
            status=ps.executeUpdate();
            System.out.println("status===="+status);
            con.close();
                
        } 
        catch (Exception ex) 
        {
            System.out.println(ex);
        }
        System.out.println("status====outside======"+status);

        return status;
        
    }
    
    public static int deleteIt(Employee e)
    {
        Connection con=null;
        int status=0;
        try {
            
            con=EmployeeDao.getConnection();
            PreparedStatement ps=con.prepareStatement("delete from table1 where id=?");
            ps.setInt(1, e.getId());
            status=ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return status;
    }
}
