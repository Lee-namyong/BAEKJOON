import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
      
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        
        
        int sum=0;
        for(int i=0; i<n ; i++)
        {
            sum+=(((int)str.charAt(i))-48);
            
    
        }
        System.out.println(sum);
        
     
      
     
    }
}