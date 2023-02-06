import java.io.*;
import java.util.*;
 
 
public class Main {
	   public static void main(String args[]) throws IOException {
     
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                                                        
    int[][] arr = new int[9][9];
   
    
    for(int i=0; i<9; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
         for(int j=0; j<9; j++){
             
        arr[i][j] = Integer.parseInt(st.nextToken());
	
      }
     }
     

     int max = arr[0][0];
     int n=0;
     int m=0;
       for(int i=0; i<9; i++){
         for(int j=0; j<9; j++){
             
       if (max < arr[i][j])
       {
           max = arr[i][j];
           n=i;
           m=j;
       }
	
      }
       }
    
        
        System.out.println(max);
        System.out.printf("%d %d",n+1,m+1);
	
   
}
	}

