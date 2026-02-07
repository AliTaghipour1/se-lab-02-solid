package services.payment;

import constants.PaymentMethods;

public class PaymentHandler {

    public void pay(double amount, PaymentMethods paymentType) {
        Payment paymentHandler;
        switch (paymentType) {
            case CARD:
                paymentHandler = new CardPayment();
                break;
            case PAYPAL:
                paymentHandler = new PaypalPayment();
                break;
            case CASH:
                paymentHandler = new CashPayment();
                break;
            case ONSITE:
                paymentHandler = new OnSitePayment();
                break;
            default:
                paymentHandler = new CashPayment();
                break;
        }

        paymentHandler.pay(amount);
    }
}