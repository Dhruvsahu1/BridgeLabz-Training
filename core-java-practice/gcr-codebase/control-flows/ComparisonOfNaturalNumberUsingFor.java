
import java.util.Scanner;

public class ComparisonOfNaturalNumberUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = sc.nextInt();  
        int formulaSum = 0;
        int loopSum = 0;
        
        if (number > 0) {
            formulaSum = number * (number + 1) / 2;
        }
        for (int i = number; i > 0; i--) {
            loopSum += i;
        }
        
        if (formulaSum == loopSum) {
            System.out.println("The sum calculated by formula and loop is: " + formulaSum);
        } else {
            System.out.println("There was an error in the calculation.");
        }
    }
}
