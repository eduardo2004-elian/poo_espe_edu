package EduardoCamino_EvaluacionP1;

public class Pedido {
	private String producto;
    private String proveedor;
    private double precioUnitario;
    int unidades;
	public int opcion; //se defome las variables de producto, proveedor y precio unitario

    public Pedido(String producto, String proveedor, double precioUnitario, int unidades) {
        this.producto = producto; 
        this.proveedor = proveedor;
        this.precioUnitario = precioUnitario;
        this.unidades = unidades; //se le asigna lo que contiene la variable, producto, proveedor y precioUnitario y unidades
    }

    public double calcularTotal() {
        return precioUnitario * unidades; //se crea la funcion de calcular el total
    }

    public String toString() {
        return producto + "|" + proveedor + "|" + precioUnitario + "|" + unidades; //se crea la funcion para mostrar el pepido mayor
    }
}

    