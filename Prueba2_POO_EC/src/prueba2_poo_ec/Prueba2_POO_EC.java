package prueba2_poo_ec;

import java.util.Scanner;

public class Prueba2_POO_EC {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    Contadores conta1 = new Contadores (); 
        int opt = 0;
    do {
        System.out.println("");
        System.out.println("    \033[47m--------- MENU --------");
        System.out.println("[1] Ingresar 5 nombres");
        System.out.println("[2] Mostrar los nombres ingresados");
        System.out.println("[3] Contar los nombres ingresados");
        System.out.println("[4] Ingresar 5 notas");
        System.out.println("[5] Contar e imprimir el promedio de las notas ingresadas");
        System.out.println("[6] Mostrar si el numero que es encuentra en el array numero [4] es mayor a 10");  
        opt =sc.nextInt();
        switch (opt){
              case 1:
                  conta1.ingnomb();
                  break;
              case 2:
                  conta1.mostname();
                  break;
              case 3: 
                  conta1.contname();
                  break;
              case 4:
                  conta1.ingnotas();
                  break;
              case 5:
                  conta1.mostnotas();
                  break;
              case 6:
                  conta1.mayoradiez();
                  break;
              default:
                  System.out.println("Opción invalida, intente nuevamente");
        }            
    }while(opt!=6);
  }
}