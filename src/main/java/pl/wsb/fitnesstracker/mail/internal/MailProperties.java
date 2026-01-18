package pl.wsb.fitnesstracker.mail.internal;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.mail.javamail.JavaMailSender;
import pl.wsb.fitnesstracker.mail.api.EmailSender;

/**
 * Configuration properties for the mail module.
 * This class binds properties with the prefix "mail" to configure the {@link EmailSender}.
 * It complements the standard Spring Mail configuration for {@link JavaMailSender}.
 */
@ConfigurationProperties(prefix = "mail")
@Getter
@RequiredArgsConstructor
class MailProperties {

    /**
     * The email address that will be used as the sender for outgoing emails.
     */
    private final String from;

}
