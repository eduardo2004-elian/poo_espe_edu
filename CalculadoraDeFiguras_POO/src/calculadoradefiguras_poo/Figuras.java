//CLASE PADRE
package calculadoradefiguras_poo;

public class Figuras {
    //definimos atributos
    protected double base; //se define bsse en double, 
    protected double altura; //se define altura
    //creamos constructor
    public Figuras (double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea(){
        return 0;
    }
    public double calcularPerimetro(){
        return 0;
    }
}
