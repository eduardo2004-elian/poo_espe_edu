package inpmisexc;
import java.util.InputMismatchException;//importamos paq para la excepcion
import java.util.Scanner;//importamos paquete para entrada de datos
public class InpMisExc {
    public static void main(String[] args) {
        int suma = 0; //declaramos suma y la asignamos con 0
        int num1,num2; //se define los 2 numeros
        Scanner sc = new Scanner(System.in); //se define el scanner
        try //se abre el bloque try
        {
        System.out.println("Introduzca un numero:"); //se le pide al usua
        num1=sc.nextInt(); //se le asigna el valor ingresado a num1
        System.out.println("Introduzca otro numero:"); 
        num2=sc.nextInt(); //se le asigna valor ing al num2
        suma = num1+num2; //se ordena q suma es igual a la suma de num1y2
        System.out.println("La suma es: "+suma); //se imprime el resultado
        }catch(InputMismatchException e){ //se le instancia objeto e
            System.out.println("[Error]: " + e.getMessage()); 
            System.out.println("No se introdujo un valor numerico: ");
        } //se imprime lo q está dentro del catch x si existe algun error
        finally {
            System.out.println("Resultado: "+suma); //se van a ejecutar
        }//tanto si ocurre un error o no lo hay.
    }
}
