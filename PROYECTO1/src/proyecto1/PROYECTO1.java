package proyecto1;
import java.util.Scanner;
public class PROYECTO1 {
    public static void main(String[] args) {
  int opcion;
    Scanner scan = new Scanner (System.in);
    configKia kia1 = new configKia ();
do{
    System.out.println("Stock de vehiculos Kia");
        System.out.println("Bienvenido a Kia");
        
        System.out.println("Kia tiene 3 modelos de vehiculos para ofrecer");
        System.out.println("1: Kia Rio");
        System.out.println("2: Kia Picanto");
        System.out.println("3: Kia Sportage");    
    System.out.println("Seleccionar el vehiculo");
    opcion = scan.nextInt();
    switch (opcion){
    case 1:        
    System.out.println("Configura tu Kia");
    configKia.KiaCaract();
    break;
    case 2: 
    }        

} while (opcion != 4);
}
}
