import java.util.*;

public class Day2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double mealPrice = sc.nextDouble();
        int tipPercentage = sc.nextInt();
        int taxPercentage = sc.nextInt();
        
        sc.close();
        
        double price = mealPrice + ((double)tipPercentage/100 * mealPrice) + ((double)taxPercentage/100 * mealPrice);
        
        int total = (int) Math.round(price);
        
        System.out.println("The final price of the meal is $" + total + ".");
    }
}
