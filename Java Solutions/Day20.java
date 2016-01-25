import java.util.Scanner;
import java.util.StringTokenizer;

public class Day20 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String string = scanner.nextLine();
        scanner.close();
        
        StringTokenizer stringTokenizer = new StringTokenizer(string,"[!,?.\\_'@ ]+");  
        
        System.out.println(stringTokenizer.countTokens());
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }
	
}
