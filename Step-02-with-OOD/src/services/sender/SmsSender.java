package services.sender;

public class SmsSender implements Sender {
    public void send(String to, String message) {
        System.out.println("Sending sms to " + to + ": " + message);
    }
}
