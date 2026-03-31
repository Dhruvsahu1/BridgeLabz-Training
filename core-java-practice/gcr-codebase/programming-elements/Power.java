import java.util.Scanner;

public class Power {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
	   double base = sc.nextDouble();
	   double power = sc.nextDouble();
	   double ans = Math.pow(base,power);
	   System.out.println(ans);
   }
}
