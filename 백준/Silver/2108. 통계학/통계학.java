import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
     
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      int n = Integer.parseInt(br.readLine()); 
      int []arr = new int[n];
      
      for(int i=0; i<n;i++)
      {
          arr[i]=Integer.parseInt(br.readLine()); 
    

      }
      
      
      // 산술평균
      double sum=0;
      
       for(int i=0; i<n;i++)
      {
         sum+= arr[i];
    
      }
      
      System.out.println(Math.round(sum/n)); 
      
     
      
      Arrays.sort(arr);
      // 중앙값
      System.out.println(arr[n/2]); 
      
      
      
      // 최빈값
      int[] plus = new int[4002];
	  int[] minus = new int[4001];
	  
		for(int i=0;i<n;i++) {
			
			if(arr[i] <0) {
				minus[Math.abs(arr[i])]++;
			}
			
			
			else {
				plus[arr[i]]++;
			}
		}
		
		ArrayList list = new ArrayList();
		
		
		int max = 0;
		for(int i=0; i<plus.length;i++) {
			max = Math.max(max, plus[i]);
			
		}
		for(int i=0; i<minus.length;i++) {
			max = Math.max(max, minus[i]);
		}
		
		
		for(int i : arr) {
			if(i<0) {
				if(minus[Math.abs(i)] == max && !(list.contains(i))) {
					list.add(i);
				}
			}
			else {
				if(plus[i] == max && !(list.contains(i))) {
					list.add(i);
				}
			}
		}
		
		
		if(list.size()>=2) {
			System.out.println(list.get(1));
		}
		
		else {
		System.out.println(list.get(0)); 
		}
       
      // 범위
      System.out.println(arr[n-1]-arr[0]); 
      
     
     
     
     
      
   
    }
    

    }
    
    
    
