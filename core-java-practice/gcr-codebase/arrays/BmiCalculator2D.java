
import java.util.Scanner;

class BmiCalculator2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double[][] dataPerson = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.print("Enter your weight(in kg) : ");
            double weight = sc.nextDouble();
            if (weight < 0) {
                System.out.println("data is negative , please re-enter");
                weight = sc.nextDouble();
            }

            System.out.print("Enter your height(in cm) : ");
            double height = sc.nextDouble();
            if (height < 0) {
                System.out.println("data is negative , please re-enter");
                height = sc.nextDouble();
            }

            height /= 100;
            double bmi = weight / (height * height);
            dataPerson[i][0] = weight;
            dataPerson[i][1] = height;
            dataPerson[i][2] = bmi;
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {

                weightStatus[i] = "Normal";

            } else if (bmi >= 25 && bmi <= 39.9) {

                weightStatus[i] = "Overweight";

            } else {

                weightStatus[i] = "Obese";

            }
        }
        for (int i = 0; i < number; i++) {
            System.out.println("weight : " + dataPerson[i][0] + " height : " + dataPerson[i][1] + " BMI : " + dataPerson[i][2]);
            System.out.println("WeightStatus of a person : " + weightStatus[i]);
        }

    }
}
