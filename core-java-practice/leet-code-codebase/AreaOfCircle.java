import java.util.Scanner;

public class AreaOfCircle {
     public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
	   double rad = sc.nextDouble();
	   double area = (3.14*rad*rad);
	   System.out.println(area);
   }
}
