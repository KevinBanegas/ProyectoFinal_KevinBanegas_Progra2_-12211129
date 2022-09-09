package ToDo;

import java.util.ArrayList;

public class ListaTarea {

    private ArrayList<Tarea> listaTareas = new ArrayList();
    private int idLista;
    private String nombreLista;

    public ListaTarea() {
    }

    public ListaTarea(int idLista, String nombreLista) {
        this.idLista = idLista;
        this.nombreLista = nombreLista;
    }

    public ArrayList<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(ArrayList<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
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
    
    
}
