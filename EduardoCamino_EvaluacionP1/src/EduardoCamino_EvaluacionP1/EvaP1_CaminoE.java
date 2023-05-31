package EduardoCamino_EvaluacionP1;
import java.util.ArrayList; 
import java.util.List;
import java.util.Scanner; //se importa los comandos para q funcione el array y el scanner
class EvaluacionP1_CaminoEduardo {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); //se crea el scanner para recibir datos
    int opcion = 0; //se define la variable opcion y se la asigna con 0
    Pedido p1 = new Pedido(null, null, opcion, opcion); 
    SistemaPedidos s1 = new SistemaPedidos(); //se crea las clases pedido y SistemPedidos
    do {
        s1.mostrarMenu(); //se muestra el menu
        opcion = scanner.nextInt(); //se coloca la opción para q el scan recepte la opciones escogita
        scanner.nextLine(); // se coloca para Consumir el salto de línea

        switch (opcion) {
            case 1:
                s1.ingresarProductos(scanner); //se llama a la funcion de ingreso de datos
                break;
            case 2:
                s1.ingresarProveedores(scanner); //se llama a la funcion ingresa proveedores
                break;
            case 3:
                s1.ingresarPedido(scanner); //se llama a la funcion ingresar pedido
                break;
            case 4:
                s1.mostrarPedidoMayor(); //se llama a la funcion mostratr pedido mayor
                break;
            case 5:
                s1.mostrarTotalFacturado(); //se llama a la funcion q muestra el facturado total
                break;
            case 6:
                System.out.println("Saliendo del programa..."); //se pone el mensaje al salir del programa
                break;
            default:
                System.out.println("Opción inválida. Inténtalo nuevamente."); //se pone la opcion default
        }
    } while (opcion != 6); //se cierra el ciclo while

    scanner.close(); //se cierra la lectura scanner
}
}
