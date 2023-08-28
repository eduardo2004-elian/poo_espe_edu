package poo_l1_p6_metodoretornodevalores;
public class Operaciones {
public int sumar(int num1, int num2){
int suma = num1+num2; //declaramos la variable suma, y lo que la define
//retorna la suma
return suma;
}
public void resultadosum (int suma){
    System.out.println("La suma de los numeros digitados es:"+suma);
    //imprimimos el resultado de la suma
}
public int restar(int num1, int num2){
int resta = num1-num2;
//retorna la resta
return resta;
}
public void resultadores (int resta){
    System.out.println("La resta de los numeros digitados es:"+resta);
    //imprimimos el resultado de la resta
}
public int division(int num1, int num2){
int dividir = num1/num2;
//retorna la division
return dividir;
}
public void resultadodiv (int dividir){
    System.out.println("La division de los numeros digitados es:"+dividir);
//imprimimos el resultado de la division
}
public int multiplicar(int num1, int num2){
int multiplicar = num1-num2;
//retorna la multiplicacion
return multiplicar;
}
public void resultadomulti (int multiplicar){
    System.out.println("La multiplicacion de los numeros digitados es:"+multiplicar);
//imprimimos el resultado de la multiplicacion
}
}
