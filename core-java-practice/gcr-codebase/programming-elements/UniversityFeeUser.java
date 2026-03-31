import java.util.*;
public class UniversityFeeUser {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fees of University");
		int fees = sc.nextInt();
		System.out.println("Enter the discount Percent");
		int discountPercent = sc.nextInt();
		int discount = fees/discountPercent;
		int discountedAmount = fees-discount;
		System.out.println("The discount amount is INR "+discount+" and the final discounted amount is INR "+discountedAmount);
	}
}
