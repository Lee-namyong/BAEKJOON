import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
      	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int n = Integer.parseInt(br.readLine());
		
		int count = 1; 
		int range = 1;
 
		if (n == 1) {
			System.out.print(1);
		}
 
		else {
		  while(range < n){
		    
		    
		    range = 6*count + range;
		    count++;
		
			}
			System.out.print(count);
		}
    }
}
