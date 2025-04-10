import java.util.Scanner;

public class SandwichShop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt for sandwich size
        System.out.println("Welcome to Sandwich Shop!");
        System.out.println("Select sandwich size:");
        System.out.println("1: Regular - $5.45");
        System.out.println("2: Large - $8.95");
        System.out.print("Enter choice (1 or 2): ");
        int sizeChoice = scanner.nextInt();

        double basePrice;
        double loadedExtra = 0.0;

        if (sizeChoice == 1) {
            basePrice = 5.45;
            loadedExtra = 1.00;
        } else if (sizeChoice == 2) {
            basePrice = 8.95;
            loadedExtra = 1.75;
        } else {
            System.out.println("Invalid size selection.");
            return;
        }

        // Step 2: Ask if the sandwich should be loaded
        System.out.print("Would you like it loaded? (yes/no): ");
        scanner.nextLine(); // Consume leftover newline
        String loadedChoice = scanner.nextLine().trim().toLowerCase();

        if (loadedChoice.equals("yes")) {
            basePrice += loadedExtra;
        }

        // Step 3: Prompt for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        double discount = 0.0;
        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        }

        // Step 4: Calculate final price with discount
        double finalPrice = basePrice - (basePrice * discount);

        // Step 5: Display final price
        System.out.printf("Total cost of your sandwich: $%.2f\n", finalPrice);
    }
}