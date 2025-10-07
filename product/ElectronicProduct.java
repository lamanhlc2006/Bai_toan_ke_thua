package product;

public class ElectronicProduct extends Product {
    private String imei;
    private int warrantyMonths;

    public ElectronicProduct(String id, String name, double price, String imei, int warrantyMonths) {
        super(id, name, price, "Electronics");
        this.imei = imei;
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" (IMEI: %s, BH: %d thang)", imei, warrantyMonths);
    }
}