package product;

public class FoodProduct extends Product {
    private String expiryDate;

    public FoodProduct(String id, String name, double price, String expiryDate) {
        super(id, name, price, "Food");
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" (Han su dung: %s)", expiryDate);
    }
}