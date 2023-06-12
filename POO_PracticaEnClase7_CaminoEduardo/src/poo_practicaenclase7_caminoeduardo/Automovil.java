
package poo_practicaenclase7_caminoeduardo;


public class Automovil extends Vehiculo {
    boolean parabrisas;
    @Override //nos dice q estamos heredando estos metodos y los podemos utilizar
public void encendido (){
    encendido = true;
    estado = "Vehiculo encendido";
}
public void apagado (){
   encendido = false;
   estado = "Vehiculo apagado";
}
}
