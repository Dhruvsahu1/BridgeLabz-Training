import java.util.*;
public class ConversionOfHeight {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your height in centimeters ");
		double height = sc.nextDouble();
		double inch = height/2.54;
		double feet = inch/12;
		System.out.println("Your height in cm is "+height+" while in feet is "+feet+" and inches is "+inch);
	}
}
