
public class AverageOfSam {
	public static void main(String args[]) {
		int mathsMarks = 94;
		int physicsMarks = 95;
		int chemistryMarks = 96;
		int totalMarks = 300;
		float sum = mathsMarks+physicsMarks+chemistryMarks;
		float avg  = (sum/totalMarks)*100;
		System.out.println(avg);
	}
}
