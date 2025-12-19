
import java.util.Scanner;

public class ComparisonOfNaturaNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int number = sc.nextInt();
        int formulaSum = 0;
        int loopSum = 0;
        if(number>0){
            formulaSum= number*(number+1)/2;
        }
        while(number>0){
            loopSum += number;
            number--;
        }
        if(formulaSum == loopSum){
            System.out.println(formulaSum);
        }
    }
}
