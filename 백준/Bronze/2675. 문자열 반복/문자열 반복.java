import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      int rep = Integer.parseInt(br.readLine()); 
      

      
        
        for(int i = 0; i < rep; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine()); 
            int n = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            
            for(int j=0; j < s.length(); j++)
            {
                for(int k=0; k<n; k++)
                {
                    
                    System.out.printf("%c",s.charAt(j));
                   
                    
                }
                
                
            }
            System.out.printf("\n");
        }
        
   
         

  
    }
    }

