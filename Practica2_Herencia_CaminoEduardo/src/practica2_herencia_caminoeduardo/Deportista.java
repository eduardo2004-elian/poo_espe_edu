
package practica2_herencia_caminoeduardo;

public class Deportista extends Persona {
    String deporte;
    public Deportista (String nom) { 
        super(nom);
    
}
    public void cambiarNombre(String nom){
        super.setNombre(nom);
    
}
}
