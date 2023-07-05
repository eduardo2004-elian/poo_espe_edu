package POO_Practica14_Interfaces;

public class Circulo implements Figura, Dibujar, Rotar{
	double r, pi=3.1416;
	
	public Circulo(double r) {
		this.r=r;
	}
	@Override
	public double calcularArea() {
		return pi*r*r;
	}
	@Override
	public void dibujar() {
		System.out.println("Vas a dibujar");
	}
	@Override
	public void rodar() {
		System.out.println("Usted va a rodar");
	}
	
}
