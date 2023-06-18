import java.sql.*;
public class Main {
    public static void main(String[] args) {
        // Create an instance of UserInterface class
        UserInterface userInterface = new UserInterface();

        // Prompt user for shoe details
        Shoe shoe = userInterface.promptForShoeDetails();

        // Search for the shoe in the database
        DatabaseAccess databaseAccess = new DatabaseAccess();
        Shoe foundShoe = databaseAccess.searchForShoe(shoe);

        // Display the result
        if (foundShoe != null) {
            System.out.println("Shoe Found:");
            System.out.println("Size: " + foundShoe.getSize());
            System.out.println("Price: " + foundShoe.getPrice());
            System.out.println("Condition: " + foundShoe.getCondition());
            System.out.println("Color: " + foundShoe.getColor());
        } else {
            System.out.println("Shoe not found in stock.");
        }
    }
}
