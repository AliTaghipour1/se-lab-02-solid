package services.payment;

public class OnSitePayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid on site: " + amount);
    }
}
