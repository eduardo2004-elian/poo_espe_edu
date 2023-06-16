//Clase hija: rectangulo
package calculadoradefiguras_poo;

public class Rectangulo extends Figuras{ //creamos la clae rectangulo y se le añade la extension a la clase padre figuras
    private double lado1;

//creamos el constructor
public Rectangulo (double base, double altura, double lado1){
super(base,altura);
this.lado1 = lado1;
    }

@Override
public double calcularArea(){ //se crea el metodo para calcular el area del rectangulo
    return base * lado1; //se retorna el valor de base multiplicado por lado1
}
@Override
public double calcularPerimetro (){
    return 2 * (base+lado1); //se retorna el valor de 2 multiplicado por la suma de base + lado1
}
}