import java.util.*;

public class CoffeeStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Coffee name");
        System.out.println("Available Coffee Types: Latte, Espresso, Cappuccino");
        String coffeeType = sc.nextLine();
        System.out.println("Enter the quantity");
        int quantity = sc.nextInt();

        while(coffeeType!=null){
        switch (coffeeType) {
            case "Latte":
                System.out.println("Total cost for " + quantity + " Espresso(s): $" + (quantity * 300));
                break;
            case "Espresso":
                System.out.println("Total cost for " + quantity + " Latte(s): $" + (quantity * 400));
                break;
            case "Cappuccino":
                System.out.println("Total cost for " + quantity + " Cappuccino(s): $" + (quantity * 500));
                break;
            default:
                System.out.println("Invalid coffee type.");
                break;

        }
        if (coffeeType.equals("Espresso") || coffeeType.equals("Latte") || coffeeType.equals("Cappuccino")) {
            double GST = 18.5;
            System.out.println("GST on your order is: $" + (GST / 100) * (quantity+GST));
            break;
        }
    }
    
        
    }
}