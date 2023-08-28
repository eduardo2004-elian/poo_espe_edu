package poo1_l1_p6_metodoparametrosargumentos;
public class OperacionesMPA {
//cuando se declara fuera de los metodos, las variables son globales, y si es dentro, locales  
int suma; int resta; int multi; int div;
//generamos metodos, nuestro metodo es publico  
//creamos metodos para sumar numeros tpo publico sin retornar nada, ya q void no tiene retorno
//metodo sumar
public void sumar(int num1,int num2){
suma=num1+num2;
}
public void resultadossum (){
System.out.println("El resultado de la suma es: "+suma);
}
public void restar(int num1,int num2){
resta=num1-num2;
}
public void resultadosres (){
System.out.println("El resultado de la resta es: "+resta);
}
public void dividir(int num1,int num2){
div=num1/num2;
}
public void resultadosdiv (){
System.out.println("El resultado de la division es: "+div);
}
public void multiplicar(int num1,int num2){
multi=num1*num2;
}
public void resultadosmulti (){
System.out.println("El resultado de la multiplicacion es: "+multi);
}
}
