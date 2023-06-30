
package practica10_unidad2_sobrecarga;

public class Persona {
    String nombre;
    int edad;
    int cedula;
//sobrearga de constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona(int cedula){
        this.cedula = cedula;
    }
    
    public void jugar(){ //se q es un metodo x elvoid
        System.out.println("Mi nombre es: "+ nombre + "y voy a jugar");
        
    }
    
    public void jugar(String juego){
        System.out.println("Voy a jugar "+ juego + " me gusta mucho");
    }
}
