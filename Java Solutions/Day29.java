import java.util.Scanner;


public class Day29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tests = scanner.nextInt();
        String string = "";
        boolean isFunny = true;
        
        for (int t=0; t<tests; t++){
            string = scanner.next();
            isFunny = true;
            
            for (int i=1; i<string.length();i++){
                int value1 = ((int)string.charAt(i) - (int)string.charAt(i-1));
                int value2 = ((int)string.charAt(string.length()-i-1) -  string.charAt(string.length()-i));

                if (Math.abs(value1) != Math.abs(value2)) {
                    isFunny = false;
                }
            }
            
            if(isFunny){
                System.out.println("Funny");
            } else {
                 System.out.println("Not Funny");
            }
            
        }
        
        scanner.close();
    }
}