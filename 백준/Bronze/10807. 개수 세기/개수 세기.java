import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine()); 
    int []num = new int[n];
    
    for(int i=0; i<num.length;i++)
    {
        num[i] = Integer.parseInt(st.nextToken());
      
    }     
     
     int k = Integer.parseInt(br.readLine());
     
     int rep =0;
      for(int i=0; i<num.length;i++)
    {
       if(k ==num[i])
       {
        rep++;
        }   
    }
    
    
    
     System.out.println(rep);
    
    
}

}

