import java.util.Scanner;

public class ShopApplication {
    private final ProductCatalog catalog;
    private final Cart cart;

    public ShopApplication() {
        this.catalog = new ProductCatalog();
        this.cart = new Cart();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String command;
        System.out.println("Добро пожаловать в магазин!");

        while (true) {
            System.out.println("<");
            command = scanner.nextLine();
            if (command.equals("каталог")) {
                catalog.getAllProducts().forEach(System.out::println);
           /* } else if (command.startsWith("filter")) {
                String keyword = command.substring(6);
                catalog.filterByKeyword(keyword).forEach(System.out::println); */
            } else if (command.startsWith("добавить")) {
                int productID = Integer.parseInt(command.substring(9));
                catalog.getAllProducts().stream()
                        .filter(p -> p.getId() == productID)
                        .findFirst()
                        .ifPresent(cart::addProduct);
            } else if (command.equals("выход")) {
                System.out.println("Закончили! Ваша корзина: ");
                cart.displayCart();
                break;
            } else {
                System.out.println("Непонятная команда");
            }
        }
        scanner.close();
    }
}
