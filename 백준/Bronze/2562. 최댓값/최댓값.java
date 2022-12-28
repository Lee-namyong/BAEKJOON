import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {

    int []num = new int[9];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    
    for(int i=0; i<num.length;i++)
    {
    
      num[i]= Integer.parseInt(br.readLine());
      
    }
    
    
    int max = num[0];
    for(int i=0; i<num.length;i++)
    {
        if(max < num[i])
        {
            max = num[i];
            
            
        }
      
      
    }
    System.out.println(max);
    
    int k =0;
    
      for(int i=0; i<num.length;i++)
    {
        if(max != num[i])
        {
            k++;
            
        }
        
        else if (max == num[i])
        {
            k++;
            System.out.println(k);
        }
      
      
    }
   
    
        
        
        
}
}
