
package poo_practicaenclase7_caminoeduardo;

public class Vehiculo {
    String placa;
    int numRuedas;
    boolean encendido;
    String estado;
public void setNumeroRuedas(int ruedas){
numRuedas = ruedas;

}
public void encendido (){
    encendido = true;
    estado = "Vehiculo encendido";
}
public void apagado (){
   encendido = false;
   estado = "Vehiculo apagado";
}
}

