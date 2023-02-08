import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
     
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      int n = Integer.parseInt(br.readLine()); 
    
      boolean [][]arr = new boolean[101][101]; 
     
      int sum=0;
      for(int i=0; i<n;i++)
      {
      StringTokenizer st = new StringTokenizer(br.readLine()); 
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      
        for(int a=x; a<x+10; a++){
            for(int b=y; b<y+10; b++){
                
                if(!arr[a][b])
                {
                    arr[a][b]=true;
                    sum++;
                    
                }
                
            }
            
            
        }

      }
           System.out.println(sum);
     
    }
}