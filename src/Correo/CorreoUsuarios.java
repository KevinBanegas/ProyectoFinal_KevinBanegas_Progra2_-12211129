package Correo;

public class CorreoUsuarios {
    private int idCorreo;
    private int idCuenta;
    private String contra;
    private String usuario;

    public CorreoUsuarios() {
    }

    public CorreoUsuarios(int idCorreo, int idCuenta, String contra, String usuario) {
        this.idCorreo = idCorreo;
        this.idCuenta = idCuenta;
        this.contra = contra;
        this.usuario = usuario;
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

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return usuario;
    }
    
    
}
