package POO_Practica14_Interfaces;
import java.util.Scanner;
public class Menu {
	int opc;
    double lado,radio,lado2;
    Scanner in = new Scanner(System.in);
    public void menu(){
        do{
            System.out.println("==MENU==");
            System.out.println("1. Cuadrado");
            System.out.println("2. Circulo");
            System.out.println("3. Rectangulo");
            System.out.println("4. Salir");
            opc=in.nextInt();
            in.nextLine();
            switch(opc){
                case 1:
                    cuadrado();
                    break;
                case 2:
                    circulo();
                    break;
                case 3:
                    rectangulo();
                    break;
            }
        }while(opc!=4);
    }
    public void cuadrado(){
        System.out.println("==CUADRADO==");
        System.out.println("Escriba el lado del cuadrado");
        lado=in.nextDouble();
        Cuadrado cuadrado = new Cuadrado(lado);
        System.out.println("El area del cuadrado es "+cuadrado.calcularArea());
        cuadrado.dibujar();
    }
    public void circulo(){
        System.out.println("==CIRCULO==");
        System.out.println("Escriba el radio del circulo");
        radio=in.nextDouble();
        Circulo circulo = new Circulo(radio);
        System.out.println("El area del circulo es "+circulo.calcularArea());
        circulo.dibujar();
        circulo.rodar();
    }
    public void rectangulo(){
        System.out.println("==RECTANGULO==");
        System.out.println("Escriba el lado A:");
        lado=in.nextDouble();
        System.out.println("Esciba el lado B:");
        lado2=in.nextDouble();
        Rectangulo rectangulo = new Rectangulo(lado,lado2);
        System.out.println("El area del rectangulo es: "+rectangulo.calcularArea());
        rectangulo.dibujar();
    }
}