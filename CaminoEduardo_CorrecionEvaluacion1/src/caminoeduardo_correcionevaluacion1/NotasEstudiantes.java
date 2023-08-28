package caminoeduardo_correcionevaluacion1;
import java.util.Scanner;
public class NotasEstudiantes {
    private double[][] notas = new double[2][5];
    private String[] nombres = new String[2];
    public void agregarNotas() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese las notas del estudiante " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
            scanner.nextLine(); // Limpiar el buffer del scanner
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }
        System.out.println("Notas agregadas exitosamente.");
        System.out.println();
    }
    public void calcularPromedio() {
        for (int i = 0; i < 2; i++) {
            double suma = 0;
            for (int j = 0; j < 5; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / 5;
            System.out.println("El promedio de notas del estudiante " + nombres[i] + " es: " + promedio);
        }
        System.out.println();
    }
    public void mostrarAprobados() {
        System.out.println("Estudiantes aprobados:");
        for (int i = 0; i < 2; i++) {
            double suma = 0;
            for (int j = 0; j < 5; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / 5;
            if (promedio >= 14) {
                System.out.println("-> " + nombres[i]);
            }
        }
        System.out.println();
    }    
}