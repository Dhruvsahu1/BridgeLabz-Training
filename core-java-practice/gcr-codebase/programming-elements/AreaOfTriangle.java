import java.util.*;
public class AreaOfTriangle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base of the triangle");
		double base = sc.nextInt();
		System.out.println("Enter the height of the triangle");
		double height = sc.nextInt();
		double area = (1.0/2.0)*(base)*(height);
		double inch = area/2.54;
		double feet = inch/12;
		System.out.println("The area of the triangle is "+area+" and in inches is "+inch+" and in feet is "+feet);
	}
}
