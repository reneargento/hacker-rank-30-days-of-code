import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day16 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numbers = scanner.nextInt();
        List<Integer> pairs = new ArrayList<>();
        int minimumAbsoluteDifference = Integer.MAX_VALUE;
        int currentAbsoluteDifference = Integer.MAX_VALUE;
        
        int[] numbersArray = new int[numbers];
        
        for (int i=0; i<numbers; i++){
            numbersArray[i] = scanner.nextInt();
        }
        
        Arrays.sort(numbersArray);
        
        for (int i=1; i<numbersArray.length; i++){
            currentAbsoluteDifference = Math.abs(numbersArray[i] - numbersArray[i-1]);
            
            if (currentAbsoluteDifference <= minimumAbsoluteDifference){
                
                if (currentAbsoluteDifference < minimumAbsoluteDifference){
                    pairs.clear();
                }
                
                pairs.add(numbersArray[i-1]);
                pairs.add(numbersArray[i]);
                
                minimumAbsoluteDifference = currentAbsoluteDifference;
            }
        }
        
        scanner.close();
        
        for (int i=0; i<pairs.size(); i++) {
            System.out.print(pairs.get(i) + " ");
        }
    }

}
