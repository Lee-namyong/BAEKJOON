import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
    
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine()); 
    int cnt =0;
	for(int i=0; i<n ; i++)
	{
	    String s = br.readLine();
	    
	    if(check(s)==true)
	    cnt++;
	    
	    
	}
	
	System.out.println(cnt);
	}
	
	
	public static boolean check(String s)
    {
        boolean[] check = new boolean[26];
        int prev =0;
        
        for(int i=0; i< s.length(); i++)
        {
            int now = s.charAt(i);
            
            if(now != prev)
            {
                if(check[now - 'a']==false)
                {
                    check[now - 'a'] = true;
                    prev = now;
                }
                
                else
                return false;
                
            }
            
            
            
        }
        
        return true; 
        
    }	
}