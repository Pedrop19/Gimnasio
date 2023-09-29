import java.util.LinkedList;

public class Seccion {
    private int id;
    private String nombre;
    private LinkedList<String> incidencias;

    public Seccion(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.incidencias = new LinkedList<String>();
    }

    public void addIncidencia(String incidencia){
        incidencias.add(incidencia);
    }

    public void removeIncidencia(){
        incidencias.removeFirst();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<String> getIncidencias() {
        return incidencias;
    }

    public void setIncidencias(LinkedList<String> incidencias) {
        this.incidencias = incidencias;
    }

    @Override
    public String toString() {
        return "Seccion [id=" + id + ", nombre=" + nombre + ", incidencias=" + incidencias + "]";
    }

}
