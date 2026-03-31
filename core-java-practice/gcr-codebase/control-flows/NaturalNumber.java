import java.util.Scanner;
public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = sc.nextInt();
        if(number == 0){
            System.out.println("Entered Number is Zero ");
        }
        else if(number>0){
            int sum = number*(number+1)/2;
            System.out.println("The sum of "+number+" natural number is : "+sum);
        }else{
            System.out.println("The Number is not a Natural Number");
        }
    }
}
