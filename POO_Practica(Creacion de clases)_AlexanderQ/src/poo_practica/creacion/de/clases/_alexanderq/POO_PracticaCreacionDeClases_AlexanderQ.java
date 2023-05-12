//Creacion de clases
package poo_practica.creacion.de.clases._alexanderq;
public class POO_PracticaCreacionDeClases_AlexanderQ {
    /**
     * CREAMOS OBJETOS
     */
    public static void main(String[] args) {
        //Llamamoa a la clase
        Celular celu1 = new Celular();
        celu1.marca="Samsung";
        celu1.modelo="Galaxy A13";
        celu1.almace=128;
        celu1.vers="Android 12";
        celu1.ram=4;
        
        Celular celu2 = new Celular();
        celu2.marca="Xiaomi";
        celu2.modelo="Redmi Note 9";
        celu2.almace=128;
        celu2.vers="MIUI Global 13.03";
        celu2.ram=4;
        
        System.out.println("-----------Celular-----------");
        System.out.print("Marca: ");
        System.out.println(celu1.marca);
        System.out.print("Modelo: ");
        System.out.println(celu1.modelo);
        System.out.print("Almacenamiento: ");
        System.out.println(celu1.almace + " GB");
        System.out.print("Sistema: ");
        System.out.println(celu1.vers);
        System.out.print("RAM: ");
        System.out.println(celu1.ram + " GB");
        System.out.println(" ");
        System.out.print("Marca: ");
        System.out.println(celu2.marca);
        System.out.print("Modelo: ");
        System.out.println(celu2.modelo);
        System.out.print("Almacenamiento: ");
        System.out.println(celu2.almace + " GB");
        System.out.print("Sistema: ");
        System.out.println(celu2.vers);
        System.out.print("RAM: ");
        System.out.println(celu2.ram + " GB");
    }
    
}
