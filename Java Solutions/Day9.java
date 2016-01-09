import java.io.*;
import java.util.*;

public class Day9 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		sc.close();

		int gcd = findGcd(a,b);
		System.out.println(gcd);
	}
	
	static  int findGcd(int a,int b){
		//This operation can be optimized using modulus calculation
		return a==b? a : findGcd(Math.max(a,b)-Math.min(a,b),Math.min(a,b));
	}
}

