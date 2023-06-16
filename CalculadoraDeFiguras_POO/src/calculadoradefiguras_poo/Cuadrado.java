//CLASE HIJA DENOMINADA CUADRADO
package calculadoradefiguras_poo;

public class Cuadrado extends Figuras { //se crea la clase hija y se usa la extensión de la clase padre "figuras"
//creamos constructor
public Cuadrado (double lado){
    super(lado,lado);
    }
@Override
//redefinimos el metodo para calcular el area
public double calcularArea(){ 
    return base * altura; //se retorna el valor de base multiplicado x altura
    }
@Override
public double calcularPerimetro(){ //se crea el metodo para el calculo de perimetro
return 4*base; //se returna el valor de base multiplicado x base
    }
}

   
