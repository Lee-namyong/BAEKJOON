import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
     
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int n = Integer.parseInt(br.readLine());
   
      
   for(int i=0; i<n; i++)
   {
       
  
      for(int x=n; x>i+1; x--)
      {
          System.out.print(" ");
           
      }
       
      for(int j=-1; j<i; j++)
      {
          System.out.print("*");
           
      }
       
       
       
       
       System.out.println("");
       
   }
    
  
}
}
      