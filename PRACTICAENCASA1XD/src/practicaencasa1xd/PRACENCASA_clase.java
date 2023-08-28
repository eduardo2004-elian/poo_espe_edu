package practicaencasa1xd;
public class PRACENCASA_clase {
    int suma ;
    int resta;
    int multiplicacion;
    int division;
public void sumar (int num1,int num2){
suma = num1+num2;
    System.out.println("La suma es " + suma);
}
public void restar (int num1,int num2){
resta = num1-num2;
System.out.println("La resta es " + resta);
}
public void multiplicar (int num1,int num2){
multiplicacion = num1*num2;
System.out.println("La multiplicacion es " + multiplicacion);
}
public void dividir (int num1,int num2){
division = num1/num2;
System.out.println("La division es " + division);
}
public void mayor (int num1,int num2){
if (num1>num2) {
    System.out.println("El primer numero es mayor que el segundo numero");
} else{ System.out.println("El segundo numero, es mayor que el primero");
}
}
public void contador (int num1){
while (num1 < 20) {
            System.out.println("Contador: " + num1);
            num1++;
        }
}
public void ciclofor (){
for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);
        }
}
}