package Correo;

import java.util.Properties;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

public class Servidor {

    private String host;
    private String port;
    private String usuario;
    private String pass;
    private Properties props = new Properties();
    private javax.mail.Session session;
    private Transport transport;

    public Servidor(String host, String port, String usuario, String pass) {
        this.host = host;
        this.port = port;
        this.usuario = usuario;
        this.pass = pass;
    }

    public void conectar() {
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.office365.com");
        props.put("mail.smtp.port", "587");

        session = javax.mail.Session.getDefaultInstance(props);
    }

    public void enviarCorreo(MimeMessage correo) throws NoSuchProviderException, MessagingException {
        transport = session.getTransport("smtp");
        transport.connect("smtp.office365.com", usuario, pass);
        transport.sendMessage(correo, correo.getAllRecipients());
        transport.close();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session s) {
        this.session = s;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

}
