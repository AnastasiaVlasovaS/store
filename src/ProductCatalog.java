import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductCatalog {
    private final List<Product> products;

    public ProductCatalog() {
        this.products = new ArrayList<>();
        products.add(new Product(1, "вода", 46.99, "Альфа-групп", 7.8));
        products.add(new Product(2, "чай", 199.99, "Май-Фудс", 9.7));
        products.add(new Product(3, "горошек", 139.99, "Бондюэль", 9.9));
        products.add(new Product(4, "молоко", 99.99, "Вимм-Билль-Данн", 9.9));
    }

    public List<Product> filterByKeyword(String keyword) {
        return products.stream().filter(p -> p.getName().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Product> getAllProducts() {
        return products;
    }
}
