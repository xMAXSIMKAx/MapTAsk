package App;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public String toString() {
        return String.format("Product: %s, Price: %.2f, Quantity: %d", this.name, this.price, this.quantity);
    }
}

