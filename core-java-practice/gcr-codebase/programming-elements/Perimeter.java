
import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of the rectangle");
        int length = sc.nextInt();
        System.out.println("enter breadth of the rectangle");
        int breadth = sc.nextInt();
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
