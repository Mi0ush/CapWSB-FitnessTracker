package pl.wsb.fitnesstracker.mail.internal;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for the mail module.
 * Enables support for {@link MailProperties} to bind configuration properties.
 */
@Configuration
@EnableConfigurationProperties(MailProperties.class)
class MailConfig {

}
