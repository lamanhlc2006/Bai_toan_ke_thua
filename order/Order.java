package order;

import java.util.ArrayList;
import java.util.List;
import payment.PaymentMethod;
import product.Product;

public class Order {
    private String customerName;
    private List<Product> products;
    private PaymentMethod paymentMethod;

    public Order(String customerName) {
        this.customerName = customerName;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public double getTotalAmount() {
        double sum = 0;
        for (Product p : products) sum += p.getPrice();
        return sum;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout() {
        double total = getTotalAmount();
        if (paymentMethod == null) {
            System.out.println("Khach hang: " + customerName + ". Tong tien: " + total + ". Chua chon phuong thuc thanh toan!");
            return;
        }
        System.out.print("Khach hang: " + customerName + ". Tong tien: " + total + ". ");
        paymentMethod.pay(total);
        System.out.println();
    }

    public void showOrderDetails() {
        System.out.println("Don hang cua: " + customerName);
        for (Product p : products) {
            System.out.println("  - " + p);
        }
        System.out.println("Tong: " + getTotalAmount());
    }
}
