package POO_Examen_GenerarHorario;

import java.util.ArrayList;

public class Lab_Quimi extends Laboratorios{
	String lugar; //lugar donde se encuentra ell laboratorio
	int numMicros; //numero de computadores disponibles del laboratorio
	
	public Lab_Quimi(String nameLab, int capacidad, String[] equipList, int horaCierre, String encargado,ArrayList<String> horario, String lugar, int numMicros) {
		super(nameLab, capacidad, equipList, horaCierre, encargado, horario);
		this.lugar=lugar;
		this.numMicros=numMicros;
		// TODO Auto-generated constructor stub
	}
}
