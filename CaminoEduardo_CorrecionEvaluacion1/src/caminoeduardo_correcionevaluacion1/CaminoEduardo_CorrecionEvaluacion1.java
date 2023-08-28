package caminoeduardo_correcionevaluacion1;
import java.util.Scanner;
public class CaminoEduardo_CorrecionEvaluacion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion ;
        NotasEstudiantes notasEstudiantes = new NotasEstudiantes();
        do {
            System.out.println("---- Menu ----");
            System.out.println("1: Agregar Notas");
            System.out.println("2: Sacar media de la nota");
            System.out.println("3: Ver aprobados");
            System.out.println("4: Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    notasEstudiantes.agregarNotas();
                    break;
                case 2:
                    notasEstudiantes.calcularPromedio();
                    break;
                case 3:
                    notasEstudiantes.mostrarAprobados();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 4);
    }
}