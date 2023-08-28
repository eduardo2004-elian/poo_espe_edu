package Vista;

import Control.Conexion;
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

public class Menu extends JFrame {
      Conexion cc=new Conexion();
    Connection con = cc.conexion();
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
     public JPanel panel;
     private JLabel txt1;
      
     
    public Menu(){
        this.setSize(1300,710);
        setTitle("MENU REGISTRAR");
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
        panel.setBackground(Color.WHITE);
        //poner el panel sobre la ventana registro
        this.getContentPane().add(panel);       
    }
    
    private void creacionTexto(){
        JLabel labelimagen = new JLabel();
        ImageIcon imagen = new ImageIcon("inicio.png");
        labelimagen.setBounds(430,40,430,180);
        panel.add(labelimagen);
        labelimagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(labelimagen.getWidth(), labelimagen.getHeight(), Image.SCALE_SMOOTH)));
  
    }
    
    private void crearBotones(){
        panel.setLayout(null);
         boton1 = new JButton("ESTUDIANTES");
        boton1.setBounds(175, 450, 250, 50);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('E');
        boton1.setForeground(Color.white);
        boton1.setBackground(Color.BLACK);
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              Estudiante estu = new  Estudiante ();
              estu.setVisible(true);            
            JOptionPane.showMessageDialog(null,"Bienvenido a Registro Estudiantes");   
           dispose();
               
            }
        });
        JLabel labelimagen2 = new JLabel();
        ImageIcon imagen2 = new ImageIcon("estu.png");
        labelimagen2.setBounds(200,250,200,200);
        panel.add(labelimagen2);
        labelimagen2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(labelimagen2.getWidth(), labelimagen2.getHeight(), Image.SCALE_SMOOTH)));
  

        
        boton2 = new JButton("PROFESORES");
        boton2.setBounds(525, 450, 250, 50);
        panel.add(boton2);
        boton2.setEnabled(true);
        boton2.setMnemonic('P');
        boton2.setForeground(Color.white);
        boton2.setBackground(Color.black);
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              Profesor inicia = new  Profesor ();
              inicia.setVisible(true);  
              JOptionPane.showMessageDialog(null,"Bienvenido a Registro Profesores");   
              dispose();
            }
        });
        JLabel labelimagen3 = new JLabel();
        ImageIcon imagen3 = new ImageIcon("profe.png");
        labelimagen3.setBounds(510,225,300,275);
        panel.add(labelimagen3);
        labelimagen3.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(labelimagen3.getWidth(), labelimagen3.getHeight(), Image.SCALE_SMOOTH)));
        
        boton3 = new JButton("HORARIO");
        boton3.setBounds(925, 450, 250, 50);
        panel.add(boton3);
        boton3.setEnabled(true);
        boton3.setMnemonic('H');
        boton3.setForeground(Color.white);
        boton3.setBackground(Color.black);
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              Horario hora = new Horario ();
              hora.setVisible(true);  
              JOptionPane.showMessageDialog(null,"Bienvenido a Registro Horario");
              dispose();
            }
        });
        JLabel labelimagen4 = new JLabel();
        ImageIcon imagen4 = new ImageIcon("hora.png");
        labelimagen4.setBounds(925,258,250,190);
        panel.add(labelimagen4);
        labelimagen4.setIcon(new ImageIcon(imagen4.getImage().getScaledInstance(labelimagen4.getWidth(), labelimagen4.getHeight(), Image.SCALE_SMOOTH)));
        
    }
    
    public void cerrar(){
              this.dispose();
          } 
}