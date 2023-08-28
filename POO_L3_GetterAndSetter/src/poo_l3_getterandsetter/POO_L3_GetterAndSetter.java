package poo_l3_getterandsetter;
import java.util.Scanner;
public class POO_L3_GetterAndSetter {
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in); //creamos un ingreso de datos
       String nombre, apellido; //creamos variables nombre y apellido
       int edad; //creamos la variable edad
        System.out.println("Ingresar nombre"); //imprimimos la solicitud de datos
        nombre=teclado.nextLine(); //capturamos los datos ingresados (nextLine captura caracteres
        System.out.println("Ingresar apellido");
        apellido=teclado.nextLine();
        System.out.println("Ingresar edad");
        edad=teclado.nextInt();
        //creamos el objeto Persona1 (per1)
        Persona per1=new Persona();
        per1.setNombre(nombre);
        per1.setApellido(apellido);
        per1.setEdad(edad);
        //Mostramos los valores almacenados en cada atributo
        System.out.println("El nombre es: "+per1.getNombre());
        System.out.println("El apellido es: "+per1.getApellido());
        System.out.println("La edad es: "+per1.getEdad());
    }
}