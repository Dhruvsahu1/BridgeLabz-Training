import java.util.*;
public class KiloMetersToMeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in kilometers:");
        double km = sc.nextDouble();
        double meters = km * 1000;
        System.out.println("Distance in meters: " + meters);
    }
}