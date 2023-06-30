package practica_sistemabancario;

import java.util.Scanner;

public class Practica_SistemaBancario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dinero;
        double total = 0;
        String nombre, cedula;
        int opc;
        System.out.println("     _________");
        System.out.println("====|  BANCO  |====");
        System.out.println("====|EL AHORRO|====");
        System.out.println("     ¯¯¯¯¯¯¯¯¯ ");

        System.out.println("Ingrese el valor inicial que posee en la cuenta:");
        dinero=sc.nextDouble();
        System.out.println("Ingrese su nombre:");
        nombre=sc.next();
        System.out.println("Ingrese su cedula:");
        cedula = sc.next();
        
        CuentaLimitada limite = new CuentaLimitada (dinero,total,nombre,cedula);
        do{
            System.out.println("--- MENU ---");
            System.out.println("[1] Realizar deposito");
            System.out.println("[2] Retirar dinero");
            System.out.println("[3] Salida");
            opc=sc.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Ingrese el valor a depositar");
                    double ingreso= sc.nextDouble();
                    limite.limitante();
                    limite.ingreso(ingreso);
                    break;
                    
                     
            case 2: 
                System.out.println("Ingrese el valor a retirar");
                double retiro = sc.nextDouble();
                
                limite.limitante();
                limite.salida(retiro);
                break;
                
            }
        }while(opc==3);
        System.out.println("El saldo TOTAL en la cuenta es de: "+limite.total());
        System.out.println("GRACIAS POR PREFERIR NUESTRO SISTEMA BANCARIO");
    }
    
}
