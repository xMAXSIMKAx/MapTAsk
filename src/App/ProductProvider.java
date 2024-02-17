package App;

import java.util.HashMap;
import java.util.Map;

public class ProductProvider {
        public static Map<Integer, Product> getProducts() {
            Map<Integer, Product> products = new HashMap<>();
            products.put(1, new Product("Apple", 10, 10));
            products.put(2, new Product("Orange", 20, 20));
            products.put(3, new Product("Peach", 30, 30));
            products.put(4, new Product("Kiwi", 40, 40));
            return products;
        }
    }

