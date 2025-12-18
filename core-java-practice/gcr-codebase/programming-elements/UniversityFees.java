
public class UniversityFees {
	public static void main(String args[]) {
		int fees = 125000;
		int discountPercentage = 10;
		int discount = fees/discountPercentage;
		int discountedAmount = fees-discount;
		System.out.println("The discount amount is INR "+discount+" and the final discounted amount is INR "+discountedAmount);
	}
}
