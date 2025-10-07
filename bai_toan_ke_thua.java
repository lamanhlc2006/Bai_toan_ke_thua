import order.*;
import payment.*;
import product.*;

public class bai_toan_ke_thua {
    public static void main(String[] args) {
        ElectronicProduct ep1 = new ElectronicProduct("E001", "Dien thoai", 4500000, "359876543210123", 12);
        ElectronicProduct ep2 = new ElectronicProduct("E002", "Tai nghe", 750000, "00011222333444", 6);
        FoodProduct fp1 = new FoodProduct("F001", "Sua chua", 25000, "30/10/2025");
        FoodProduct fp2 = new FoodProduct("F002", "Banh mi", 15000, "08/10/2025");

        System.out.println("=== Danh sach san pham ===");
        System.out.println(ep1);
        System.out.println(ep2);
        System.out.println(fp1);
        System.out.println(fp2);
        System.out.println();

        Order order1 = new Order("Nguyen Van A");
        order1.addProduct(ep1);
        order1.addProduct(fp1);
        order1.setPaymentMethod(new CashPayment());
        order1.showOrderDetails();
        order1.checkout();

        Order order2 = new Order("Nguyen Van B");
        order2.addProduct(ep2);
        order2.addProduct(fp2);
        order2.addProduct(fp1);
        order2.setPaymentMethod(new CreditCardPayment("1234567812345678", "Nguyen Van B"));
        order2.showOrderDetails();
        order2.checkout();

        Order order3 = new Order("Tran Thi C");
        order3.addProduct(fp1);
        order3.addProduct(fp2);
        order3.setPaymentMethod(new MomoPayment("0909123456"));
        order3.showOrderDetails();
        order3.checkout();
    }
}
