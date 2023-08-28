//CLASE PERSONAL
package POO_Examen_GenerarHorario;
import java.util.Scanner;
public class Personal {
	Scanner sc = new Scanner (System.in);
	//definimos las clases principales
	String nombre;
	int edad;
	String ocupacion;
	//metodo constructor
	public Personal(String nommbre, int edad, String ocupacion) {
		this.nombre = nombre;
		this.edad = edad;
		this.ocupacion=ocupacion;
	}
	
	public Personal() {
	}

	public void agregarPersonal() {
                System.out.println(" ");
                System.out.println("--- INGRESE LA INFORMACIÓN DE LA PERSONA Q SOLICITA EL LABORATORIO --- ");
                System.out.print("Ingrese su nombre:");
                nombre=sc.nextLine();
                System.out.print("Ingrese su edad:");
                edad=sc.nextInt();
                sc.nextLine();
                System.out.print("Ingreses su ocupación [Estudiante/Profesor/Encargado]");
                ocupacion=sc.nextLine();
                sc.nextLine();                
            }
	}

