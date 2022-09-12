package ToDo;

import java.util.ArrayList;

public class ListaTarea {

    private int idCuenta;
    private int idLista;
    private String nombreLista;

    public ListaTarea() {
    }

    public ListaTarea(int idCuenta, int idLista, String nombreLista) {
        this.idCuenta = idCuenta;
        this.idLista = idLista;
        this.nombreLista = nombreLista;
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

    public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    @Override
    public String toString() {
        return "ListaTarea{" + "idCuenta=" + idCuenta + ", idLista=" + idLista + ", nombreLista=" + nombreLista + '}';
    }
    
    
}
