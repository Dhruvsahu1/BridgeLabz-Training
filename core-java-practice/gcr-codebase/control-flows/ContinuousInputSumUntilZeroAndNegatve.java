
import java.util.Scanner;

public class ContinuousInputSumUntilZeroAndNegatve {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double sum = 0;
        while(true){
            System.out.println("Enter a Number : ");
            double number = sc.nextDouble();
            if(number == 0 || number<0){
                System.out.println("The Sum of the Entered Number is : "+sum);
                break;
            }
            sum += number;
        } 
    }
}
