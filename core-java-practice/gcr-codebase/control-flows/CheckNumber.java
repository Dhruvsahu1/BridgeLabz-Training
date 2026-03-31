import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number = sc.nextInt();
        if(number>0){
            System.out.println("The Number is Positive");
        }else if(number<0){
            System.out.println("The Number is Negative");
        }else{
            System.out.println("The Number is Zero");
        }
    }
}
