
import java.util.Scanner;

public class BonusOfEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary of Employee : ");
        int EmpSalary = sc.nextInt();
        System.out.println("Enter the Years of Service of Employee : ");
        int EmpYears = sc.nextInt();
        int EmpBonus = 0;
        if(EmpYears > 5){
            EmpBonus = (EmpSalary * 5) / 100;
            System.out.println("The Bonus of Employee is : " + EmpBonus);
        }
    }
}
