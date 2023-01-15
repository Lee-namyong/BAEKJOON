import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      int n = Integer.parseInt(br.readLine()); 
      
      int cnt=0;
      StringTokenizer st = new StringTokenizer(br.readLine()); 
      
      for(int i=0; i<n; i++)
      {
        int num = Integer.parseInt(st.nextToken());
        
        boolean check = true;
        if(num ==1)
        check = false;
        
        for(int j=2; j<=Math.sqrt(num); j++)
        {
            if(num % j ==0)
            check = false;
                
        }
        
        if(check ==true)
        cnt++;
 
      }
      System.out.println(cnt);
    }
    
}