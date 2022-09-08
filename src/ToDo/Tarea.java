package ToDo;

import java.util.Date;

public class Tarea {

    private String nombre;
    private Date fechaRealizar;
    private boolean importante;
    private boolean realizado;

    public Tarea() {
    }

    public Tarea(String nombre, Date fechaRealizar) {
        this.nombre = nombre;
        this.fechaRealizar = fechaRealizar;
        this.importante = false;
        this.realizado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaRealizar() {
        return fechaRealizar;
    }

    public void setFechaRealizar(Date fechaRealizar) {
        this.fechaRealizar = fechaRealizar;
    }

    public boolean isImportante() {
        return importante;
    }

    public void setImportante(boolean importante) {
        this.importante = importante;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre +  "\nFecha a Realizar: " + fechaRealizar;
    }

}
