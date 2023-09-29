public abstract class Persona {
    
    private String DNI;
    private String nombreCompleto;
    private int edad;
    
    public Persona(String DNI, String nombreCompleto, int edad) {
        this.DNI = DNI;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void entrenar();

    @Override
    public String toString() {
        return "DNI=" + DNI + ", nombreCompleto=" + nombreCompleto + ", edad=" + edad;
    }
}
