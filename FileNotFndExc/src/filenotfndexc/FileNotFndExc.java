package filenotfndexc;
import java.io.File; //se importa la biblioteca para interacción con archivos
import java.io.FileNotFoundException; //se importa la excepción
import java.io.FileReader; //se importa para la lectura de archivos
public class FileNotFndExc {
    public static void main(String[] args)  {
        try { //se crea el bloque try
            //este archivo no existe
            File file = new File("C://file.txt)"); //se crea el archivo
            FileReader fr = new FileReader (file); //se lee el archivo q fue nombrado file
        }catch (FileNotFoundException e){ //se crea el catch con la excepcion necesaria
            System.out.println("El archivo no existe"); //se imprime el mensaje que
            //nos espececifica que el archivo no existe.
        }
    }
}
