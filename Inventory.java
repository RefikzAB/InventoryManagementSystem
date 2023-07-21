import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Inventory {
    private String productName;
    private int productQuantity;
    private String brand;
    private String size;
    private String color;
    private String condition;
    private int price;

    public Inventory(String productName, int productQuantity, String brand, String size, String color, String condition, int price) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.condition = condition;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void writeInventoryToFile(String fileName) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(fileName));
        writer.println(productName);
        writer.println(productQuantity);
        writer.println(brand);
        writer.println(size);
        writer.println(color);
        writer.println(condition);
        writer.println(price);
        writer.close();
    }

}
}
