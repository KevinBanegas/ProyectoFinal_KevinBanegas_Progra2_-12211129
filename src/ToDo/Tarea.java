package ToDo;

import java.util.Date;

public class Tarea {

    private String nombreTarea;
    private Date fechaRealizar;
    private boolean importante;
    private boolean realizado;
    private int idTarea;
    private int idCuenta;
    private int idLista;
    private String nota;

    public Tarea() {

    }

    public Tarea(String nombreTarea, Date fechaRealizar, boolean importante, boolean realizado, int idTarea, int idCuenta, int idLista, String nota) {
        this.nombreTarea = nombreTarea;
        this.fechaRealizar = fechaRealizar;
        this.importante = importante;
        this.realizado = realizado;
        this.idTarea = idTarea;
        this.idCuenta = idCuenta;
        this.idLista = idLista;
        this.nota = nota;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
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

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public int getIdLista() {
        return idLista;
    }

    public void setIdLista(int idLista) {
        this.idLista = idLista;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Tarea{" + "nombreTarea=" + nombreTarea + ", fechaRealizar=" + fechaRealizar + ", importante=" + importante + ", realizado=" + realizado + ", idTarea=" + idTarea + ", idCuenta=" + idCuenta + ", idLista=" + idLista + ", nota=" + nota + '}';
    }
    
    
}
