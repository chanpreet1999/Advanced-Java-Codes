/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrate2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 *
 * @author Chanpreet
 */
public class Integrate2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try{
 
String prg = "import sys\nprint int(sys.argv[1])+int(sys.argv[2])\n";
BufferedWriter out = new BufferedWriter(new FileWriter("E:\\FOIS\\allot.py"));
out.write(prg);
out.close();
Process p = Runtime.getRuntime().exec("python3 E:\\FOIS\\allot.py ");
BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
//int ret = new Integer(in.readLine()).intValue();
System.out.println("working ");
}catch(Exception e){}
    }
    
}
