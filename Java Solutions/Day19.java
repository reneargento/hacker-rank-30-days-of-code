
public class Day19 {

	interface AdvancedArithmetic{
		int divisorSum(int n);
	}
	
	class Calculator implements AdvancedArithmetic {
	    
	    public int divisorSum(int number){
	        int result = 0;
	        
	        for (int i=1; i <= number/2; i++) {
	            result += number % i == 0? i : 0;
	        }
	        
	        return result + number;
	    }
	    
	}
	
}
