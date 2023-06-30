package nosuchelmexc;
import java.util.Scanner; //se importa la clase scanner
import java.util.NoSuchElementException; //se importa la excepcion
public class NoSuchelmexc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//se instancia y crea 
        //el scaner para el ingreso de datos
         try { //se crea el bloque try q es donde queremos exceptuar el error
            System.out.print("Ingresa tu nombre: "); //se le pide al user
            String nombre = scanner.nextLine(); //se le asigna lo ingresado        
            System.out.print("Ingresa tu edad: ");
            int edad = scanner.nextInt();
            System.out.println("Nombre: " + nombre); //se imprime lo guardado
            System.out.println("Edad: " + edad);
             } catch (NoSuchElementException e) { //se crea el catch, especifi
                 //cando la excepción
            
                 System.out.println("[ERROR]")
                 ;System.out.println("No se encontro ningun elemento en la entrada.");
            //imprimimos el mensaje q explica donde cometió el error
             }
        scanner.close(); //se cierra el scan
    }
}
