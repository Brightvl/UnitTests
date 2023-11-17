package lesson4.mock;

public interface EmailSender {
    void sendEmail(String to, String subject, String body);
}
