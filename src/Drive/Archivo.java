package Drive;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

public class Archivo implements Serializable{
    private int idArchivo;
    private int idLista;
    private int idCuenta;
    private String fechaCreacion;
    private File archivo;
    
    private static final long SerialVersionUID = 123L;

    public Archivo(int idArchivo, int idLista, int idCuenta, String fechaCreacion, String archivopath) {
        this.idArchivo = idArchivo;
        this.idLista = idLista;
        this.idCuenta = idCuenta;
        this.fechaCreacion = fechaCreacion;
        archivo = new File(archivopath);
    }

    public Archivo() {
    }

    public int getIdArchivo() {
        return idArchivo;
    }

    public void setIdArchivo(int idArchivo) {
        this.idArchivo = idArchivo;
    }

    public int getIdLista() {
        return idLista;
    }

    public void setIdLista(int idLista) {
        this.idLista = idLista;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Archivo{" + "idArchivo=" + idArchivo + ", idLista=" + idLista + ", idCuenta=" + idCuenta + ", fechaCreacion=" + fechaCreacion + ", archivo=" + archivo + '}';
    }
    
    
}
