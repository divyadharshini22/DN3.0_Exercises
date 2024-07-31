import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of orders: ");
        int numOfOrders = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Order[] orders = new Order[numOfOrders];

        // Input order details from the user
        for (int i = 0; i < numOfOrders; i++) {
            System.out.println("Enter details for order " + (i + 1) + ":");
            System.out.print("Order ID: ");
            String orderId = scanner.nextLine();
            System.out.print("Customer Name: ");
            String customerName = scanner.nextLine();
            System.out.print("Total Price: ");
            double totalPrice = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            orders[i] = new Order(orderId, customerName, totalPrice);
        }

        System.out.println("Choose sorting method:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            // Bubble Sort
            BubbleSort.sort(orders);
        } else if (choice == 2) {
            // Quick Sort
            QuickSort.sort(orders);
        } else {
            System.out.println("Invalid choice. Exiting.");
            scanner.close();
            return;
        }

        // Display sorted orders
        System.out.println("Sorted Orders by Total Price:");
        for (Order order : orders) {
            System.out.println(order);
        }

        scanner.close();
    }
}
