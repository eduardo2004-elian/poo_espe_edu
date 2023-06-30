
package practica_sistemabancario;

public class CuentaLimitada extends Cuenta{
double maxEntrada = 1000;
double maxSalida =1000;
public CuentaLimitada (double dinero, double total, String nombre, String cedula){

    super(dinero, total,nombre, cedula);
}
public void limitante(){
    System.out.println("El vlor maximo de entrada es: "+ maxEntrada+ "$");
    System.out.println("El valor maximo de salida es: "+ maxSalida+ "$");
}
@Override
public void ingreso(double deposito){
    if (deposito<=maxEntrada){
        dinero+=deposito;
    }else{
        System.out.println("EL SALDO QUE DESEA INGRESAR, EXCEDE LOS LIMITES");
    }

}
@Override
public void salida (double retiro){
    if(retiro<=maxSalida){
        dinero=retiro;
    }else{
        System.out.println("EL SALDO QUE DESEA RETIRAR, EXCEDE LOS LIMITES ");
    }

}
}
