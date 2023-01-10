import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String args[]) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    int n = Integer.parseInt(br.readLine());
    
    if(n<100)
        System.out.println(n);
    
    else
         check(n);
        
        
   



}


public static void check(int n){
    
    int count =0;
    
    for(int i=100 ; i<=n ; i++){
        
    int a = i / 100;        // 백의 자리 
    int b = (i /10) % 10;   // 십의 자리
    int c = i % 10;         // 일의 자리 
    
    if ((a-b) == (b-c))
    count++;
    
    }
  
    System.out.println(count+99);
    
   
}
  
           
     

}    
        
        












