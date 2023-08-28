//CREACIÓN DE CLASES
package poo_practicacreacióndeclases_eduardoc;
public class POO_PracticaCreaciónDeClases_EduardoC {
//CREAMOS OBJETOS
    public static void main(String[] args) {
        //Llamamos a la clase
        Futbolista fut1 = new Futbolista (); //creamos el objeto numero 1
        fut1.nombre="Leo Messi"; //definimos cada variable del objeto numero 1
        fut1.apodo="La Pulga";
        fut1.posición="EXD-SD";
        fut1.edad=35;
        fut1.estatura=167;
        Futbolista fut2 = new Futbolista (); //creamos el objeto numero  2
        fut2.nombre="Neymar Jr"; //definimos cada variable del objeto numero 2
        fut2.apodo="Ney";
        fut2.posición="EXI-SD";
        fut2.edad=31;
        fut2.estatura=174;
        Futbolista fut3 = new Futbolista (); //creamos el objeto numero 3
        fut3.nombre="Cristiano Ronaldo"; //definimos cada variable del objeto numero 3
        fut3.apodo="El Bicho - Cr7 - Comandante";
        fut3.posición="CD";
        fut3.edad=37;
        fut3.estatura=185;
        Futbolista fut4 = new Futbolista (); //creamos el objeto numero4
        fut4.nombre="Moises Caicedo"; //definimos cada variable del objeto numero 4
        fut4.apodo="La Moi";
        fut4.posición="MC-MCD";
        fut4.edad=21;
        fut4.estatura=178;
        Futbolista fut5 = new Futbolista (); //creamos el objeto numero1
        fut5.nombre="Antonio Valencia"; //definimos cada variable del objeto numero 1
        fut5.apodo="El tren Amazonico";
        fut5.posición="LD-MDD";
        fut5.edad=37;
        fut5.estatura=180;
        System.out.println("-----------Futbolista #1-----------");
        System.out.print("Nombre: ");
        System.out.println(fut1.nombre);
        System.out.print("Apodo: ");
        System.out.println(fut1.apodo);
        System.out.print("Posicion: ");
        System.out.println(fut1.posición);
        System.out.print("Edad: ");
        System.out.println(fut1.edad+" años");
        System.out.print("Estatura: ");
        System.out.println(fut1.estatura + " cm");
        System.out.println("-----------Futbolista #2-----------");
        System.out.print("Nombre: ");
        System.out.println(fut2.nombre);
        System.out.print("Apodo: ");
        System.out.println(fut2.apodo);
        System.out.print("Posicion: ");
        System.out.println(fut2.posición);
        System.out.print("Edad: ");
        System.out.println(fut2.edad+" años");
        System.out.print("Estatura: ");
        System.out.println(fut2.estatura + " cm");
        System.out.println("-----------Futbolista #3-----------");
        System.out.print("Nombre: ");
        System.out.println(fut3.nombre);
        System.out.print("Apodo: ");
        System.out.println(fut3.apodo);
        System.out.print("Posicion: ");
        System.out.println(fut3.posición);
        System.out.print("Edad: ");
        System.out.println(fut3.edad+" años");
        System.out.print("Estatura: ");
        System.out.println(fut3.estatura + " cm");
        System.out.println("-----------Futbolista #4-----------");
        System.out.print("Nombre: ");
        System.out.println(fut4.nombre);
        System.out.print("Apodo: ");
        System.out.println(fut4.apodo);
        System.out.print("Posicion: ");
        System.out.println(fut4.posición);
        System.out.print("Edad: ");
        System.out.println(fut4.edad+" años");
        System.out.print("Estatura: ");
        System.out.println(fut4.estatura + " cm");
        System.out.println("-----------Futbolista #5-----------");
        System.out.print("Nombre: ");
        System.out.println(fut5.nombre);
        System.out.print("Apodo: ");
        System.out.println(fut5.apodo);
        System.out.print("Posicion: ");
        System.out.println(fut5.posición);
        System.out.print("Edad: ");
        System.out.println(fut5.edad+" años");
        System.out.print("Estatura: ");
        System.out.println(fut5.estatura + " cm");
    }
}