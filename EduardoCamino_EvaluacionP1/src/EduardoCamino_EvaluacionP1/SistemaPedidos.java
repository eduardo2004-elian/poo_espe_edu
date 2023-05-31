package EduardoCamino_EvaluacionP1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;//se importa los comandos para q funcione el array y el scanner

public class SistemaPedidos {

		private static List<Pedido> pedidos = new ArrayList<>();
		//se crea pedidos

	    static void mostrarMenu() {
	        System.out.println("Menú de opciones:");
	        System.out.println("1. Productos");
	        System.out.println("2. Proveedores");
	        System.out.println("3. Nuevo pedido");
	        System.out.println("4. Pedido mayor");
	        System.out.println("5. Total facturado");
	        System.out.println("6. Salir");
	        System.out.print("Ingresa una opción: ");
	    }
//se crea el menú de opciones
	    public static void ingresarProductos(Scanner scanner) { //se crea la funcion ingresar productos
	        System.out.println("Ingresando productos..."); //se coloca un mensaje que notifica q los productos están siendo ingresado

	        for (int i = 0; i < 4; i++) {
	            System.out.print("Ingrese el nombre del producto #" + (i + 1) + ": "); //se crea el bucle for 
	            String producto = scanner.nextLine();
	            // Aquí se podrá realizar más validaciones o almacenar el producto en una lista de productos
	        }

	        System.out.println("Productos ingresados correctamente."); //se coloca un mensaje que notifica q los productos están siendo ingresados
	    }

	    public static void ingresarProveedores(Scanner scanner) { ////se crea la funcion de ingresar productos
	        System.out.println("Ingresando proveedores...");

	        for (int i = 0; i < 2; i++) { //se crea ciclo for del 0 al 2, ya q se van a ingresar 2 nombres de proveedores
	            System.out.print("Ingrese el nombre del proveedor #" + (i + 1) + ": "); //se pide el nombre de los 2 proveedores
	            String proveedor = scanner.nextLine();
	        }

	        System.out.println("Proveedores ingresados correctamente.");
	    }

	    public static void ingresarPedido(Scanner scanner) { //se crea la funcion de ingresar pedidos
	        System.out.println("Ingresando nuevo pedido..."); 

	        System.out.print("Ingrese el nombre del producto: "); //se pide q ingrese el nombre del producto
	        String producto = scanner.nextLine(); //se usa el scanner con nextLine debido a q es un string

	        System.out.print("Ingrese el nombre del proveedor: ");
	        String proveedor = scanner.nextLine();

	        System.out.print("Ingrese el precio unitario: ");
	        double precioUnitario = scanner.nextDouble(); //aqui se lo usa con double pq es double

	        System.out.print("Ingrese la cantidad de unidades: ");
	        int unidades = scanner.nextInt(); //aqui con int ya q es entero

	        Pedido pedido = new Pedido(producto, proveedor, precioUnitario, unidades);//se crea el objeto pedido
	        pedidos.add(pedido);  //se añade el pedido

	        System.out.println("Pedido ingresado correctamente.");//se notifica q el pdido fue ingresado correctamente
	    }

	    public static void mostrarPedidoMayor() {// se crea la funcion demostrar pedido mayor
	        if (pedidos.isEmpty()) {
	            System.out.println("No hay pedidos registrados."); //se crea el if, que si está vacío los datos, no hay pedidos registrados
	            return;
	        }

	        Pedido pedidoMayor = pedidos.get(0);

	        for (Pedido pedido : pedidos) { //se crea la funcion for con pedidos
	            if (pedido.unidades > pedidoMayor.unidades) { //se crea el if que ordena que si las unidades del pedides menor a las unidades del pedido mayor, el pedido mayor es igual a pedidp
	                pedidoMayor = pedido;
	            }
	        }

	        System.out.println("Pedido con más unidades:"); //se mustra el pedido con mas unidades
	        System.out.println(pedidoMayor);
	    }

	    public static void mostrarTotalFacturado() { //se muestra el total facturado
	        if (pedidos.isEmpty()) {
	            System.out.println("No hay pedidos registrados."); //si pedidos está vacio, no hay pedidos registrados
	            return;
	        }

	        double totalFacturado = 0; //se inicialia el valor de total facturado en 0

	        for (Pedido pedido : pedidos) { //se crea el for que dice que para el pedido, el total facturado se le suma lo calculado en total
	            totalFacturado += pedido.calcularTotal();
	        }

	        System.out.println("Total facturado: $" + totalFacturado); //se muestra el precio final lo q se facturó totalmente
	    }
}

