
import java.util.Scanner;

public class SimpleIntrest {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principal amount");
        double principal = sc.nextDouble();
        System.out.println("Enter the rate of intrest");
        double rate = sc.nextDouble();
        System.out.println("enter the time in years");
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
 