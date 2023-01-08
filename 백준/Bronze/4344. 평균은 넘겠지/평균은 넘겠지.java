import java.io.*;
import java.util.*;


public class Main {
    public static void main(String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
     
      int n = Integer.parseInt(br.readLine()); 
      
      
      
      for(int i=0; i<n ; i++)
      {
          
          StringTokenizer st = new StringTokenizer(br.readLine());
          int stu = Integer.parseInt(st.nextToken());
          int[] stuu = new int[stu];
          
          double sum =0;
          
          for(int j=0; j<stu; j++)
          {
              stuu[j] = Integer.parseInt(st.nextToken());
              
              sum+=stuu[j];
              
              
          }
          
         
          double count=0;
          
            for(int j=0; j<stu; j++)
          {
              if(sum/stu < stuu[j])
              {
                  count++;
                  
                  
              }
              
              
          }
          
          System.out.printf("%.3f%%\n",(count/stu)*100);
          
          
          
          
          
          
      }
     


  
    }
           
     
    }
