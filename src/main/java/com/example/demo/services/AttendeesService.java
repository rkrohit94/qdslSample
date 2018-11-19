package com.example.demo.services;

import com.example.demo.entities.Attendees;
import com.example.demo.repositories.IAttendeesRepository;
//import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Service
public class AttendeesService {

    @Autowired
    private IAttendeesRepository iAttendeesRepository;

     private String host = "mail.allstate.com";

    public Attendees saveAttendees(Attendees attendees){
        return this.iAttendeesRepository.save(attendees);
    }

    public List<Attendees> findAllAttendeesByTrainingCourse(int trainingId){
        return this.iAttendeesRepository.findAllAttendeesByTrainingCourseId(trainingId);
    }

    public String sendMailForAttendence(int trainingId){
        final String username = "vkunr";//change accordingly
        final String password = "********";//change accordingly

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.startssl.enable", "true");
        props.put("mail.smtp.host", host);

        // Get the Session object.
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });
        List<Attendees> attendeesList = this.iAttendeesRepository.findAllAttendeesByTrainingCourseId(trainingId);
        for(int i=0;i<attendeesList.size();i++) {

            try {
                // Create a default MimeMessage object.
                Message message = new MimeMessage(session);

                // Set From: header field of the header.
                message.setFrom(new InternetAddress("High5@allstate.com"));

//Testing only code:**************************** remove it post POC

                // Set To: header field of the header.
                message.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse(attendeesList.get(i).getNtid()+"@allstate.com"));

                // Set Subject: header field
                message.setSubject("Allstate Gimme 5 Award (project test)");

                // Now set the actual message
                message.setText("Please Fill Mark your attendence for the Training");

                // Send message
                Transport.send(message);
            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }
        }
        // System.out.println("Sent message successfully....");
        return "Sent message successfully";
    }
}
