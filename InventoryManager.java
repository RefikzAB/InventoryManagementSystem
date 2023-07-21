import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class InventoryManager {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Ask the user if they are a customer or admin
        System.out.println("Are you a customer or admin?");
        String userType = scanner.nextLine();

        if (userType.equals("customer")) {

            // Get the product name from the user
            System.out.println("Enter the product name:");
            String productName = scanner.nextLine();

            // List all the products of that brand
            Inventory[] inventories = readInventoryFromFile("inventory.txt");
            for (Inventory inventory : inventories) {
                if (inventory.getProductName().equals(productName)) {
                    System.out.println(inventory.getBrand() + " - " + inventory.getSize() + " - " + inventory.getColor() + " - " + inventory.getCondition() + " - " + inventory.getPrice());
                }
            }


        } else if (userType.equals("admin")) {

            // Ask the admin if they would like to add to the inventory
            System.out.println("Would you like to add to inventory?");
            String addInventory = scanner.nextLine();

            // If the admin says yes, request the user input
            if (addInventory.equals("yes")) {

                System.out.println("Enter the admin username:");
                String adminUsername = scanner.nextLine();

                if (adminUsername.equals("Admin")) {

                    System.out.println("Enter the admin password");
                    String adminPassword = scanner.nextLine();
                }
            }
        }
    }
}