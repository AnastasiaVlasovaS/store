import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayCart() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public double calculateTotal() {
        double total = 0.0;
        return total;
    }
}