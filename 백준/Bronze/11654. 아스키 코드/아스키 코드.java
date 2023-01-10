import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      
      String n = br.readLine();   // 기본 String으로 입력받음
      char c = n.charAt(0);       // char로 변환
      int i = (int)c;             // int로 변환
      System.out.print(i);
      
     
    }
}