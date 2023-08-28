//CLASE PADRE LABORATORIOS
package POO_Examen_GenerarHorario;
import java.util.ArrayList;
import java.util.Collections;
public class Laboratorios {
	//definimos los atributos principales
    String nameLab,encargado;
    int capacidad;
    String[] equipList;
    int horaCierre;
    ArrayList<String> horario = new ArrayList<>(Collections.nCopies(24,null));
    //crearemos el metodo constructor q inicializará los atributos 
    public Laboratorios(String nameLab, int capacidad, String[]equipList, int horaCierre, String encargado, ArrayList<String>horario){
        this.capacidad=capacidad;
        this.equipList=equipList;
        this.nameLab=nameLab;
        this.horaCierre=horaCierre;
        this.encargado=encargado;
        this.horario=horario;
    }
    public Laboratorios(ArrayList<String>horario){
        this.horario=horario;
    }
    public boolean disponibilidad(int hora, String asignatura){
        if(horario.get(hora)==null&& hora<horaCierre){
            horario.add(hora, nameLab);
            return true;
        }else{
            return false;
        }
    }
}
