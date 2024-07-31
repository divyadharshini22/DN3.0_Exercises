import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();
        int choice = 0;
        do{
            System.out.println("Menu");
            System.out.println("1. Add product");
            System.out.println("2. Remove product");
            System.out.println("3. update inventory");
            System.out.println("4. exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                        System.out.print("Enter product ID: ");
                        String productId = sc.nextLine();
                        System.out.print("Enter product name: ");
                        String productName = sc.nextLine();
                        System.out.print("Enter quantity: ");
                        int quantity = sc.nextInt();
                        System.out.print("Enter price: ");
                        double price = sc.nextDouble();
                        sc.nextLine(); // Consume newline
                        Product product = new Product(productId, productName, quantity, price);
                        inventory.addpro(product);
                        System.out.println("Product added successfully.");
                        break;
                case 2:
                    System.out.print("Enter product ID to remove: ");
                    String prod = sc.nextLine();
                    inventory.removepro(prod);
                    System.out.println("Product removed successfully.");
                    break;
                case 3:
                    System.out.print("Enter product ID to update: ");
                    String prodid = sc.nextLine();
                    System.out.print("Enter new quantity: ");
                    int proq = sc.nextInt();
                    System.out.print("Enter new price: ");
                    double proprice = sc.nextDouble();
                    sc.nextLine();
                    inventory.updatepro(prodid, proq, proprice);
                    break;
                case 4:break;
            }
        }while(choice != 4);

    }
}
