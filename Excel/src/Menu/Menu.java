package Menu;
import modelo.Conexion;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import excel.Excel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import modelo.Conexion;


/**
 *
 * @author Usuario
 */
public class Menu extends JFrame {
    
    public static void main(String[] args){
        
        Menu menu = new Menu();
        menu.setVisible(true);
}
      Conexion cc=new Conexion();
    Connection con = cc.conexion();
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
     public JPanel panel;
     private JLabel txt1;
      
     
    public Menu(){
        this.setSize(400,450);
        setTitle("MENU");
        //Para que cierre el sistema
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        //Centrar la ventana
        //setBounds(500,200,500,500);
        setLocationRelativeTo(null);
        iniciarComponentes();
    }
     private void iniciarComponentes(){
        colocarPanel();
        crearBotones();
        creacionTexto();
     
       
         
    }
    
     private void colocarPanel(){
        panel = new JPanel();
        //Damos color al panel
        panel.setBackground(Color.black);
        //poner el panel sobre la ventana registro
        this.getContentPane().add(panel);       
    }
    
    private void creacionTexto(){
        ImageIcon imagen1 = new ImageIcon("X:\\registro.png");
        txt1= new JLabel();
        txt1.setText("");  
        panel.add(txt1);
        txt1.setBounds(30, 50, 349, 133);
         txt1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(txt1.getWidth(),txt1.getHeight(), Image.SCALE_SMOOTH)));
        
    }
    
    private void crearBotones(){
        panel.setLayout(null);
         boton1 = new JButton("LEER EXCEL");
        boton1.setBounds(50, 230, 120, 50);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('a');
        boton1.setForeground(Color.white);
        boton1.setBackground(Color.black);
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Excel ex = new Excel();
                try {  
                    ex.leer();
                } catch (IOException ex1) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex1);
                }
           
               
            }
        });
        
        boton2 = new JButton("CREAR EXCEL");
        boton2.setBounds(230, 230, 120, 50);
        panel.add(boton2);
        boton2.setEnabled(true);
        boton2.setMnemonic('a');
        boton2.setForeground(Color.white);
        boton2.setBackground(Color.black);
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
       Excel ex = new Excel();
       ex.crearExcel();
               
            }
        });
        boton3 = new JButton("CARGAR EXCEL A BASE DE DATOS");
        boton3.setBounds(50, 290, 300, 50);
        panel.add(boton3);
        boton3.setEnabled(true);
        boton3.setMnemonic('a');
        boton3.setForeground(Color.white);
        boton3.setBackground(Color.black);
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
       Excel ex = new Excel();
                try {
                    ex.cargar();
                } catch (IOException ex1) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex1);
                } catch (SQLException ex1) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex1);
                }
               
            }
        });
        boton4 = new JButton("MODIFICAR EXCEL");
        boton4.setBounds(50, 350, 300, 50);
        panel.add(boton4);
        boton4.setEnabled(true);
        boton4.setMnemonic('a');
        boton4.setForeground(Color.white);
        boton4.setBackground(Color.black);
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
       Excel ex = new Excel();
                try {
                    ex.modificar();
                } catch (IOException ex1) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex1);
                }
               
            }
        });
    }
    
    public void cerrar(){
              this.dispose();
          } 
}

