
import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number : ");
        int number = sc.nextInt();
        int factorial = 1;
        int num =2;
        while(num<=number){
            factorial *= num;
            num++;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
