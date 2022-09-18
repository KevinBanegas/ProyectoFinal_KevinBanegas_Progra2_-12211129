package Correo;

import javax.mail.Session;
import javax.mail.internet.MimeMessage;

public class ConeccionCorreo extends MimeMessage{    
    public ConeccionCorreo(Session session) {
        super(session);
    }
}
