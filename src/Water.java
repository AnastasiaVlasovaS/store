class Water extends Product {
    private double volume;
    private static final double DEFAULT_VOLUME = 1.5;

    public Water(String name, double price, String manufacturer, double volume) {https://github.com/AnastasiaVlasovaS/store/blob/main/src/Water.java
        super(name, price, manufacturer);
        this.volume = volume;
    }
    @Override
    public String toString() {
        return super.toString() + " (Объем: " + volume + "л., Стандартный объем: " + DEFAULT_VOLUME + "л.)";
    }
}
