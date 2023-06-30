
package lab2_gestiondehorarios;

import java.util.ArrayList;

class Lab_Compu extends Laboratorios {
    String lugar;
    int numComp;
    Lab_Compu(String nameLab, int capacidad, String[] equipList, int horaCierre, ArrayList<String> horario, String encargado, String lugar, int numComp) {
        super(nameLab, capacidad, equipList,horaCierre,encargado,horario);
        this.lugar=lugar;
        this.numComp=numComp;
    }
    
}
