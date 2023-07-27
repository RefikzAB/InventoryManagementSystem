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
    public static Inventory[] readInventoryFromFile(String fileName) throws IOException {

        // Create a File object for the inventory file
        File inventoryFile = new File(fileName);

        // Create a FileReader object for the inventory file
        FileReader fileReader = new FileReader(inventoryFile);

        // Create a BufferedReader object for the inventory file
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Create an array to store the inventory items
        Inventory[] inventories = new Inventory[0];

        // Read each line from the inventory file
        String line;
        while ((line = bufferedReader.readLine()) != null) {

            // Split the line into the inventory item's properties
            String[] properties = line.split(",");

            // Create a new Inventory object
            Inventory inventory = new Inventory();
            inventory.setProductName(properties[0]);
            inventory.setBrand(properties[1]);
            inventory.setSize(properties[2]);
            inventory.setColor(properties[3]);
            inventory.setCondition(properties[4]);
            inventory.setPrice(Integer.parseInt(properties[5]));

            // Add the inventory item to the array
            inventories = Arrays.copyOf(inventories, inventories.length + 1);
            inventories[inventories.length - 1] = inventory;
        }

        // Close the buffered reader
        bufferedReader.close();

        // Return the array of inventory items
        return inventories;
    }

}