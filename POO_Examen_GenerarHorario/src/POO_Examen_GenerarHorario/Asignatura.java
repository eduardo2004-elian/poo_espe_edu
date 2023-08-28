package POO_Examen_GenerarHorario;

public class Asignatura {
	String nombre;
	String hora;
	Laboratorios laboratorio;
	String carrera;
	String curso;
	public Asignatura(String nombre, String hora, Laboratorios laboratorio, String carrera, String curso) {
		super();
		this.nombre = nombre;
		this.hora = hora;
		this.laboratorio = laboratorio;
		this.carrera = carrera;
		this.curso = curso;
	}
}
