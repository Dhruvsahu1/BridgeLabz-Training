import java.util.Scanner;
public class ScenarioBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your WeightKiloGrams in kilograms: ");
        double weightKiloGrams = sc.nextDouble();
        System.out.print("Enter your heightMeters in meters: ");
        double heightMeters = sc.nextDouble();

        double bmi = weightKiloGrams / (heightMeters * heightMeters);
        System.out.printf("Your BMI is: %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("You are underWeight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal Weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overWeight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}