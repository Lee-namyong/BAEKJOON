import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
     
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int x = Integer.parseInt(br.readLine()); 
     int n = Integer.parseInt(br.readLine()); 
     
 
    
     int sum = 0;
     int total =0;
     
     for(int i=0; i<n; i++)
     {
        StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
       
           sum = 0;
           
        for(int j=0; j<b; j++)
        {
            sum+=a;
            
         
        }
       
         total+=sum;
         
         
     }
     
    
    if (x == total){
    System.out.println("Yes");
    
    }
    
    else
    System.out.println("No");
    
}
}
      