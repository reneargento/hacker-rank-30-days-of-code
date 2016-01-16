import java.util.Scanner;

public class Day10 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        
        int number = 0;
        StringBuilder bynaryDigits = new StringBuilder();
        StringBuilder bynaryDigitsReverse = new StringBuilder();
        
        for (int i=0; i < testCases; i++){
            number = scanner.nextInt();
            bynaryDigits.setLength(0);
            bynaryDigitsReverse.setLength(0);
            
            while (number > 0){
                bynaryDigits.append(number%2);
                number /= 2;
            }
            
            for (int j=bynaryDigits.length()-1; j>=0;j--){
                bynaryDigitsReverse.append(bynaryDigits.charAt(j));
            }
            System.out.println(bynaryDigitsReverse.toString());
        }
        scanner.close();
    }

}
