package POO_Examen_GenerarHorario;

import java.util.ArrayList;

public class Lab_Compu extends Laboratorios {
	String lugar; //lugar donde se encuentra ell laboratorio
	int numComp; //numero de computadores disponibles del laboratorio
	public Lab_Compu(String nameLab, int capacidad, String[] equipList, int horaCierre, ArrayList<String>horario, String encargado,String lugar, int numCompu) {
		super(nameLab, capacidad, equipList, horaCierre, encargado, horario);
		this.lugar=lugar;
		this.numComp=numComp;

	}

}
