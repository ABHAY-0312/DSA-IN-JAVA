import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution3 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
  if(N%2==0){
     if( N>=2 || N<=5){
          System.out.println("Not Weired");

      }

       else if(N>=6|| N<=20){
          System.out.println("Weired");
      }
      else  if(N>=20){
          System.out.println("Not Weired");
      }

  }
  else{
      System.out.println("Weired");
  }

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }
}
