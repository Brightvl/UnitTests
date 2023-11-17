package lesson4.mock;

import org.mockito.Mockito;

public class EmailSenderMock implements EmailSender {
    private String lastRecipient;
    private String lastSubject;
    private String lastBody;

    @Override
    public void sendEmail(String to, String subject, String body) {
        // Записываем аргументы вызова
        lastRecipient = to;
        lastSubject = subject;
        lastBody = body;
    }

    // Геттеры для получения последних вызовов
    public String getLastRecipient() {
        return lastRecipient;
    }

    public String getLastSubject() {
        return lastSubject;
    }

    public String getLastBody() {
        return lastBody;
    }
}