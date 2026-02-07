package services;

import constants.Notifier;
import constants.PaymentMethods;
import services.payment.PaymentHandler;
import services.sender.SenderHandler;

public class ReservationService {

    private final PaymentHandler paymentHandler = new PaymentHandler();
    private final SenderHandler sender = new SenderHandler();

    public void makeReservation(Reservation res, PaymentMethods paymentType, Notifier notifier) {
        System.out.println("Processing reservation for " + res.getCustomerName());

        paymentHandler.pay(res.totalPrice(), paymentType);

        res.logInvoiceInfo();

        sender.send(res.getCustomerContactPoint(notifier), "Your reservation confirmed!", notifier);
    }
}