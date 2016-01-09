import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day2 {

    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      double M = sc.nextDouble(); // original meal price
      int T = sc.nextInt(); // tip percentage
      int X = sc.nextInt(); // tax percentage
        
      sc.close();
      
      double price = M + ((double)T/100 * M) + ((double)X/100 * M);
      
      int total = (int) Math.round(price);
      
      System.out.println("The final price of the meal is $" + total + "."); 
    }
}
