
import java.util.Scanner;

public class CountDownUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number From which CountDown Starts : ");
        int number = sc.nextInt();
        for(int i = number;i>=1;i--){
            System.out.println(i);

        }
        System.out.println("Rocket Launch!");
    }
}
