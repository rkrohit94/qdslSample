package com.example.demo.services;

import com.example.demo.entities.Attendees;
import com.example.demo.entities.Feedbacks;
import com.example.demo.entities.TrainingCourse;
import com.example.demo.repositories.IAttendeesRepository;
import com.example.demo.repositories.IFeedbacksRepository;
import com.example.demo.repositories.ITrainingCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

@Service
public class FeedbacksService {
    @Autowired
    private IFeedbacksRepository iFeedbacksRepository;

    @Autowired
    private IAttendeesRepository iAttendeesRepository;

    @Autowired
    private ITrainingCourseRepository iTrainingCourseRepository;

    private String host = "mail.allstate.com";

    public Feedbacks saveFeedbacks(Feedbacks attendees){
        return this.iFeedbacksRepository.save(attendees);
    }

    public String sendMailForFeedback(int trainingId){
        final String username = "vkunr";//change accordingly
        final String password = "********";//change accordingly

        Optional<TrainingCourse> trainingCourse = this.iTrainingCourseRepository.findById(trainingId);

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

            String mailTemplate ="<html>\n" +
                    "<div>\n" +
                    "<table>\n" +
                    "<tr><td>Hi, </td></tr>\n" +
                    "<tr><td>Please mark your attendance for “<<trainingName>>” Training Program on <<trainingDate>></td></tr><br/><br/>\n" +
                    "<tr><td>Click here to mark your attendance <<link>></td></tr><br/>\n" +
                    "<tr><td>(PLEASE NOTE: If the link does not work, kindly go to talent connection directly and nominate yourself for the program)</td></tr>\n" +
                    "<tr><td>Thanks & Regards</td></tr><br/>\n" +
                    "<tr><td>Learning & Leadership Development Team</td></tr>\n" +
                    "</table>\n" +
                    "</div>\n" +
                    "</html>";
            mailTemplate = mailTemplate.replace("<<trainingName>>", trainingCourse.get().getTrainingName());
            mailTemplate = mailTemplate.replace("<<trainingDate>>", (CharSequence) trainingCourse.get().getTrainingDate().toString());
            mailTemplate = mailTemplate.replace("<<link>>", "<a href= '" + "http://localhost:3000/" + "' >" + trainingCourse.get().getTrainingName() + "</a>");

            try {
                // Create a default MimeMessage object.
                Message message = new MimeMessage(session);

                // Set From: header field of the header.
                message.setFrom(new InternetAddress("LLD@allstate.com"));

                // Set To: header field of the header.
                message.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse(attendeesList.get(i).getNtid()+"@allstate.com"));

                // Set Subject: header field
                message.setSubject(trainingCourse.get().getTrainingName() +" | "+ trainingCourse.get().getTrainingDate()+" | "+"Mark Your Attendence");

                // Now set the actual message
//                message.setText("");
                System.setProperty("mail.mime.charset", "utf-8");
                message.setContent(mailTemplate, "text/html; charset=UTF-8");

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
