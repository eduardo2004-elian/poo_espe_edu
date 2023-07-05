package POO_Practica14_Interfaces;

public class Rectangulo implements Figura,Dibujar {
	double ladoa, ladob;
	public Rectangulo (double ladoa, double ladob) {
		this.ladoa=ladoa;
		this.ladob=ladob;
		
	}
	@Override
	public double calcularArea() {
		return ladoa*ladob;
	}
	@Override
	public void dibujar() {
		System.out.println("Vas a dibujar");
	}
}
