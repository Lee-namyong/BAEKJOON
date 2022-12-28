import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    
    
    int n = Integer.parseInt(br.readLine()); 
    
    int []num = new int[n];
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int max;
    int min;
    
    for(int i=0; i<num.length;i++)
    {
    
      num[i]= Integer.parseInt(st.nextToken());
      
      
    }
    
    
    max= num[0];
    min= num[0];
    
       for(int i=0; i<num.length;i++)
    {
    
      if(num[i] > max)
      {
          max = num[i];
          
      }
      
        if(num[i] < min)
      {
          min = num[i];
          
      }
      
    }
    
        System.out.printf("%d %d", min,max);
        
        
}
}
