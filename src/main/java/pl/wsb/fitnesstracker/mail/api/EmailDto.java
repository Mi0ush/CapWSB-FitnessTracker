package pl.wsb.fitnesstracker.mail.api;

/**
 * A Data Transfer Object (DTO) representing an email message.
 *
 * @param toAddress the recipient's email address.
 * @param subject   the subject of the email.
 * @param content   the body content of the email.
 */
public record EmailDto(String toAddress, String subject, String content) {

}
