package menuconceptoside;

import java.util.Scanner;

public class MenuConceptosIDE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        while(!salir){
            System.out.println("=================================================");
            System.out.println("Menu de Opciones");
            System.out.println("[1] Conocer que es un IDE");
            System.out.println("[2] Saber para que sirve un IDE");
            System.out.println("[3] Conocer las ventajas los IDE");
            System.out.println("[4] Mostrar los IDE mas comunes al programar en Java");
            System.out.println("[5] Salir");
            System.out.println("=================================================");
            System.out.println("Seleccion una opcion del 1 al 5");
            int opt = sc.nextInt();
            sc.nextLine();
            switch(opt){
                case 1:
                    System.out.println("======================================================================================================");
                    System.out.println("QUE ES UN ENTORNO DE DESARROLLO INTEGRADO?");
                    System.out.println("Un Entorno de Desarrollo Integrado (IDE) es una aplicacion de software que combina herramientas y caracteristicas");
                    System.out.println("esenciales para el desarrollo de software en una sola plataforma. Esto incluye un editor de codigo con resaltado de sintaxis,");
                    System.out.println("sugerencias de autocompletado, un depurador para encontrar y corregir errores, asi como un compilador o interprete que permite");
                    System.out.println("ejecutar el codigo.");
                    System.out.println("El IDE proporciona una interfaz unificada que facilita la escritura, prueba y depuracion del codigo,");
                    System.out.println("reduce la necesidad de alternar entre multiples herramientas.");
                    System.out.println("======================================================================================================");
                    break;
                case 2:
                    System.out.println("======================================================================================================");
                    System.out.println("PARA QUE SIRVE UN ENTORNO DE DESARROLLO INTEGRADO?");
                    System.out.println("Un Entorno de Desarrollo Integrado sirve para optimizar y simplificar el proceso de desarrollo de software. ");
                    System.out.println("Proporciona una serie de ventajas, como el aumento de la productividad al ofrecer herramientas y caracteristicas ");
                    System.out.println("especificas para agilizar tareas comunes de programacion.");
                    System.out.println("Ademas, los IDE ayudan en la identificacion y eliminacion temprana de errores a traves de herramientas de ");
                    System.out.println("depuracion y resaltado de sintaxis, lo que ahorra tiempo y esfuerzo en la etapa de desarrollo.");
                    System.out.println("======================================================================================================");
                    break;
                case 3:
                    System.out.println("======================================================================================================");
                    System.out.println("CUALES SON LAS VENTAJAS DE USAR UN IDE?");
                    System.out.println("Las ventajas de utilizar un Entorno de Desarrollo Integrado incluyen:");
                    System.out.println("[A] Productividad Mejorada: Los IDE ofrecen caracteristicas como autocompletado, refactorizacion y sugerencias contextuales que ");
                    System.out.println( "aceleran la escritura y mejora la calidad del codigo.");
                    System.out.println("[B] Depuracion Eficiente: Las herramientas de depuracion permiten rastrear y corregir errores de manera mas eficiente, ");
                    System.out.println("lo que acelera el proceso de desarrollo.");
                    System.out.println("[C] Gestion de Proyectos: Los IDE suelen proporcionar herramientas para administrar proyectos, controlar versiones y colaborar, ");
                    System.out.println("lo que simplifica la gestion de codigos y archivos.");
                    System.out.println("[D] Integracion de Herramientas Externas: Los IDE a menudo se integran con otras herramientas y marcos, facilitando la incorporacion");
                    System.out.println( "de bibliotecas y la interaccion con servicios externos.");
                    System.out.println("======================================================================================================");
                    break;
                case 4:
                    System.out.println("======================================================================================================");
                    System.out.println("CUALES SON LOS IDE MAS COMUNES AL PROGRAMAR EN JAVA?");
                    System.out.println("Al programar en Java, algunos de los IDE mas populares y ampliamente utilizados son:");
                    System.out.println("[A] Eclipse: Eclipse es un IDE altamente personalizable y versatil que ofrece una amplia gama de complementos y herramientas para el ");
                    System.out.println("desarrollo en Java y otros lenguajes.");
                    System.out.println("[B] IntelliJ IDEA: Ampliamente conocido por su eficiencia y caracteristicas avanzadas, IntelliJ IDEA proporciona analisis de codigo ");
                    System.out.println("inteligente y sugerencias contextuales.");
                    System.out.println("[C] NetBeans: NetBeans es un IDE de codigo abierto que ofrece un conjunto completo de herramientas para el desarrollo Java, ");
                    System.out.println("incluido soporte para aplicaciones web y moviles.");
                    System.out.println("======================================================================================================");
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, seleccione alguna otra opcion");
                    break;
            }
        }
        System.out.println("Saliendo del programa, Hasta Luego!");
        sc.close();
    }    
    
}
