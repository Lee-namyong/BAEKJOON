import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      int t =  Integer.parseInt(br.readLine()); 
      

      for(int i=0; i<t; i++)
      {
          
      StringTokenizer st = new StringTokenizer(br.readLine()); 
      
      int H = Integer.parseInt(st.nextToken()); 
      int W = Integer.parseInt(st.nextToken());     
      
      int N = Integer.parseInt(st.nextToken());
      int x;
      int y;
       
        if( N % H == 0 ) {
        
	    x = N / H;
	    y = H;
        }
        
        else {
        x = (N / H) + 1;
        y = (N % H);
    
        }
      
      System.out.printf("%d%02d\n",y,x);
      
      
      }

    
     
    }
}