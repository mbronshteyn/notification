package com.mbronshteyn.notification;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Description;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@org.springframework.context.annotation.Configuration
public class Configuration {

//  @Bean
//  public JavaMailSender mailSender() {
//    // TODO: add more config if needed
//    JavaMailSender mailSender = new JavaMailSenderImpl();
//    return mailSender;
//  }

//  @Bean
//  @Description("Thymeleaf Template Resolver")
//  public ServletContextTemplateResolver templateResolver() {
//    ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver();
//    templateResolver.setPrefix("/WEB-INF/views/");
//    templateResolver.setSuffix(".html");
//    templateResolver.setTemplateMode("HTML5");
//
//    return templateResolver;
//  }

//  @Bean
//  @Description("Thymeleaf Template Engine")
//  public SpringTemplateEngine templateEngine() {
//    SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//    templateEngine.setTemplateResolver(templateResolver());
//    templateEngine.setTemplateEngineMessageSource(messageSource());
//    return templateEngine;
//  }
}
