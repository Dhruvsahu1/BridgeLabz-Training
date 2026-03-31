import java.util.Scanner;

class Item {
    // Attributes
    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    void displayDetails() {
        System.out.println("\nItem Details:");
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : ₹" + price);
    }

    // Method to calculate total cost
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

class InventoryTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking item details as input
        System.out.print("Enter Item Code: ");
        int code = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();

        // Create Item object
        Item item = new Item(code, name, price);

        // Ask for quantity
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        // Display item details
        item.displayDetails();

        // Display total cost
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Total Cost : ₹" + totalCost);
    }
}