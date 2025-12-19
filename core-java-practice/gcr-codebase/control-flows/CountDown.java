
import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number From which CountDown Starts : ");
        int number = sc.nextInt();
        while(number > 0){
            System.out.println(number);
            number--;
        }
        System.out.println("Rocket Launch!");
    }
}
