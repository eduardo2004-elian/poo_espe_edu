package poo_l1_p6_metodoretornodevalores;
import javax.swing.JOptionPane;
public class POO_L1_P6_MetodoRetornoDeValores {
    public static void main(String[] args) {
        Operaciones op1 = new Operaciones ();
        //pedimos los numeros, se le pide al usuario que ingtese numeros
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Deme numero"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Deme numero"));
        //vemos que llama ls 2 variabls y eso enviamos como argumento al metodo sumar
       int suma= op1.sumar(num1, num2); // llamamos a la funcion suma
       op1.resultadosum(suma); //llamamos al resultado de la suma
       int restar= op1.restar(num1, num2); //llamamos a la funcion de resta
       op1.resultadores(restar);//llamamos al resultado de la reesta
       int dividir= op1.division(num1, num2);//llamamos a la funcion dividir
       op1.resultadodiv(dividir);//llamamos al resultado de la division
       int multiplicar=op1.multiplicar(num1, num2);//llamamos a la multiplicacion
       op1.resultadomulti(multiplicar);//presentamos los resultados
    }   
    }
    
