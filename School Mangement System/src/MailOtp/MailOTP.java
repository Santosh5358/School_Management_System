package MailOtp;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class MailOTP {
	public static void send(String from, String password, String to, String sub, String msg) {
		// Get properties object
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		// get Session
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, password);
			}
		});
		// compose message
		try {
			MimeMessage message = new MimeMessage(session);
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject(sub);
			message.setText(msg);
			// send message
			Transport.send(message);
			System.out.println("message sent successfully");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

	public MailOTP(String to, int otp,String subject,String message) {
		// from,password,to,subject,message
		String from, pass, sub, msg;
		from = "lms.pc.software@gmail.com";
                //from = "ashishrajtkd123@gmail.com";
		pass = "  Lms"+"Pc"+"Software  ".trim();
		pass=pass.concat("123");
                //pass="@Ashish1234";
		sub = subject;
		msg = message +" : " + otp;
		MailOTP.send(from, pass, to, sub, msg);
		// change from, password and to
	}
}