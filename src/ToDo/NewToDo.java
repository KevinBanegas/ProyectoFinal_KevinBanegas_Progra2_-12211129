package ToDo;

import java.util.ArrayList;

public class NewToDo {
    private ArrayList<Tarea> tareasDia = new ArrayList();
    private ArrayList<Tarea> tareasImportantes = new ArrayList();
    private ArrayList<ListaTarea> listasTareas = new ArrayList();
    private ArrayList<Tarea> tareaRealizado = new ArrayList(); 

    public NewToDo() {
    }

    public ArrayList<Tarea> getTareasDia() {
        return tareasDia;
    }

    public void setTareasDia(ArrayList<Tarea> tareasDia) {
        this.tareasDia = tareasDia;
    }

    public ArrayList<Tarea> getTareasImportantes() {
        return tareasImportantes;
    }

    public void setTareasImportantes(ArrayList<Tarea> tareasImportantes) {
        this.tareasImportantes = tareasImportantes;
    }

    public ArrayList<ListaTarea> getListasTareas() {
        return listasTareas;
    }

    public void setListasTareas(ArrayList<ListaTarea> listasTareas) {
        this.listasTareas = listasTareas;
    }

    public ArrayList<Tarea> getTareaRealizado() {
        return tareaRealizado;
    }

    public void setTareaRealizado(ArrayList<Tarea> tareaRealizado) {
        this.tareaRealizado = tareaRealizado;
    }

    @Override
    public String toString() {
        return "\nTareas del Dia: " + tareasDia + "\nTareas Importantes: " + tareasImportantes + "\nListas de Tareas: " + listasTareas + "\nTareas Realizadas=" + tareaRealizado;
    }
    
    
}
