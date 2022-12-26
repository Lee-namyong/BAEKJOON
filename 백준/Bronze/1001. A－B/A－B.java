import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Stdin Inputs에 있는 값들 전부 가져옴
      
 
      StringTokenizer st = new StringTokenizer(br.readLine()); // 괄호 안에 br.readLine() 넣었잖아? 한 줄 똑같이 가져온건데 공백을 기준으로 Token 분리한거임
     
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());

      System.out.println(A-B);
           
     
    }
}


















