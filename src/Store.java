import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<Product> products;

    public Store() {
        products = new ArrayList<>();

        products.add(1, new Product("черноголовка", 46.99, "Альфа-групп"));
        products.add(2, new Product("липтон", 199.99, "Липтон"));
        products.add(3, new Product("горошек", 139.99, "Бондюэль"));
        products.add(4, new Product("кукуруза", 99.99, "Бондюэль"));
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public List<Product> filterProducts(String keyword) {
        List<Product> filtered = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(keyword.toLowerCase())) {
                filtered.add(product);
            }
        }
        return filtered;
    }
}