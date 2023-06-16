package calculadoradefiguras_poo;

import java.util.Scanner;

public class CalculadoraDeFiguras_POO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);//defininimos la clase scanner
        int opcion = 0; //definimos la varible opcion y la inicializamos en 0
        
        while (opcion !=3){//creamos un ciclo while q repita lo siguiente, mientras opcion sea diferente a 3
            System.out.println("CALCULADORA DE FIGURAS GEOMETRICAS");
            System.out.println("[1] Conocer Area");
            System.out.println("[2] Conocer perimetro");
            System.out.println("[3] Salir del programa");
            System.out.print("    Ingrese una opcion:");
            opcion = scanner.nextInt(); //a opcion le asignamos el valor seleccionado x el usuario
            
            switch (opcion){//creamos un ciclo switch con el parametro de opcion dentro
                case 1: 
                    System.out.println("Ingrese la cantidad de figuras que desea conocer su area: ");
                    int cantiFigAr = scanner.nextInt(); //creamos la variable cantifigar q representa la cantidad de figuras de las q se le sacará el area
                    //en el caso, pedimos que ingrese la cantidad de figuras q desea conocer el area y creamos la variable cantidadFigurasAre
                    //luego a la variable se le asigna el valor ingresado por el usuario
                    for (int i= 0; i < cantiFigAr; i++){ //creamos un ciclo for, donde ordenamos que mientras i sea menor a la cantidad defiguras que se encontrará el area, i se incrementara en uno, es decir, el menú de figuras, se repetirá la cantidad de veces que tenga el valor de i.
                        System.out.println("Seleccione la figura que desea conocer su area");
                        System.out.println("[1] Cuadrado");
                        System.out.println("[2] Triangulo");
                        System.out.println("[3] Rectangulo");
                        System.out.println("[4] Paralelogramo"); //creamos el menu
                        int opMen2 = scanner.nextInt(); //creamos la variable entera opMen2 que representa a la opcion selecciona en el menu recien mostrado
                        
                        double base, altura,lado1,lado2,lado3; //creamos las variables que recibirán los valores ingresados x el ususario 
                        
                        switch (opMen2){
                            case 1:
                                System.out.print("Ingrese el lado del cuadrado:");
                                double ladoCuadrado = scanner.nextDouble(); //creamos la variable ladocuadrado que tendrá el valor que el usuario ingrese
                                Cuadrado cuadrado = new Cuadrado (ladoCuadrado); //creamos el objeto cuadrado, que recibe el parametro de lado
                                System.out.println("El area del cuadrado es: " + cuadrado.calcularArea());//imprimimos el resultado y llamamos al metodo de calculo de area, con el objeto cuadrado, creado en la clase Cuadrado
                                break;//usamos brake para finalizar ahí el caso1
                            case 2:
                                //le pedimos al usuario los datos necesarios para el calculo del area
                                System.out.print("Ingrese la base del triangulo: ");
                                base = scanner.nextDouble(); //asignamos el valor ingresado, a base
                                System.out.print("Ingrese la altura del triangulo: ");
                                altura = scanner.nextDouble();
                                Triangulo triangulo = new Triangulo (base,altura,0,0,0); //creamos el objeto triangulo, instanciado en la clase Triangulo, haciendo uso de los atributos base, altura y los 3 lados
                                System.out.println("El area del triangulo es: "+ triangulo.calcularArea()); //imprimimos el texto y el resultado, llamando al metodo de calculo de area, mediante el objeto triangulo
                                break;
                            case 3: 
                                //solicitamos al usuario q ingrese los datos para el calculo del area del rectangulo
                                System.out.print("Ingrese la base del rectangulo: ");
                                base = scanner.nextDouble();
                                System.out.print("Ingrese el lado del rectangulo: ");//asignamos el valor seleccionado x el usuario a bas y por ultimo a lado1
                                lado1= scanner.nextDouble();
                                Rectangulo rectangulo  = new Rectangulo (base,0,lado1); //creamos el objeto rectangfulo, instanciado en la clase Rectangulo, recibiendo los parametros de altura, base y lado1
                                System.out.println("El area del rectangulo es: " + rectangulo.calcularArea()); //se imprime resultados y se llama al metodo de calculo de area, mediante el objeto creado
                                break;
                            case 4:
                                //solicitamos los datos necesarios al usuario
                                System.out.print("Ingrese la base del paralelogramo: ");
                                base =  scanner.nextDouble();
                                System.out.print("Ingrese la altura del paralelogramo: ");
                                altura = scanner.nextDouble();
                                Paralelogramo paralelogramo = new Paralelogramo(base,altura,0); //creamos el objeto paralleogramo, instancionado en el metodo paralelogramo, q recibe los parametros de base, altura y lado1
                                System.out.println("El area del paralelogramo es: "+ paralelogramo.calcularArea()); //imprimimos el resultado y llamamos al metodo de calcular area, mediante el objeto paralelogramo
                                break;
                            default:
                                System.out.println("Opcion NO valida");
                                break;
                        }
                }
                break;    
                   //creamos la opción 2, la de conocer el area de perimetro
                case 2: System.out.println("Ingrese la cantidad de figuras que desea conocer el perimetro");//solicitamos al usuario q ingrese la cantidad de figuras q desea
                int cantFigPer = scanner.nextInt(); //asignamos el valor escrito x el usuario, a la variable de la cantidad de figuras a calcular
                //creamos un ciclo for    
               for (int i = 0; i < cantFigPer; i++){
                    System.out.println("Seleccione la figura a encontrar el perimetro");
                    System.out.println("[1] Cuadrado");
                    System.out.println("[2] Triangulo");
                    System.out.println("[3] Rectangulo");
                    System.out.println("[4] Paralelogramo");
                    System.out.print("Ingrese una opcion:");
                    int opMen2 = scanner.nextInt(); //se le asigna el valor escrito x el usuario a la varible de opMen2 q hace referencnia al menu2
                    //se crean las variables necesarias
                    double lado,lado1,lado2,lado3;
                    //creamos un switch con las 5 opciones disponibles
                    switch (opMen2) {//el selector, recibe el parametro de la opcione sleeccionad
                        case 1:
                            System.out.print("Ingrese el lado del cuadrado: "); //se le solicita al usuario, q ingrese el valor del lado del cuadrado
                            lado = scanner.nextDouble(); //se le asigna el valor escrito, a la varibale lado
                            Cuadrado cuadrado = new Cuadrado (lado); //se crea el objeto q recibe el parametro de lado
                            System.out.println("El perimetro del cuadrado es: " +cuadrado.calcularPerimetro()); //se imprime el resultado, llamando al metodo mediante el objeto
                            break;
                        case 2:
                            //se le solicita al usuario q ingrese los 3 lados del triangulo
                            System.out.print("Ingrese el lado numero 1 del triangulo: ");
                            lado1=  scanner.nextDouble();
                            System.out.print("Ingrese el lado numero 2 del triangulo: ");
                            lado2= scanner.nextDouble();
                            System.out.print("Ingrese el lado numero 3 del triangulo: ");
                            lado3 = scanner.nextDouble();
                            //se le asigna los 3 valores escritos x el usuario a las varibales lado1,2 y 3
                            Triangulo triangulo = new Triangulo(0,0,lado1,lado2,lado3); //se crea el objeto triangulo instanciado en la clase triangulo, recibiendo los parametros de los 3 lados, se colocó los 0s, ya que para conocer el perimetro de un triangulo no es necesario conocer su base ni altura, solo la medida de sus 3 lados
                            System.out.println("El perimetro del triangulo es: "+ triangulo.calcularPerimetro()); //se imprime el perimetro calculado, llamadno al metodo mediante el objeto
                            break;
                        case 3: 
                            System.out.print("Ingrese la base del rectangulo: ");
                            double base = scanner.nextDouble();
                            System.out.print("Ingrese el lado del rectángulo: ");
                            lado1 = scanner.nextDouble();
                            Rectangulo  rectangulo = new Rectangulo(base,0,lado1); //se crea el objeto y se le asigna los parametros de base y lado, se coloca el 0 para el valor de altura
                            System.out.println("El perimetro del rectangulo es: "+ rectangulo.calcularPerimetro());
                            break;
                        case 4:
                            System.out.print("Ingrese la base del paralelogramo: ");
                            base = scanner.nextDouble();
                            System.out.print("Ingrese el lado del paralelogramo: ");
                            lado1 = scanner.nextDouble();
                            Paralelogramo paralelogramo = new Paralelogramo (base, 0, lado1);
                            System.out.println("El perimetro del paralelogramo es: "+ paralelogramo.calcularPerimetro() );
                            break;
                        default:
                            System.out.println("Opcion No valida");
                            break;
                    }
                    }
               break;

            case 3: 
            System.out.println("Gracias por usar el programa ;3");
            break;
            default:
            System.out.println("Opcion NO VALIDA");
            break;
            
            
        }
    }
    scanner.close();
}
}