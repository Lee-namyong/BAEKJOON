import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
     
      
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		String s= br.readLine();
        int []cnt = new int[10];
 
		
		for (int i = 0; i<s.length(); i++) {
			cnt[s.charAt(i)-'0']++;
		}
		
		for(int i=9; i>=0;i--)
		{
		    for(int j=cnt[i]; j>0;j--)
		    
		    System.out.print(i);
		    
		}
     
     
      
   
    }
    

    }
    
    
    
