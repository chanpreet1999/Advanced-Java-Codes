package emailapplication;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailApplication {

  
    public static void send(String to ,String sub,String msg,final String user,final String pass) 
    {
        Properties p=new Properties();
        
        p.put("mail.stmp.host", "stmp.gmail.com");
        
        p.put("mail.stml.port", "587");
        p.put("mail.stmp.auth","true");
        p.put("mail.stmp.starttls.enable", "true");
        
        Session session=Session.getInstance(p, new javax.mail.Authenticator()
                {
                    protected PasswordAuthentication getPasswordAuthentication()
                    {
                        return new PasswordAuthentication(user, pass);
                    }
                });
        try
        {
        
            MimeMessage message=new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(sub);
            message.setText(msg);
            
            Transport.send(message);
        }
        catch(Exception e){System.out.println("Error in mime msg"+e);}
               
    }
    
}
