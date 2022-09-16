package Drive;

import java.util.ArrayList;


public class Grupo {
    private int idGrupo;
    private ArrayList<Integer> integrantesId = new ArrayList();
    private String nombre;
    private String creador;

    public Grupo() {
    }

    public Grupo(int idGrupo, String nombre, String creador) {
        this.idGrupo = idGrupo;
        this.nombre = nombre;
        this.creador = creador;
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

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    

    
    
}
