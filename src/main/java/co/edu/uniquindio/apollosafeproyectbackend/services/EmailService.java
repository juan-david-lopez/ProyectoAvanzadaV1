package co.edu.uniquindio.apollosafeproyectbackend.services;
import co.edu.uniquindio.apollosafeproyectbackend.exceptions.TokenConflictException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;

public class EmailService {
    private final JavaMailSender emailSender;
    private void sendEmail() {

    }
    public void sendVerificationEmail(String to, String token)  {
        String verficationLink = "http://localhost:8080/auth/activate?token=" + token;
        try{
            MimeMailMessage message = emailSender.createMimeMessage("", to, "Verifique su cuenta", verficationLink);
            emailSender.send(message);
        }catch (TokenConflictException e) {
            e.getMessage();
        }
    }
}
