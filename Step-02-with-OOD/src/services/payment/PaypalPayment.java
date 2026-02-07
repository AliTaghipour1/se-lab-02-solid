package services.payment;

public class PaypalPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid by PayPal: " + amount);
    }
}
