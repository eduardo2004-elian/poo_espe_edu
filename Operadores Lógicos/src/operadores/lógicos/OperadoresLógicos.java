/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores.lógicos;

/**
 *
 * @author ESPE
 */
public class OperadoresLógicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int val1=1;
     int val2=1;
     System.out.println((val1==val2)&&(val1!=val2)); //false
     System.out.println((val1>val2)||(val1<val2)); //false
     System.out.println(!(val1!=val2)); //true
     
     int a= (int)(Math.random()*100);
     
     if (a>=10 && a<=60)
     {
         System.out.println(a);
     }
     
     
     
     // TODO code application logic here
    }
    
}
