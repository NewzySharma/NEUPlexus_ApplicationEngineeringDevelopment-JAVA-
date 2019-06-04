package utils;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import utils.Constants;

/**
 *
 * @author Shardul Pathak
 */
public class EmailClient {

   
     
        public static void sendEmail(String to,String subject,String messagetext)
        {
           try {
            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "true");
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(Constants.from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject);
            msg.setSentDate(new Date());
            msg.setText(messagetext);

            Transport transport = mailSession.getTransport("smtp");
            transport.connect(Constants.host, Constants.user, Constants.pass);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();
            System.out.println("message sent succefully");

        } catch (Exception ex)
        {
            System.out.println(ex);
        } 
        }

        
    }

