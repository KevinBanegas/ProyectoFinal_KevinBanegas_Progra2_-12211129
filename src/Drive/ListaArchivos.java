package Drive;

public class ListaArchivos {
    private int idLista;
    private int idCuenta;
    private String nombreLista;

    public ListaArchivos(int idLista, int idCuenta, String nombreLista) {
        this.idLista = idLista;
        this.idCuenta = idCuenta;
        this.nombreLista = nombreLista;
    }

    public ListaArchivos() {
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

    public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    @Override
    public String toString() {
        return "ListaArchivos{" + "idLista=" + idLista + ", idCuenta=" + idCuenta + ", nombreLista=" + nombreLista + '}';
    }
    
    
}
