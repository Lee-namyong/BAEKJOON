import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {

    int []num = new int[31];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    
    for(int i=1; i<29;i++)
    {
    
      num[Integer.parseInt(br.readLine())]= 1;
      
    }
  
    
    
      for(int i=1; i<31;i++)
    {
    
      if(num[i] != 1)
      System.out.println(i);
      
    }

    
 
  
    
        
        
        
}
}
