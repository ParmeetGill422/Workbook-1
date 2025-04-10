import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select sandwich size:");
        System.out.println("1: Regular - $5.45");
        System.out.println("2: Large - $8.95");
        System.out.print("Enter choice (1 or 2): ");
        int sizeChoice = scanner.nextInt();

        double basePrice = 0;
        double loadedExtra = 0.0;

        if (sizeChoice == 1) {
            basePrice = 5.45;
            loadedExtra = 1.00;
        } else if (sizeChoice == 2) {
            basePrice = 8.95;
            loadedExtra = 1.75;
        }

        System.out.print("You want it loaded? (yes/no): ");
        scanner.nextLine();
        String loadedChoice = scanner.nextLine();

        if (loadedChoice.equals("yes")) {
            basePrice += loadedExtra;
        }

        System.out.print("Enter your age (Students and Seniors will get discount): ");
        int age = scanner.nextInt();

        double discount = 0.0;

        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        }

        double finalPrice = basePrice - (basePrice * discount);

        System.out.printf("Total cost of your sandwich: $%.2f\n", finalPrice);
    }
}
