package services.payment;

public class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid by cash: " + amount);
    }
}
