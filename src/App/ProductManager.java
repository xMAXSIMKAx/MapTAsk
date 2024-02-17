package App;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductManager {
    private Map<Integer, Product> products;

    public ProductManager() {
        this.products = ProductProvider.getProducts();
    }

    public void showAllProducts() {
        System.out.println("Available products:");
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void processProducts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product id: ");
        int id = scanner.nextInt();
        Product product = products.get(id);
        if (product != null) {
            System.out.println("Product details: ");
            System.out.println(product);
        } else {
            System.out.println("Invalid product id" + id);
        }
    }
}