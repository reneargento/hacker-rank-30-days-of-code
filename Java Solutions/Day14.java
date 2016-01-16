import java.util.Arrays;
import java.util.Scanner;

public class Day14 {
	
	private class Difference {
	  	private int[] elements;
	  	public int maximumDifference;
	  	
		Difference(int[] a){
	        elements = a;
	    }

	    public void computeDifference() {
	        Arrays.sort(elements);
	        maximumDifference = Math.abs(elements[elements.length-1] - elements[0]);
	    }
	}
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
        	array[i] = scanner.nextInt();
        }

        Difference difference = new Difference(array);

        difference.computeDifference();

        scanner.close();
      	System.out.print(difference.maximumDifference);
    }

}
