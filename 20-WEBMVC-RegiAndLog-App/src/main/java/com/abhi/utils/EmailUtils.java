package com.abhi.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.internet.MimeMessage;

@Component
public class EmailUtils {
	
	@Autowired
	private JavaMailSender mailsender;
	
	public boolean sendeEmail(String to,String subject,String body) {

		/*
		 * try {
		 * 
		 * 
		 * SimpleMailMessage msg = new SimpleMailMessage(); msg.setTo(to);
		 * msg.setSubject(subject); msg.setText(body);
		 * 
		 * mailsender.send(msg); return true; }catch(Exception e) { e.printStackTrace();
		 * } return false;
		 */
		try {
		MimeMessage mimeMsg = mailsender.createMimeMessage();	 
      MimeMessageHelper helper = new MimeMessageHelper(mimeMsg);
      
      helper.setTo(to);
      helper.setSubject(subject);
      
      helper.setText(body, true);
      mailsender.send(mimeMsg);
      return true;
      
	}catch(Exception e) {
		e.printStackTrace();
	}
		return false;
}
}

