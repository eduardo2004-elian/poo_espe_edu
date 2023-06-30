
package practica_sistemabancario;

public class Cuenta {
    double dinero, total;
    String nombre;
    String cedula;

    public Cuenta(double dinero, double total, String nombre, String cedula) {
        this.dinero = dinero;
        this.total = total;
        this.nombre = nombre;
        this.cedula = cedula;
    }
    public void ingreso(double deposito){
        dinero+=deposito;
    }
    public void salida(double retiro){
        dinero-=retiro;
    }
    public double total(){
        return dinero;
    }
}
