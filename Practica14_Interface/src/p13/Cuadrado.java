package p13;

public class Cuadrado extends Figura {
	double lado;
	
	public Cuadrado(double lado,double x, double y) {
		super(x, y);
		this.lado=lado;
	}

	@Override
	public double calcularArea() {
		double resul = lado*lado;
		return resul;
	}
	

}
