package Correo;

public class Correo {
    private int idCorreo;
    private int idCuenta;
    private String recipiente;
    private String asunto;
    private String cuerpo;

    public Correo() {
    }

    public Correo(int idCorreo, int idCuenta, String recipiente, String asunto, String cuerpo) {
        this.idCorreo = idCorreo;
        this.idCuenta = idCuenta;
        this.recipiente = recipiente;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
    }

    public int getIdCorreo() {
        return idCorreo;
    }

    public void setIdCorreo(int idCorreo) {
        this.idCorreo = idCorreo;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getRecipiente() {
        return recipiente;
    }

    public void setRecipiente(String recipiente) {
        this.recipiente = recipiente;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    @Override
    public String toString() {
        return asunto;
    }
    
    
}
