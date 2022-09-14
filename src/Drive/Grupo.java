package Drive;

import java.util.ArrayList;


public class Grupo {
    private int idGrupo;
    private ArrayList<Integer> integrantesId = new ArrayList();
    private String nombre;

    public Grupo() {
    }

    public Grupo(int idGrupo, String nombre) {
        this.idGrupo = idGrupo;
        this.nombre = nombre;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public ArrayList<Integer> getIntegrantesId() {
        return integrantesId;
    }

    public void setIntegrantesId(ArrayList<Integer> integrantesId) {
        this.integrantesId = integrantesId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Grupo{" + "idGrupo=" + idGrupo + ", integrantesId=" + integrantesId + ", nombre=" + nombre + '}';
    }
    
    
}
