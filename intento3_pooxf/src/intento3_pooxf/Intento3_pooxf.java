package intento3_pooxf;
import java.util.InputMismatchException; //librería q se importa, para una excepción que se lanza cuando el usuario ingresa
//un valor incorrecto.
import java.util.Random; //es utilizada para generar numeros aleatorios
import java.util.Scanner; //ingresar datos en consola
public class Intento3_pooxf {
    public static void main(String[] args) {
        // Generar un número aleatorio entre 1 y 100
        Random random = new Random();
        int numeroAdivinar = random.nextInt(100) + 1;
        /*
Se crea una instancia de la clase Random para generar números aleatorios. 
Luego, se genera un número aleatorio entre 1 y 100 y se almacena en la variable numeroAdivinar.
*/
        // Interacción con el usuario
        Scanner scanner = new Scanner(System.in); //lee la entrada del usuario desde la consola
        boolean adivinado = false; //el valor booleano indica si se ha adivinado el numero, se lo inicializa en falso, 
        //para q luego se convierta en true
        int intentos = 0; //lleva contando el numero de intentos de adivinsr, se inicializa en 0 para irse sumando luego.

        System.out.println("Bienvenido al juego de adivinanzas!");

        while (!adivinado) {
            System.out.println("Intente adivinar el numero en el que estoy pensando ");
            System.out.println("Pista: es del 1 al 100 ");
            System.out.println(" ");
            System.out.println("Ingrese un numero:");
            try {
                int numero = scanner.nextInt(); //se lee el dato ingresado mediante el scanner
                intentos++;  //se incrementa el numero de intentos
 
                if (numero == numeroAdivinar) { //ciclo if, nos dice q si el numero es igual a el numero a adivinar generado randomicamente
                    //muestra un mensaje de felicitaciones
                    System.out.println("Felicitaciones! Has adivinado el numero en " + intentos + " intentos.");
                    adivinado = true; //el valor booleando denominado adivinado, cambia a true
                } else if (numero < numeroAdivinar) { //caso contrario, si, el numero ingresado es menor al numero a adivinar, se muestra que
                    //el numero ingresado es menr y se le pide q ingrese uno mayor
                    System.out.println("El numero que ingresaste es menor. Intenta con uno mayor.");
                } else { //cas contrario, lo mismo pero con numero mayor y pide uno menor
                    System.out.println("El numero que ingresaste es mayor. Intenta con uno menor.");
                }
            } catch (InputMismatchException e) { //nos dice q si el numero no es entero, no detenga el programa, solo mnuestre el error y lo describa, 
                //pero se mantenga en ejecución
                System.out.println("Error: Debes ingresar un numero entero. Intenta nuevamente.");
                scanner.nextLine(); // Limpiar el búfer del scanner
            }
        }
        scanner.close(); //cierra el scanner
        System.out.println("Gracias por jugar!"); //muestra un mensaje de agradecimiento
    }
}