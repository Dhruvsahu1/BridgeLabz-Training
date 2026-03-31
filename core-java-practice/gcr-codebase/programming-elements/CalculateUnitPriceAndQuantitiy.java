import java.util.*;
public class CalculateUnitPriceAndQuantitiy {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the unit price ");
		int unitPrice = sc.nextInt();
		System.out.println("Enter the Quantity ");
		int quantity = sc.nextInt();
		int totalAmount = unitPrice*quantity;
		System.out.println("The total purchase price is INR "+totalAmount+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
	}
}
