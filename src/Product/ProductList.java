package Product;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProductList {
    private Map<Product, Integer> products = new HashMap<>();

    public ProductList(Map<Product, Integer> products) {
        this.products = products;
    }

    public double getTotalCostAllProducts() {
        double sum = 0.0;
        for (Map.Entry<Product, Integer> product : products.entrySet()){
            sum += product.getKey().getPrice() * product.getValue();
        }
        return sum;
    }
    public void checkProduct(String name) {
        boolean addendum = false;
        for (Map.Entry<Product, Integer> product : products.entrySet()){
            if (product.getKey().getName().equals(name)) {
                System.out.println(name + "Добавлен");
                addendum = true;
                break;
            }
        }
        if (!addendum) {
            System.out.println(name + " Не добавлен");
        }
    }
    public void addProduct(Product product) {
        if (product == null) {
            return;
        }

        if (this.products.containsKey(product)) {
            Integer productCount = this.products.get(product);
            this.products.put(product, ++productCount);
        }else {
            this.products.put(product, 1);
    }

    }
}
