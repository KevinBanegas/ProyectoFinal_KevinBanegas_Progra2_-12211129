package ToDo;

import java.util.ArrayList;

public class ListaTarea {

    private ArrayList<Tarea> listaTareas = new ArrayList();
    private String nombreLista;

    public ListaTarea() {
    }

    public ListaTarea(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    public ArrayList<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(ArrayList<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    @Override
    public String toString() {
        return "\nNombre de Lista:" + nombreLista + "\nLista de Tareas: " + listaTareas;
    }

}
