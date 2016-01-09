import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();      
		sc.close();

		String ans="";
		if(n%2==1) {
			ans = "Weird";
		} else {
			if(2<=n && n<=5 || n>20){
				ans = "Not Weird";
			}else {
				ans = "Weird";
			}

		}
		System.out.println(ans);

	}
}