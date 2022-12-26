import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
     
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
       StringTokenizer st = new StringTokenizer(br.readLine());
       int A = Integer.parseInt(st.nextToken());
       int B = Integer.parseInt(st.nextToken());
       
    
          if (B >= 45) 
          {
                  System.out.printf("%d %d", A,B-45);
           
               
          }
           
           
         else if ((A != 0) && (B < 45))
          {
                  System.out.printf("%d %d", A-1,B -45 + 60);    
              
                   
          }       
    
            else if((A == 0) && (B < 45) )
         {        
                  System.out.printf("%d %d", 23,B -45 + 60);  
                 
        
         }
    
   
     
    }
}













