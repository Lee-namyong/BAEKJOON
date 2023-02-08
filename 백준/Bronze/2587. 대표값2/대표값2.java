import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
     
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      int n = 5;
      int []arr = new int[n];
      
      for(int i=0; i<n;i++)
      {
          arr[i]=Integer.parseInt(br.readLine()); 
    
    
      }
      
      int temp;
      
        for(int i=0; i<n;i++)
      {
          
          for(int j=i+1; j<n;j++)
         {
             if(arr[i]>arr[j])
             {
              
              temp =arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
              
             }
             
         }
    
      }
      
      
      int sum=0;
        for(int i=0; i<n;i++)
      {
          sum+= arr[i];

      }
      System.out.println(sum/5);
      System.out.println(arr[2]);
   
    }
}