package intentopooxd;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Intentopooxd {

    public static void main(String[] args) {
// Crear una instancia de la clase GestorProductos
        GestorProductos gestorProductos = new GestorProductos();
        
        // Agregar algunos productos de ejemplo
        gestorProductos.agregarProducto(new Producto("P001", "Camisa", 29.99));
        gestorProductos.agregarProducto(new Producto("P002", "Pantalon", 49.99));
        
        // Mostrar los productos disponibles
        gestorProductos.mostrarProductos();
    }
    
}


// Clase Producto que representa un producto
class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    
    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    // Getters y setters
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Producto [Codigo: " + codigo + ", Nombre: " + nombre + ", Precio: " + precio + "]";
    }
}

// Interfaz Closeable del paquete java.io
interface Closeable {
    void close();
}

// Interfaz AutoCloseable del paquete java.io
interface AutoCloseable extends Closeable {
    @Override
    void close() throws Exception;
}

// Interfaz Iterator del paquete java.util
interface Iterator<T> {
    boolean hasNext();
    T next();
}

// Excepción Remove
class RemoveException extends Exception {
    public RemoveException(String mensaje) {
        super(mensaje);
    }
}

// Excepción IOException
class IOException extends Exception {
    public IOException(String mensaje) {
        super(mensaje);
    }
}

// Excepción NextLine
class NextLineException extends Exception {
    public NextLineException(String mensaje) {
        super(mensaje);
    }
}

// Excepción Match
class MatchException extends Exception {
    public MatchException(String mensaje) {
        super(mensaje);
    }
}

// Excepción Next
class NextException extends Exception {
    public NextException(String mensaje) {
        super(mensaje);
    }
}

// Clase GestorProductos que administra una colección de productos
class GestorProductos {
    private List<Producto> productos;
    
    public GestorProductos() {
        productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public void eliminarProducto(Producto producto) throws RemoveException {
        if (productos.remove(producto)) {
            System.out.println("Producto eliminado correctamente.");
        } else {
            throw new RemoveException("Producto no encontrado.");
        }
    }
    
    public void mostrarProductos() {
        System.out.println("Productos disponibles:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
