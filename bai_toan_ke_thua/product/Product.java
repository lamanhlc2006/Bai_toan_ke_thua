package product;

public abstract class Product {
    protected String id;
    protected String name;
    protected double price;
    protected String category;

    public Product(String id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return String.format("[%s] %s - %.0f - %s", id, name, price, category);
    }
}