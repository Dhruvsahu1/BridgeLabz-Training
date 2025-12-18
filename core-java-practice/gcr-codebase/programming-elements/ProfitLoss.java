
public class ProfitLoss {
	public static void main(String args[]) {
		int costPrice = 129;
		int sellingPrice = 191; // costPrice is in Rupees
		float profit  = sellingPrice-costPrice; // profit = sp-cp
		float profitPercentage = (profit/costPrice)*100;
		System.out.println("The cost price is INR "+costPrice+ " and Selling Price is INR "+sellingPrice+" \nThe Profit is INR "+profit+" and the profit percentage is "+profitPercentage);;
	}
}
