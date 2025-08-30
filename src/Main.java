import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("/n1. Все товары.");
            System.out.println("2. Фильтр продуктов");
            System.out.println("3. Добавить товар в корзину");
            System.out.println("4. Посмотреть корзину");
            System.out.println("5. Проверить");
            System.out.println("6. Выход");
            System.out.println("Выберите действие ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    store.displayProducts();
                    break;
                case 2:
                    System.out.println("Введите ключевое слово");
                    String keyword = scanner.nextLine();
                    List<Product> filteredProducts = store.filterProducts(keyword);
                    filteredProducts.forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Введите товар для добавления в корзину.");
                    String productName = scanner.nextLine();
                    Product productToAdd = store.filterProducts(productName).stream()
                            .findFirst()
                            .orElse(null);
                    if (productToAdd != null) {
                        cart.addProduct(productToAdd);
                        System.out.println(productToAdd.getName() + "продукт добавлен в корзину.");
                    } else {
                        System.out.println("Товар не найден.");
                    }
                    break;
                case 4:
                    System.out.println("Твоя корзина: ");
                    cart.displayCart();
                    break;
                case 5:
                    double total = cart.calculateTotal();
                    System.out.println("Общая сумма: " + total);
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}