
package practica10_unidad2_sobrecarga;

public class Practica10_Unidad2_Sobrecarga {

    public static void main(String[] args) {
        Persona per1 = new Persona("Javier",25);
        per1.jugar();
        
        Persona per2 = new Persona(230086083);
        per2.jugar("furvo");
        
    }
}
