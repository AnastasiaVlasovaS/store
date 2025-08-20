public class Product {
    private final int id;
    private final String name;
    private final double price;
    private String manufacturer;
    private double rating;

    public Product(int id, String name, double price, String manufacturer, double rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.rating = rating;
    }

        public int getId() {
            return id;
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

        public double getRating() {
            return rating;
        }

        public void setRating() {
        this.rating = rating;
        }

        @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Price: %.2f, Manufacturer: %s, Rating: %.1f",
                id, name, price, manufacturer, rating);
        }
    }