//Clase hija: paralelogramo
package calculadoradefiguras_poo;

public class Paralelogramo extends Figuras { //creamos la clase paralelogramo y creamos la extension con la clase plade
    private double lado1; //creamos la variable de lado1
    
    public Paralelogramo(double base,double altura, double lado1){ //creamos el metodo paralelogramo
        super (base,altura);
        this.lado1 = lado1;
    }
    @Override 
    public double calcularArea(){ //creamos el metodo calcular area
        return base * altura; //returnamos el valor de base multiplicado x altura
    }
    @Override
    public double calcularPerimetro(){ //creamos el metodo de calcular perimetro
        return 2 * (base + lado1); //retornamos el valor de base sumado con lado1 que es multiplicado por 2
    }
}
