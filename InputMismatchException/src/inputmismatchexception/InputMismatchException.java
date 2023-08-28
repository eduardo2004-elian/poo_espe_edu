package inputmismatchexception;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.InputMismatchException;
public class InputMismatchException {
    public static void main(String[] args) {
        int suma = 0;
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        try
        {
        System.out.println("Introduzca un numero:");
        num1=sc.nextInt();
        System.out.println("Introduzca otro numero:");
        num2=sc.nextInt();
        suma = num1+num2;
        System.out.println("La suma es: "+suma);
        }catch(InputMismatchException e)
        {
        }
        }
}