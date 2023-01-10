import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String args[]) throws IOException {




 boolean[] check = new boolean[10001];
 
    for(int i =1; i<check.length ; i++)
    {
     if(self(i) < 10001)
     check[self(i)] = true;
     
    }
 

        
		for (int i = 1; i < check.length; i++) {
			if (check[i] != true) {	
				System.out.println(i);
			}
		}
	
}




public static int self(int n){
    
    int sum = n;
    
    while(n!= 0){
        
       sum += ( n % 10 );
       
       n = n / 10;
        
    }
    
    
    return sum;
    
}
  
           
     

        
        
        
}












