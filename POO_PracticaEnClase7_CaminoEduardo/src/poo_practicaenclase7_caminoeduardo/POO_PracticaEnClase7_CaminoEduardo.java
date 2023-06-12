
package poo_practicaenclase7_caminoeduardo;


public class POO_PracticaEnClase7_CaminoEduardo {


    public static void main(String[] args) {
         //instanciamos las clases y creamos objetos
        Vehiculo carro1  = new Vehiculo ();
        Automovil auto1 = new Automovil ();
        Motocicleta moto1  = new Motocicleta ();
        carro1.encendido();
        auto1.encendido();
        moto1.encendido();
        System.out.println(carro1.estado);
        System.out.println(auto1.estado);
        System.out.println(moto1.estado);        
    }
}
