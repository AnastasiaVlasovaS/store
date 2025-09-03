class Water extends Product {
    private double volume;
    private static final double DEFAULT_VOLUME = 1.5;

    public Water(String name, double price, String manufacturer, double volume) {
        super(name, price, manufacturer);
        this.volume = volume;
    }

    public Water(String name, double price, String manufacturer) {
        super(name, price, manufacturer);
        this.volume = DEFAULT_VOLUME;

    }

    @Override
    public String toString() {
        return super.toString() + " (Объем: " + volume + "л., Стандартный объем: " + DEFAULT_VOLUME + "л.)";
    }
}
