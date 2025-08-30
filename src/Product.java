public class Product {

    private final String name;
    private double price;
    private String manufacturer;


    public Product(String name, double price, String manufacturer) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }


    @Override
    public String toString() {
        return String.format("Name: %s, Price: %.2f, Manufacturer: %s",
                name, price, manufacturer);
    }
}