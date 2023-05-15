/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos_parametros_argumentos;
/**
 *
 * @author ESPE
 */
public class Operaciones1 {
    //cuando se declara fuera de los metodos, las variables son globales 
    //cuando se las declara dentro, las varibales son locales   
    int suma;
    int resta;
    int multipli;
    int div;
    //generamos metodos
    //nuestro metodo es publico   
    //creamos metodos para sumar numeros tpo publivo sin retornar nada, ya q void no tiene retorno
    //metodo sumar

public void suma(int num1,int num2){
suma=num1+num2;
}
public void resultados (){
System.out.println("El resultado de la suma es: "+suma);
}
}