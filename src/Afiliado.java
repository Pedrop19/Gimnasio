import java.util.Scanner;

public class Afiliado extends Persona {

    private int numAfiliado;
    private int bono;

    public Afiliado(String DNI, String nombreCompleto, int edad,
            int numAfiliado, int bono) {
        super(DNI, nombreCompleto, edad);
        this.numAfiliado = numAfiliado;
        this.bono = bono;
    }

    public int getNumAfiliado() {
        return numAfiliado;
    }

    public void setNumAfiliado(int numAfiliado) {
        this.numAfiliado = numAfiliado;
    }

    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }

    public void cargarBono(int dinero) {
        switch(dinero){
            case 20:
                bono += 10;
                break;
            case 25:
                bono += 15;
                break;
            case 30:
                bono += 25;
                break;
            default:
                System.out.println("Importe no soportado");
        }

    }

    @Override
    public void entrenar() {
        if (bono > 0)
            bono--;
        else {
            Scanner sc = new Scanner(System.in);
            System.out.println("No te quedan sesiones, ¿quieres recargar el bono? [y, n]");
            if (sc.next().equals("S")) {
                System.out.println("Que cantidad quieres depositar?");
                cargarBono(sc.nextInt());
                if (bono > 0)
                    bono--;
            }
        }
    }

    @Override
    public String toString() {
        return "Afiliado [" + super.toString() + ", numAfiliado=" + numAfiliado + "]";
    }
}
