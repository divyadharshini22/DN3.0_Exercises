import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int numOfProducts = scanner.nextInt();
        scanner.nextLine();
        Product[] products = new Product[numOfProducts];

        for (int i = 0; i < numOfProducts; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            String productId = scanner.nextLine();
            System.out.print("Product Name: ");
            String productName = scanner.nextLine();
            System.out.print("Category: ");
            String category = scanner.nextLine();

            products[i] = new Product(productId, productName, category);
        }

        System.out.println("Choose search method:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter product name to search: ");
        String productName = scanner.nextLine();
        Product result = null;
        switch (choice) {
            case 1:
                result = LinearSearch.linearSearch(products, productName);
                break;
            case 2:
                BinarySearch.sortProducts(products);
                result = BinarySearch.binarySearch(products, productName);
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                System.exit(0);
        }

        if (result != null) {
            System.out.println("Product found: " + result);
        } else {
            System.out.println("Product not found.");
        }

        scanner.close();
    }
}
