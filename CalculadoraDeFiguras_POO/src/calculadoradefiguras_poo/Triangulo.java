//Clase hija denominada triangulo
package calculadoradefiguras_poo;

public class Triangulo extends Figuras {
//creamos varibales de los 3 lados q posee un triangulo
    private double lado1;
    private double lado2;
    private double lado3;

//creamos el constructor
public Triangulo (double base, double altura, double lado1, double lado2, double lado3){
super (base,altura);
this.lado1 =lado1;
this.lado2 = lado2;
this.lado3 = lado3;
}
@Override 
public double calcularArea () {//creamos el metodo calcular area para el triangulo
        return (base*altura)/2; //returnamos el valor de base multiplicado por altura, eso dividido para 2
     }     
@Override
//creamos el metodo calcular perimetro
public double calcularPerimetro(){
    return lado1+lado2+lado3;
    //retornamos el valor de la suma de los 3 lados del triangulo
}
}