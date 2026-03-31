
public class DividePens {
	public static void main(String args[]) {
		int totalPens = 14;
		int totalStudents = 3;
		int totalDividedPens = totalPens/totalStudents;
		int remainingPens = totalPens%totalStudents;
		System.out.println("The pen per student is "+totalDividedPens+" and the remaining pen not distributed is "+remainingPens);
		
	}
}
