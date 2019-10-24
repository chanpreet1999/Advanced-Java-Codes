 import java.io.*;
 
class IntegrateWithPython{
public static void main(String a[]){
try{
 
String prg = "import sys\nprint int(sys.argv[1])+int(sys.argv[2])\n";
BufferedWriter out = new BufferedWriter(new FileWriter("E:\\FOIS\\allot.py"));
out.write(prg);
out.close();
Process p = Runtime.getRuntime().exec("python3 allot.py ");
BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
///int ret = new Integer(in.readLine()).intValue();
//System.out.println("value is : "+ret);
System.out.println("working");
}catch(Exception e){}
}
}