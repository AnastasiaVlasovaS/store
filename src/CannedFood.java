public class CannedFood extends Product {
    private static final int DEFAULT_SHELF_LIFE_MONTHS = 24;
    private String expirationDate;

     public CannedFood(String name, double price, String manufacturer, String expirationDate) {
        super(name, price, manufacturer);
        this.expirationDate = expirationDate;
    }
    @Override
    public String toString() {
         return super.toString() + "(Истекает: " + expirationDate + ", Стандартный срок хранение: "
                 + DEFAULT_SHELF_LIFE_MONTHS + " месяцев)";
    }
}
