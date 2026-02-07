package services;

public class SmsSender {
    public void sendSms(String to, String message) {
        System.out.println("Sending sms to " + to + ": " + message);
    }

    public void sendEmail(String to, String message) {
        System.out.println("not implemented");
    }
}
