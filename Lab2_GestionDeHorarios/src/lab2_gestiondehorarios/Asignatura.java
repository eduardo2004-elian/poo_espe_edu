package lab2_gestiondehorarios;

public class Asignatura {
    String nombre;
    String hora;
    Laboratorios laboratorio;
    public Asignatura(String nombre, String hora, Laboratorios laboratorio){
        this.nombre=nombre;
        this.hora=hora;
        this.laboratorio=laboratorio;
    }
    
}
