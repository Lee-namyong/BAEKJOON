import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
      	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int n = Integer.parseInt(br.readLine());
		
		int count = 2; 
		int range = 1;
 
	
		  while(range < n){
		    
		    
		    range = range+count ;
		    count++;

			}
			
			if((count-1) % 2 ==0)
		
        {
            
            int result = range - n;
            
            System.out.printf("%d/%d", count-1-result, 1+result);
            
        }
        
        
        else
        
        {
            int result = range - n;
            System.out.printf("%d/%d", 1+result, count-1-result);
            
            
            
        }
		
        
    }
}