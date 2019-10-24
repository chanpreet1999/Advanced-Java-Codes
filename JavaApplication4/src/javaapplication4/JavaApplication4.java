/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Chanpreet
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        String uname="chan",pass="lol";
    String query="Select * from table1 where username="+uname+" and password="+pass;
    
    System.out.println(query);
    }
    
}
