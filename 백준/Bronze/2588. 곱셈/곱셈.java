import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
     
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      
       int A = Integer.parseInt(br.readLine()); 
       int B = Integer.parseInt(br.readLine()); 
       
    
        int x = (B % 10);
        int y = ((B / 10))%10;
        int z = (B/ 100) %10;
       
   
      
      
   
  
      System.out.println(A*x);
      System.out.println(A*y);
      System.out.println(A*z);
      
      int sum =  A*x + (A*y *10) + (A*z*100);
      
      System.out.println(sum);
    
   
     
    }
}













