public class Shoe {
    private String brand;
    private String model;
    private String color;
    private int size;
    private double price;
    private String condition;

    public Shoe() {
        // Default constructor
    }

    public Shoe(String brand, String model, String color, int size, double price, String condition) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
        this.condition = condition;
    }

    // Getter and setter methods

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
