//CLASE PADRE O BASE DE LOS DEMAS LABS
package lab2_gestiondehorarios;

import java.util.ArrayList;
import java.util.Collections;

public class Laboratorios {
    //definimos atributos principales
    String nameLab, encargado;
    int capacidad;
    String[] equipList;
    int horaCierre;
    ArrayList<String> horario = new ArrayList<>(Collections.nCopies(24,null));
    //creamos el constructor que va a inciializar los atributos
    public Laboratorios (String nameLab, int capacidad, String[]equipList, int horaCierre, String encargado, ArrayList<String>horario){
        this.capacidad=capacidad;
        this.equipList=equipList;
        this.nameLab= nameLab;
        this.horaCierre=horaCierre;
        this.encargado= encargado;
        this.horario=horario;
    }
    //nmetodo para verificar la disponibilidad del lab
    public boolean disponibilidad(int hora, String asignatura){
        if(horario.get(hora)==null&& hora<horaCierre){
            horario.add(hora, asignatura);
            return true;
        }else{
            return false;
        }
    }
}
