import java.util.*;
public class NumberOfHandshakes {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number if students");
		int numberOfStudents = sc.nextInt();
		int combination = (numberOfStudents*(numberOfStudents-1))/2;
		System.out.println("The total Number Of Possible Handshakes are "+combination);
	}
}
