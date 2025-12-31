package secnario_Based;
import java.util.*;
abstract class Employee {

    private int employeeUniqueId;
    private String name;
    private String department;

    public static final int wagesPerHour = 20;
    public static final int fullDayHour = 8;
    public static final int partTimeHour = 8;
    public static final int maxWorkingDays = 20;
    public static final int maxWorkingHours = 100;

    public Employee(int employeeUniqueId, String name, String department) {
        this.employeeUniqueId = employeeUniqueId;
        this.name = name;
        this.department = department;
    }

//UC1
    public int monitorAttendance() {
        return new Random().nextInt(3); 
        // 0 = Absent, 1 = Full Time, 2 = Part Time
    }

    public abstract int calculateTotalWagess();
    public void displayDetails() {
        System.out.println("Employee ID  : " + employeeUniqueId);
        System.out.println("Emoloyee Name: " + name);
        System.out.println("Department Name: " + department);
        System.out.println("Total Salary : " + calculateTotalWagess());
        System.out.println();
   
    }
}
class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int id, String name, String department) {
        super(id, name, department);
    }

    @Override
    public int calculateTotalWagess() {
        int totalHours = 0;
        int totalDays = 0;
        int totalWages = 0;

        while (totalHours < maxWorkingHours && totalDays < maxWorkingDays) {
            int empMonitor = monitorAttendance();
            int hoursWorked = 0;

            switch (empMonitor) {
                case 1:
                    hoursWorked = fullDayHour;
                    break;
                default:
                    hoursWorked = 0;
            }
            totalHours += hoursWorked;
            totalWages += hoursWorked * wagesPerHour;
            totalDays++;
        }
        return totalWages;
    }
}

class PartTimeEmployees extends Employee {

    public PartTimeEmployees(int id, String name, String department) {
        super(id, name, department);
    }

    @Override
    public int calculateTotalWagess() {

        int totalHours = 0;
        int totalDays = 0;
        int totalWages = 0;

        while (totalHours < maxWorkingHours && totalDays < maxWorkingDays) {

            int empMonitor = monitorAttendance();
            int hoursWorked = 0;

            switch (empMonitor) {
                case 1:
                    hoursWorked = fullDayHour;
                    break;
                case 2:
                    hoursWorked = partTimeHour;
                    break;
                default:
                    hoursWorked = 0;
            }

            totalHours += hoursWorked;
            totalWages += hoursWorked * wagesPerHour;
            totalDays++;
        }
        return totalWages;
    }
}
public class EmployeeWages {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        Employee emp1 = new FullTimeEmployee(101, "Anuj", "HR");
        Employee emp2 = new PartTimeEmployees(102, "Madhav", "Support");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);

        for (Employee employee : employeeList) {
            employee.displayDetails();
        }
    }
}