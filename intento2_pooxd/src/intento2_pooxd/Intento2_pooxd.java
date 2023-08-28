package intento2_pooxd;
import java.util.Iterator;
public class Intento2_pooxd {

    public static void main(String[] args) {
        // Ejemplo de uso de las interfaces

        // Implementación de la interfaz Iterator<String>
        String[] nombres = {"Juan", "María", "Pedro", "Ana"};
        Iterable<String> iterable = new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    private int index = 0;

                    @Override
                    public boolean hasNext() {
                        return index < nombres.length;
                    }

                    @Override
                    public String next() {
                        return nombres[index++];
                    }
                };
            }
        };
        // Iterar sobre los nombres utilizando el Iterator<String>
        Iterator<String> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            String nombre = iterator.next();
            System.out.println(nombre);
        }

        // Implementación de la interfaz Closeable
        Closeable closeable = new Closeable() {
            @Override
            public void close() {
                System.out.println("Cerrando el recurso...");
            }
        };

        // Cerrar el recurso utilizando la interfaz Closeable
        closeable.close();

        // Implementación de la interfaz AutoCloseable
        AutoCloseable autoCloseable = new AutoCloseable() {
            @Override
            public void close() throws Exception {
                System.out.println("Cerrando el recurso automáticamente...");
            }
        };

        // Cerrar automáticamente el recurso utilizando la interfaz AutoCloseable
        try {
            autoCloseable.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
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