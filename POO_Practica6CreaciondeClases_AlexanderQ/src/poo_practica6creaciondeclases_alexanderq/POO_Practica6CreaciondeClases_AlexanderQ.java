//Creacion de clases
package poo_practica6creaciondeclases_alexanderq;

/**
 *
 * @author ESPE
 */
public class POO_Practica6CreaciondeClases_AlexanderQ {

    public static void main(String[] args) {
        // TODO code application logic here
        Computador compu1 = new Computador();
        compu1.marca="MSI";
        compu1.procesa="Intel Core i7 13 gen";
        compu1.alma=500;
        compu1.SO="Windows 11 Pro";
        compu1.año=2020;
        
        Computador compu2 = new Computador();
        compu2.marca="Hp";
        compu2.procesa="AMD Ryzen 7";
        compu2.alma=1;
        compu2.SO="Windows 10 Pro";
        compu2.año=2020;
        
        System.out.println("-------------Computador-------------");
        System.out.print("Marca: ");
        System.out.println(compu1.marca);
        System.out.print("Procesador: ");
        System.out.println(compu1.procesa);
        System.out.print("Almacenamiento: ");
        System.out.println(compu1.alma + " GB");
        System.out.print("Sistema Operativo: ");
        System.out.println(compu1.SO);
        System.out.print("Año: ");
        System.out.println(compu1.año);
        System.out.println("");
         System.out.print("Marca: ");
        System.out.println(compu2.marca);
        System.out.print("Procesador: ");
        System.out.println(compu2.procesa);
        System.out.print("Almacenamiento: ");
        System.out.println(compu2.alma + " TB");
        System.out.print("Sistema Operativo: ");
        System.out.println(compu2.SO);
        System.out.print("Año: ");
        System.out.println(compu2.año);
        
    }
    
}
