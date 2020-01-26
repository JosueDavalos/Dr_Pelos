
package formato;

import java.net.InetAddress;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;

import com.sun.mail.util.MailSSLSocketFactory;

public class Mail {

	private InternetAddress[] addressTo;
	public  void Send(String mensaje_, String Correos,String subject )
    {
        String host ="smtp.gmail.com";//unico y valido solo para correo gmail
        String from ="macimarro44@gmail.com";//Tambien puden ser correo institucionales lo unico que habria que hacer es saber cual es el host del correo.
        String to = Correos;
        System.out.println ("Enviando mail..." + new java.util.Date());
        System.out.println (from + new java.util.Date());
        try{ 
        	Properties prop = new Properties();
            MailSSLSocketFactory socketFactory;	
            socketFactory = new MailSSLSocketFactory();
            socketFactory.setTrustAllHosts(true);
                //prop.put("mail.transport.protocol", "smtp");
                prop.put("mail.smtp.host", host);        
                prop.put("mail.smtp.auth", "true");
                prop.put("mail.smtp.port", "587");//cambio del 587 por 465  
                prop.put("mail.smtp.ssl.checkserveridentity", "true");
                prop.put("mail.smtp.socketFactory.fallback", "false");
                prop.setProperty("mail.smtp.quitwait", "false");
                prop.put("mail.smtp.starttls.enable", "true");
                prop.put("mail.smtp.socketFactory.port","587");
                prop.put("mail.smtp.ssl.socketFactory", socketFactory); 
//            
	      String[] tmp =to.split(",");
          addressTo = new InternetAddress[tmp.length];
          for (int i = 0; i < tmp.length; i++) {
              try {
                  addressTo[i] = new InternetAddress(tmp[i]);
              } catch (AddressException ex) {
                  System.out.println(ex);
              }
        }
        SMTPAuthentication auth = new SMTPAuthentication();
        Session session = Session.getInstance(prop , auth );
        Message msg = getMessage(session, from, addressTo,mensaje_,subject);
        System.out.println ("Enviando ..." );
        Transport.send(msg);
        System.out.println ("Mensaje enviado!");

        }

        catch (Exception e)
        {

            ExceptionManager.ManageException(e);

        }

    }

    private static MimeMessage getMessage(Session session, String from, InternetAddress[] to, String Mensaje,String subject)
    		throws Exception{

        try{
        	 InetAddress address = InetAddress.getLocalHost();
            MimeMessage msg = new MimeMessage(session);
            msg.setSubject(subject);
            msg.setText(Mensaje);   
      
            msg.addRecipients(Message.RecipientType.TO, to);
            msg.setFrom(new InternetAddress(from,"Mario Cimarro"));
            return msg;

        }

        catch (java.io.UnsupportedEncodingException ex)
        {

            ExceptionManager.ManageException(ex);
            return null;

        }

        catch (MessagingException ex)
        {

            ExceptionManager.ManageException(ex);
            return null;

        } 

    }
    

}

class SMTPAuthentication extends javax.mail.Authenticator
{

    public PasswordAuthentication getPasswordAuthentication()
    {

        String username = "macimarro44";

        String password = "0925624371";

        return new PasswordAuthentication(username, password);

    }

}

class ExceptionManager
{

    public static void ManageException (Exception e)
    {

        System.out.println ("Se ha producido una exception");

        System.out.println (e.getMessage());

        e.printStackTrace(System.out);

    }
    
}


