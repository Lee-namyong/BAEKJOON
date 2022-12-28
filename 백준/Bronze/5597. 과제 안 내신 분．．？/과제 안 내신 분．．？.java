import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {

    boolean []num = new boolean[31];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    
    for(int i=1; i<29;i++)
    {
    int n = Integer.parseInt(br.readLine());
      num[n]= true;
      
    }
  
    
    
      for(int i=1; i<31;i++)
    {
    
      if(num[i] != true)
      System.out.println(i);
      
    }

    
 
  
    
        
        
        
}
}
