/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_l1_p6_metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author ESPE
 */
public class Operacion {
    int num1;
    int num2;
    int suma; 
    int resta; 
    int multiplicacion; 
    int division;
    

    //generamos metodos
    //pedimos numeros
    //muestro metodos publico
    public  void capturarnumeros() {

    num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero")); 
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero")); 
        // TODO code application logic here
    }  
    public void sumar(){
    suma = num1+num2;    
    }
    public void resultados(){
        System.out.println("El resultado de la suma es:"+suma);
    }
    
}
