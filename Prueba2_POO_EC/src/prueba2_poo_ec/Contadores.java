package prueba2_poo_ec;
import java.util.Scanner;
public class Contadores {
    String[] nomb = new String[5];
    double[] notas = new double[5];
    Scanner sc = new Scanner(System.in);
    double sumaNotas = 0;  
    public void mayoradiez(){
        if (notas[4]>10){          
            System.out.println("El valor posicionado en el Array [4] es: " + notas[4]);
            System.out.println("Por lo tanto, SI es mayor a 10");         
        }else{
            System.out.println("El valor posicionado en el Array [4] es: " + notas[4]);
            System.out.println("Por lo tanto, NO es mayor a 10");
        }    
}   
    public void ingnomb(){
        // Generar el primer arreglo de nombres
        for (int i = 0; i < nomb.length; i++) {
            System.out.print("Ingrese el nombre de la persona numero " + (i + 1) + ": ");
            nomb[i] = sc.nextLine();
        }
    }    
    public void mostname(){
        System.out.println("Los nombres ingresados fueron:");
        for (String nombre: nomb){
            System.out.println("> "+nombre);
            System.out.println("");
        }
    }   
    public void contname(){
        System.out.println("Cantidad de nombres ingresados: " + nomb.length);
        System.out.println("");
    }    
    public void ingnotas (){  
        
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota #" + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            sumaNotas += notas[i];  
        }          
    }    
    public void mostnotas(){
    double promedio = sumaNotas / notas.length;       
        System.out.println("");
        System.out.println("Cantidad de notas ingresadas: " + notas.length);
        System.out.println("Promedio de notas: " + promedio);
        System.out.println("");
}
}