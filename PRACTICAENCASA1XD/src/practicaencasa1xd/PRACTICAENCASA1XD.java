package practicaencasa1xd;

import java.util.Scanner;

public class PRACTICAENCASA1XD {
    public static void main(String[] args) {
        
        PRACENCASA_clase calcu = new PRACENCASA_clase();
        Scanner scanner = new Scanner(System.in);
     int num1 = 10;
    int num2 = 5;
        System.out.println("Seleccione una opción:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir: ");
        System.out.println("5. ¿Cual es Mayor?");
        System.out.println("6. Contador");
        System.out.println("7. CicloFor");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                calcu.sumar(num1,num2);
                break;
            case 2:
                calcu.restar(num1, num2);
                break;
            case 3:
                calcu.multiplicar(num1, num2);
                break;
            case 4:
                calcu.dividir(num1, num2);
                break;
            case 5:
                calcu.mayor(num1, num2);
                break;
            case 6:
                calcu.contador(num1);
                break;
            case 7: 
                calcu.ciclofor();
                break;
            default:
                System.out.println("Opción inválida");
} 
}
}
