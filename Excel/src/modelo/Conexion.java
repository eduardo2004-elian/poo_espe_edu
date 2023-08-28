package modelo;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class Conexion {
     private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/estudiante"; //Solo es esta base de datos porque dentro de ella estan las tablas 
    
    Connection conectar = null;
    public Connection conexion(){
        
        try{
            Class.forName(driver);
            conectar=(Connection) DriverManager.getConnection(url,user,pass);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"error de conexion "+e.getMessage());
        }
        return conectar;
    }

}
