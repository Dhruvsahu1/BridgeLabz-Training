import java.util.*;
public class DistanceInYardsAndMiles {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance in feet");
		int distanceInFeet = sc.nextInt();
		double distanceInYard = distanceInFeet/3.0;
		double distanceInMiles = distanceInYard/1760;
		System.out.println("Your distance in feet is "+distanceInFeet+" and in Yard is "+distanceInYard+" and in Miles "+distanceInMiles);
	}
}
