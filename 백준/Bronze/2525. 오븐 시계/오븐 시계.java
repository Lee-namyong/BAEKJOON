import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
     
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
       StringTokenizer st = new StringTokenizer(br.readLine());
       int A = Integer.parseInt(st.nextToken()); // 시간
       int B = Integer.parseInt(st.nextToken()); // 분  
       int C = Integer.parseInt(br.readLine());  // 요리 분
       
       int ph = C /60;
       int pm = C %60;
       
       A += ph;
       B += pm;
       
       if(A>= 24)
       {
           A -=24;
            
           if(B>=60)
           {
               
               A +=1;
               B-=60;
               if(A>= 24)
               {
                   A-=24;
               System.out.printf("%d %d", A,B);
               
               }
               
               
               else
               System.out.printf("%d %d", A,B);
           }
           
           else
           {
               
                    if(A>= 24)
               {
                   A-=24;
               System.out.printf("%d %d", A,B);
               
               }
               
               
               else
               System.out.printf("%d %d", A,B);
               
           }
           
           
           
       }
       
        else if(A<=23)
        
        {
            
              if(B>=60)
           {
               
               A +=1;
               B-=60;
                     if(A>= 24)
               {
                   A-=24;
               System.out.printf("%d %d", A,B);
               
               }
               
               
               else
               System.out.printf("%d %d", A,B);
               
           }
           
           else
           {
               
                     if(A>= 24)
               {
                   A-=24;
               System.out.printf("%d %d", A,B);
               
               }
               
               
               else
               System.out.printf("%d %d", A,B);
               
           }
            
            
        }
   
     
    }
}













