package com.mbronshteyn.notification.services;

import com.mbronshteyn.notification.model.Notification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;

@Service
@Slf4j
public class EmailService {

  @Value("${from.email.address}")
  private String fromEmailAddress;

  @Autowired JavaMailSender mailSender;

  @Async
  public void sendEmail(Notification notification)
      throws UnsupportedEncodingException, MessagingException {
    MimeMessage message = mailSender.createMimeMessage();
    MimeMessageHelper helper = new MimeMessageHelper(message);
    helper.setFrom(this.fromEmailAddress);
    helper.setTo(notification.getTo());
    helper.setSubject(notification.getTopic());
    helper.setText(String.format("<p>%s</p>",notification.getMessageBody()), true);
    log.info("Sending email from {}", fromEmailAddress);
    mailSender.send(message);
  }
}
