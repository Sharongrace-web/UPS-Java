package scannerpractice;
import java.util.Scanner;

class Supermarket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice, product;
        double kg, price, total = 0;

        do {
            System.out.println("\n===== SUPER MARKET =====");
            System.out.println("1. Vegetables");
            System.out.println("2. Fruits");
            System.out.println("3. Rice");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- Vegetables ---");
                    System.out.println("1. Tomato - Rs.40/kg");
                    System.out.println("2. Potato - Rs.30/kg");
                    System.out.println("3. Onion - Rs.50/kg");
                    System.out.print("Select product: ");
                    product = sc.nextInt();

                    switch (product) {
                        case 1:
                            price = 40;
                            break;
                        case 2:
                            price = 30;
                            break;
                        case 3:
                            price = 50;
                            break;
                        default:
                            System.out.println("Invalid product!");
                            continue;
                    }

                    System.out.print("Enter kilograms: ");
                    kg = sc.nextDouble();
                    if (kg <= 0) {
                        System.out.println("Invalid quantity!");
                        continue;
                    }
                    total += price * kg;
                    System.out.println("Item added!");
                    break;

                case 2:
                    System.out.println("\n--- Fruits ---");
                    System.out.println("1. Apple - Rs.150/kg");
                    System.out.println("2. Banana - Rs.60/kg");
                    System.out.println("3. Orange - Rs.80/kg");
                    System.out.print("Select product: ");
                    product = sc.nextInt();

                    switch (product) {
                        case 1:
                            price = 150;
                            break;
                        case 2:
                            price = 60;
                            break;
                        case 3:
                            price = 80;
                            break;
                        default:
                            System.out.println("Invalid product!");
                            continue;
                    }

                    System.out.print("Enter kilograms: ");
                    kg = sc.nextDouble();
                    if (kg <= 0) {
                        System.out.println("Invalid quantity!");
                        continue;
                    }
                    total += price * kg;
                    System.out.println("Item added!");
                    break;

                case 3:
                    System.out.println("\n--- Rice ---");
                    System.out.println("1. Basmati Rice - Rs.100/kg");
                    System.out.println("2. Normal Rice - Rs.60/kg");
                    System.out.print("Select product: ");
                    product = sc.nextInt();

                    switch (product) {
                        case 1:
                            price = 100;
                            break;
                        case 2:
                            price = 60;
                            break;
                        default:
                            System.out.println("Invalid product!");
                            continue;
                    }

                    System.out.print("Enter kilograms: ");
                    kg = sc.nextDouble();
                    if (kg <= 0) {
                        System.out.println("Invalid quantity!");
                        continue;
                    }
                    total += price * kg;
                    System.out.println("Item added!");
                    break;

                case 4:
                    System.out.println("\n===== FINAL BILL =====");
                    System.out.printf("Grand Total: Rs. %.2f%n", total);
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
