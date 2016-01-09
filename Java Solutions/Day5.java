import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        int a=0;
        int b=0;
        int n=0;
        int sum = 0;
        
        for (int i=0; i<t; i++){
            
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            
            sum = a;
            
            if (i >0){
                System.out.print("\n");
            }
            
            for (int j=0; j<n; j++){
                sum+= Math.pow(2,j) * b;
                
                System.out.print(sum + " ");
            }
        }
        sc.close();
    }
}