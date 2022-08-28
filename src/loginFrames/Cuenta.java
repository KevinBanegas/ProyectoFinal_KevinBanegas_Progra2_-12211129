package loginFrames;

import Correo.NewCorreo;
import Drive.NewDrive;
import ToDo.NewToDo;

public class Cuenta {

    private String user;
    private String contra;
    private NewToDo toDo = new NewToDo();
    private NewDrive drive = new NewDrive();
    private NewCorreo correo = new NewCorreo();

    public Cuenta() {
    }

    public Cuenta(String user, String contra) {
        this.user = user;
        this.contra = contra;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public NewToDo getToDo() {
        return toDo;
    }

    public void setToDo(NewToDo toDo) {
        this.toDo = toDo;
    }

    public NewDrive getDrive() {
        return drive;
    }

    public void setDrive(NewDrive drive) {
        this.drive = drive;
    }

    public NewCorreo getCorreo() {
        return correo;
    }

    public void setCorreo(NewCorreo correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "\nUsuario: " + user + "\nContraseña: " + contra;
    }

}
