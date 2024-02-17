package App;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductManager {
    public static void processProducts() {
        Map<Integer, Product> products = new HashMap<>();
        products.put(1, new Product("Aplle", 10, 10));
        products.put(2, new Product("Orange", 20, 20));
        products.put(3, new Product("Peach", 30, 30));
        products.put(4, new Product("Kiwi", 40, 40));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product id: ");
        int id = scanner.nextInt();
        Product product = products.get(id);
        if (product!= null) {
            System.out.println("Product details: ");
            System.out.println(product);
    }else {
        System.out.println("Invalid product id"+ id);}
    }

}
