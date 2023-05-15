/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos_retornodevalores;
import javax.swing.JOptionPane;
/**
 *
 * @author ESPE
 */
public class Metodos_RetornoDeValores {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operaciones op1 = new Operaciones ();
        //pedimos los numeros, se le pide al usuario que ingtese numeros
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Deme numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Deme numero"));
        //vemos que llama ls 2 variabls y eso enviamos como argumento al metodo sumar
 
       int suma= op1.sumar(num1, num2);
       op1.resultadosum(suma);
       int resta= op1.resta(num1, num2);
       op1.resultadores(resta);      
        //presentamos resultado
        // TODO code application logic here
    }   
}
