package poo1_l1_p6_metodoparametrosargumentos;
import javax.swing.JOptionPane;//colocamos la funcion para que el JOption funcione
public class POO1_L1_P6_MetodoParametrosArgumentos {
    public static void main(String[] args) {
        //creamos el objeto
        OperacionesMPA ope = new OperacionesMPA();
        //solicitamos los numeros
     int num1= Integer.parseInt(JOptionPane.showInputDialog("Deme un numero"));
     int num2= Integer.parseInt(JOptionPane.showInputDialog("Deme un numero"));
     //llamamos a las funciones de suma, resta y demas
             ope.sumar(num1,num2);
             ope.resultadossum();
             ope.restar(num1,num2);
             ope.resultadosres();
             ope.dividir(num1,num2);
             ope.resultadosdiv();
             ope.multiplicar(num1,num2);
             ope.resultadosmulti();
             //imprimimos los resultados 
    }
}
