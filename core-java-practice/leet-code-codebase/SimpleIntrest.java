import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   double time = sc.nextDouble();
	   double principle = sc.nextDouble();
	   double rate = sc.nextDouble();
	   double SI = (principle*rate*time)/100;
	   System.out.println("Simple intrest is " + SI);
	}
}
