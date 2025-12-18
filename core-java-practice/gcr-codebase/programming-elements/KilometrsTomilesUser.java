import java.util.Scanner;
public class KilometrsTomilesUser {
 public static void main(String args[]) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the value in km");
	 double km = sc.nextDouble();
	 double convertedMiles = km*0.621371;
	 System.out.println("Converted miles is "+convertedMiles);
 }
}
