import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int n = Integer.parseInt(st.nextToken());
    int a = Integer.parseInt(st.nextToken());
    
    int []num = new int[n];
    
    StringTokenizer sk = new StringTokenizer(br.readLine());
    
    for(int i=0; i<num.length;i++)
    {
    
        num[i] = Integer.parseInt(sk.nextToken());
        if(num[i] < a)
        {
            System.out.printf("%d ",num[i] );
      
         }     
     
        
  
    
}

}
}
