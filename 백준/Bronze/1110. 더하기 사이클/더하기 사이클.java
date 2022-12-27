import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      int a = Integer.parseInt(br.readLine()); 
      int rep = a;
      int k=0;
        while(true)
        {
       
            
            int plus= rep % 10;
            plus = plus *10;
            
            int x = rep / 10;
            int y = rep % 10;
            int xy = (x+y)%10;
            rep = xy+plus;
            
        
            k++;
           
            
            
            
            if(a==rep)
            {
                System.out.println(k);
                break;
                
            }
             
        }
           
     
    }
}