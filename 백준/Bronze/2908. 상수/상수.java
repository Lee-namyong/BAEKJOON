import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      StringTokenizer st = new StringTokenizer(br.readLine()); 
     
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
    
    
    
    int num1 = reverse(x);
    int num2 = reverse(y);
    
    if(num1 > num2)
     System.out.println(num1);
     
    else
    System.out.println(num2);
        
        
 }
 
   public static int reverse(int num)
    {
        int a = num / 100;   
        int b = (num / 10) %10; 
        int c = num % 10;  
        
        return (100*c + 10*b + a);
        
    }

    }