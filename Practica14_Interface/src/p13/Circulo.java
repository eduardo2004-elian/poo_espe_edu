package p13;

public class Circulo extends Figura {
	double r;
	
	public Circulo() {
	}

	public Circulo(double r, double x, double y) {
		super(x, y);
		this.r=r;
	}

	@Override
	public double calcularArea() { //se crea el metodo autom, ya q es abstract, obliga
		double pi=3.1416;
		double resul = pi*(r*r);
		return resul;
	}

}
