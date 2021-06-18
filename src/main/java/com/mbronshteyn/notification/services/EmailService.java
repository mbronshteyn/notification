package com.mbronshteyn.notification.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

  @Autowired JavaMailSender mailSender;

  @Async
  public void sendEmail()
      throws UnsupportedEncodingException, MessagingException {
    MimeMessage message = mailSender.createMimeMessage();
    MimeMessageHelper helper = new MimeMessageHelper(message);
    helper.setFrom("michael.bronshteyn@gmail.com", "My Email Address");
    helper.setTo("michael.bronshteyn@gmail.com");
    helper.setSubject("test");
    helper.setText("<p>Hi there, this is a test email.</p>", true);
    mailSender.send(message);
  }
}
