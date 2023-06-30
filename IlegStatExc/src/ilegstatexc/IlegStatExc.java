package ilegstatexc; 
import java.util.Scanner; //se importa clase scanner
public class IlegStatExc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //se crea el scan
        try{ //se crea el bloque try
        System.out.print("Ingresa un numero entero: "); //se le pide datos
            int numero = scanner.nextInt(); //se le asigna lo ingresado
            scanner.close(); //se cierra el scanner (error voluntario)
            System.out.println("Ingrese otro numero:");//se le solicita al usu
            int otroNumero = scanner.nextInt(); //se vuelve asignar el scanner
            //el error se encuentra aqui, ya q el scanner ya fue cerrado
            System.out.println("La suma de los numeros es: "+(numero+otroNumero));
            //se imprime el resultado de los numeros (si el error no existiera )
        }catch (IllegalStateException e){ //se coloca el catch con la excepción
            System.out.println("[ERROR] --> "+ e.getMessage()); //se imprime
            //la palabra error y la descripción del error.
        }
    }
    }
    
