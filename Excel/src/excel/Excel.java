package excel;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.File;//para hacer uso d archivos
import java.io.FileInputStream;//importacion para leer archivos
import java.io.FileNotFoundException; //libreria para exceocion x si no se encuenntra el archivo
import java.io.FileOutputStream;//importacion para crear archivos
import java.io.IOException;//importacion para exceciones
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Conexion;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;//libreria necesaria para crear archivos en excel
import org.apache.poi.ss.usermodel.Cell;//libreria para crar celdas en excel
import org.apache.poi.ss.usermodel.Row; //libreria necesaria para crear filasen excel
import org.apache.poi.ss.usermodel.Sheet; //librería para las hojas en excel
import org.apache.poi.ss.usermodel.Workbook;//libreria necesaria para crear archivos en excel
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;//Libreria para trabajar con la nueva version de excel
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;



       


public class Excel{

    public static void main(String[] args) throws IOException, SQLException{

        //crearExcel();
       //leer();
      // cargar(); //cargar a base de datos
      // modificar();
        
    }
    //METODO PARA CREAR ARCHIVOS EN EXCEL
    public static void crearExcel(){
    Workbook book = new XSSFWorkbook();//con esto podremos crear archivos en excel
    Sheet sheet = book.createSheet("Hola Java"); //con esto crearemos una nueva pestaña
    //creamos filas y columnas
    //primero la fila
    Row row = sheet.createRow(0); //0 es el valor de la fila, ya q lo haremos como arreglo, desde la posic 0
    //ahora crearemos celdas
    row.createCell(0).setCellValue("Hola inge");
    row.createCell(1).setCellValue(7.5);//double
    row.createCell(2).setCellValue(true);//boolean
    
    //haremos una formula, para eso crearemos la celda x separado
    
    Cell celda = row.createCell(3);
    
   celda.setCellFormula(String.format("1+1", "")); //recibe 2 parametros, la formula y los campos q tendrá la formula
   
   Row rowUno = sheet.createRow(1);
   rowUno.createCell(0).setCellValue(7);//double
   rowUno.createCell(1).setCellValue(8);//double
   
   Cell celdados = rowUno.createCell(2);
   celdados.setCellFormula(String.format("A%d+B%d", 2,2));
    
    try{
        try (FileOutputStream fileout = new FileOutputStream("Excel.xlsx") //con esto le indicaremos el nombre del archivo a crear
        ) {
            book.write(fileout);
            fileout.close();
        }
    }catch (FileNotFoundException ex){
        Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
    }   catch (IOException ex) {
            Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    //METODO PARA LEER ARCHIVOS EN EXCEL
    public static void leer() throws IOException{
        try {
            //con esto leemos un archivo
            FileInputStream file = new FileInputStream(new File("X:\\productos.xlsx"));
            
            //extraer la informacion del archivo
            
            XSSFWorkbook wb = new XSSFWorkbook(file);
            //vamos a indicar con q hoja vamos a trabajar
            XSSFSheet sheet = wb.getSheetAt(0);//lo tomamos como arreglo, la primera hoja en posicion 0
            //creamos un control sobre las filas y columnas, sacamos cuantas filas tiene esta hoja
            int numFilas = sheet.getLastRowNum();
            //con el siguiente for extraeremos las filas
            for(int a =0; a <= numFilas;a++){//mientras a sea menor igual al numero de filas
                //traemos a la fila 
                Row fila = sheet.getRow(a);//le indicamos la posicion, en este caso es a
                //investigamos cuantas columnas tiene
                int numCols = fila.getLastCellNum();
                //ya q sabemos el numeroo de columnas hacemos un for para extraer todas
                for(int b = 0; b<numCols;b++){
                    //ahora ya podemos y extraeremos el valor de las celdas
                    //traemos la celda
                    Cell celda = fila.getCell(b);
                    //cuantos trabajmos con excel y esta libreria, hay q especificar q tipo de celda vamos a traer desde el excel
                    //con el siguiente switch evalouamos el tipo d dato q voy a traer
                    switch(celda.getCellTypeEnum().toString()){//Lo pasamos a string para poder manipularlo con un case
                        case"NUMERIC":
                            //si es d tipo numerico hacemos lo siguiente
                            System.out.print(celda.getNumericCellValue()+" ");//dentro colocamos el valor d la celda y así traeremos el valor d tipo numerico
                            break;
                            
                        case"STRING":
                            //si es d tipo string hacemos lo siguiente
                            System.out.print(celda.getStringCellValue()+" ");//dentro colocamos el valor d la celda y así traeremos el valor d tipo numerico
                            break;
                            
                        case"FORMULA":
                            //si es d tipo formula hacemos lo siguiente
                            System.out.print(celda.getCellFormula()+" ");//dentro colocamos el valor d la celda y así traeremos el valor d tipo numerico
                            break;
                }
            }
                System.out.println(" ");//hacemos salto d linea
            }        
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    //METODO PARA CARGAR ARCHIVOS DE UN EXCEL A BASE DE DATOS MYSQL
    public static void cargar() throws IOException, SQLException{
        
        //agregamos un objeto para la conexion
        Conexion con  = new Conexion();
        PreparedStatement ps;
        
        try {
            //llamamos la conexion
            Connection conn = con.conexion();
            //con esto leemos un archivo
            FileInputStream file = new FileInputStream(new File("X:\\productos.xlsx"));
            
            //extraer la informacion del archivo
            
            XSSFWorkbook wb = new XSSFWorkbook(file);
            //vamos a indicar con q hoja vamos a trabajar
            XSSFSheet sheet = wb.getSheetAt(0);//lo tomamos como arreglo, la primera hoja en posicion 0
            //creamos un control sobre las filas y columnas, sacamos cuantas filas tiene esta hoja
            int numFilas = sheet.getLastRowNum();
            //con el siguiente for extraeremos las filas
            //AHORA VAMOS A AGREGAR LOS VALORES A LA BASE DE DATOS
            for(int a =1; a <= numFilas;a++){//mientras a sea menor igual al numero de filas
                //traemos a la fila 
                Row fila = sheet.getRow(a);//le indicamos la posicion, en este caso es a
                
                ps= (PreparedStatement) conn.prepareStatement("INSERT INTO tienda(codigo,nombre,precio,cantidad) VALUES(?,?,?,?)");
                //damos los valores d la celda y extraemos columna x columna de la siguiente forma
                ps.setString(1, fila.getCell(0).getStringCellValue());
                ps.setString(2, fila.getCell(1).getStringCellValue());
                ps.setDouble(3, fila.getCell(2).getNumericCellValue());
                ps.setDouble(4, fila.getCell(3).getNumericCellValue());
                ps.execute();
                
            }        
            conn.close();//cerramos la conexcion
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    //METODO PARA EDITAR UN ARCHIVO EN EXCEL
    public static void modificar() throws IOException{
        try {
            //con esto leemos un archivo
            FileInputStream file = new FileInputStream(new File("X:\\productos.xlsx"));
            
            //extraer la informacion del archivo
            
            XSSFWorkbook wb = new XSSFWorkbook(file);
            //vamos a indicar con q hoja vamos a trabajar
            XSSFSheet sheet = wb.getSheetAt(0);//lo tomamos como arreglo, la primera hoja en posicion 0
            
            //Ahora vamos a traer la fila
            XSSFRow fila = sheet.getRow(1); //indicamos q usaremos la 2da fila
            //hacemos un if para evaluar si la fila no existe, la creamos
            if(fila==null){
                fila = sheet.createRow(1);
            }
            //ahora q sabemos q existe, traemos a la celda q modificaremos
            XSSFCell celda = fila.createCell(1);
            //tambien evaluaremos en caso no exista la celda, la creamos
            if(celda==null){
                celda = fila.createCell(1);
            }
            //ahora q sabemos q tanto la fila como la celda existe, le asignaremos un vslor
            celda.setCellValue("HOLA MUNDO");
            //cerramos la hoja
            file.close();
            //ahora aun q lo hayamos cerrado, estableceremos como se va a llamar y donde se guardara
            FileOutputStream output = new FileOutputStream("X:\\productos_modificado.xlsx");
            wb.write(output);
            output.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
