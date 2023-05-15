/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos_parametros_argumentos;

import javax.swing.JOptionPane;

/**
 *
 * @author ESPE
 */
public class Metodos_Parametros_Argumentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // TODO code application logic here
    Operaciones1 ope = new Operaciones1();
     int num1= Integer.parseInt(JOptionPane.showInputDialog("Deme un numero"));
     int num2= Integer.parseInt(JOptionPane.showInputDialog("Deme un numero"));
             ope.suma(num1,num2);
             ope.resultados();
    }
    
}
