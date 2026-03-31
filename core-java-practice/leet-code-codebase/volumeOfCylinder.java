import java.util.Scanner;

public class volumeOfCylinder {
    public static void main(){
       Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the radius");
	   double rad = sc.nextDouble();
	   System.out.println("Enter the height of the cylinder");
	   double height = sc.nextDouble();
	   double vol = (3.14*rad*rad*height);
	   
	   System.out.println("valume of the Cylinder is" + vol);
   }
}
