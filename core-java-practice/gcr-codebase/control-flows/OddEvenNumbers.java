
import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int number = sc.nextInt();
        if(number > 0){
            for(int i = 1;i<number;i++){
                if(i%2==0){
                    System.out.println(i+ " is an even Number ");
                }else{
                    System.out.println(i+ " is an odd Number");
                }
            }
        }
        else{
            System.out.println("Please Enter a Natural number ");
        }
    }
}
