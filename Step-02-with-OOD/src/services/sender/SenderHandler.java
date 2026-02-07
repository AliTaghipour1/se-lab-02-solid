package services.sender;

import constants.Notifier;

public class SenderHandler {

    public void send(String to, String message, Notifier notifier) {
        Sender sender;
        switch (notifier) {
            case SMS:
                sender = new SmsSender();
                break;
            default:
                sender = new EmailSender();
        }
        sender.send(to, message);
    }
}
