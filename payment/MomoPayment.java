package payment;

public class MomoPayment implements PaymentMethod {
    private String momoAccount;

    public MomoPayment(String momoAccount) {
        this.momoAccount = momoAccount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan bang tai khoan momo thanh cong. Tai khoan Momo: " + momoAccount);
    }
}
