package services.sender;

class EmailSender implements Sender {
    public void send(String to, String message) {
        System.out.println("Sending email to " + to + ": " + message);
    }
}
