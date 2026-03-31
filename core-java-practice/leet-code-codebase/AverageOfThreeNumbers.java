import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
	   System.out.println("Enter first numbers");
	   double a = sc.nextDouble();
	   System.out.println("Enter Second numbers");
	   double b = sc.nextDouble();
	   System.out.println("Enter Third numbers");
	   double c = sc.nextDouble();
	   double avg  = a+b+c/3;
	   System.out.println("Average is " + avg);
  }
}
