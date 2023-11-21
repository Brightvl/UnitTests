package lesson4.mock;

import lesson4.s4.mock.EmailSenderMock;
import lesson4.s4.mock.EmailService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailServiceTest {

    @Test
    public void testSendWelcomeEmail() {
        // Создаем имитацию EmailSender
        EmailSenderMock emailSender = new EmailSenderMock();

        // Создаем экземпляр EmailService с имитацией
        EmailService emailService = new EmailService(emailSender);

        // Вызываем метод sendWelcomeEmail
        emailService.sendWelcomeEmail("user@example.com");

        // Проверяем, что метод sendEmail был вызван с правильными аргументами
        assertEquals("user@example.com", emailSender.getLastRecipient());
        assertEquals("Добро пожаловать", emailSender.getLastSubject());
        assertEquals("Добро пожаловать на наш сайт!", emailSender.getLastBody());
    }
}