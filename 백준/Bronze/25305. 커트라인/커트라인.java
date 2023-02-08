import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
     
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      StringTokenizer st = new StringTokenizer(br.readLine()); 
      int n = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());
   
     
     
      int []arr = new int[n];
      
      StringTokenizer sk = new StringTokenizer(br.readLine()); 
      for(int i=0; i<n;i++)
      {
          arr[i]=Integer.parseInt(sk.nextToken()); 
      }
      
      int temp;
      
        for(int i=0; i<n;i++)
      {
          
          for(int j=i+1; j<n;j++)
         {
             if(arr[i]<arr[j])
             {
              
              temp =arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
              
             }
             
         }
    
      }
      
     
      
      System.out.println(arr[k-1]);
   
    }
}