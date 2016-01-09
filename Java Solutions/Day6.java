import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        String s = "";
        
        for (int i=0; i<n; i++){
            s = "";
            
            for (int j=0; j<n-i-1; j++){
                s+= " ";
            }
            
            for (int k=0; k<i+1; k++){
                s+= "#";
            }
            System.out.println(s);
        }
    }
}
