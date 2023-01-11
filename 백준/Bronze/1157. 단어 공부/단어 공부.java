import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      String s = br.readLine(); 

        int[] arr = new int[26];
        
        
        for(int i =0; i < s.length() ; i++){
            
        
        if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') 
		arr[s.charAt(i) - 'A']++;	
	    
    
	    else
		arr[s.charAt(i) - 'a']++;
        
         }
         
         
        int max=-1;
        char ch = '?';
        for(int i =0; i < arr.length; i++)
        {
            
            
            if(max < arr[i])
            {
                
                max = arr[i];
                ch = (char) (i + 'A');
                
            }
            
            else if (max == arr[i])
            {
               
                ch = '?';
                
            }
            
            
        }
         
         System.out.println(ch);

  
    }
    }