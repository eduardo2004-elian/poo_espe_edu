package poo_l1_p6_metodos;
import javax.swing.JOptionPane; //añadimos, para que el JOption funcione
public class Operacion {
    int num1;// definimos variables
    int num2;
    int suma; 
    int resta; 
    int multi; 
    int division;
    //generamos metodos
    //pedimos numeros
    //muestro metodos publico
    public  void capturarnumeros() {
    num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero")); 
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero")); 
    }  
    public void sumar(){
    suma = num1+num2;    //creamos la operacion suma
    }
    public void resultado1(){ //imprimimos el resultado
        System.out.println("La suma entre los numeros digitados es:"+suma);
    }
    public void restar(){ //creamos la operacion resta
    resta = num1-num2;    
    }
    public void resultado2(){//imprimimos el resultado
        System.out.println("La resta entre los numeros digitados es:"+resta);
    }
    public void dividir(){ //creamos la funcion de dividir 
    division = num1/num2;    
    }
    public void resultado3(){//imprimimos el resultado
        System.out.println("La division entre los numeros digitados es:"+division);
    }
    public void multiplicar(){ //creamos la funcion multiplicativa
    multi = num1*num2;    
    }
    public void resultado4(){//imprimimos el resultado
        System.out.println("La multiplicacion entre los numeros digitados es:"+multi);
    }
}
