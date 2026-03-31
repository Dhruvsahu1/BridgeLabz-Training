import java.util.*;
public class calculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int add = num1+num2;
		int mul = num1*num2;
		int subtraction = num1-num2;
		int divide = num1/num2;
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+num1+" and "+num2+" is "+add+" , "+subtraction+" , "+mul+" , and "+divide);
	}
}
