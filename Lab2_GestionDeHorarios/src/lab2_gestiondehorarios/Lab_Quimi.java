package lab2_gestiondehorarios;

import java.util.ArrayList;

class Lab_Quimi extends Laboratorios{
    String lugar;
    int numMicros;
    public Lab_Quimi(String nameLab, int capacidad, String[] equipList, int horaCierre, ArrayList<String> horario, String encargado, String lugar, int numMicros){
    super(nameLab, capacidad, equipList, horaCierre, encargado, horario);    
    this.lugar=lugar;
    this.numMicros=numMicros;
    }
}
