package Vista;

import Control.Conexion;
import com.mysql.jdbc.Connection;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Login extends JFrame {
      Conexion cc=new Conexion();
    Connection con = cc.conexion();
    private JPasswordField txtClave;
    private JTextField txtUsuario;
    private JButton boton1;
    private JButton boton2;
    private JPanel panel;  
     
    public Login(){
        this.setSize(1300,710);
        setTitle("Iniciar Sesion");
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
        ImageIcon imagen = new ImageIcon("login.png");
        labelimagen.setBounds(430,40,480,180);
        panel.add(labelimagen);
        labelimagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(labelimagen.getWidth(), labelimagen.getHeight(), Image.SCALE_SMOOTH)));
  
    }
    
    private void crearBotones(){
        //LABEL user
        JLabel label1 = new JLabel();
        label1.setText("Usuario:");
        panel.add(label1);
        //ubicar
        label1.setHorizontalAlignment(HEIGHT);
        //fuente
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("Bell MT",Font.PLAIN,20));
        label1.setBounds(410,270,200,30);
        
        //LABEL contra
        JLabel label2 = new JLabel();
        label2.setText("Contraseña: ");
        panel.add(label2);
        //ubicar
        label2.setHorizontalAlignment(HEIGHT);
        //fuente
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("Bell MT",Font.PLAIN,20));
        label2.setBounds(410,350,200,30);
        
        //CAJATEXTO USUARIO
        txtUsuario=new JTextField();
        txtUsuario.setBounds(520, 270, 250, 30);
        panel.add(txtUsuario);
        txtUsuario.setText("");
        //CAJATEXTO Contra
        txtClave=new JPasswordField();
        txtClave.setBounds(520, 350, 250, 30);
        panel.add(txtClave);
        txtClave.setText("");
        
        panel.setLayout(null);
         boton1 = new JButton("Iniciar Sesion");
        boton1.setBounds(325, 450, 250, 50);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('E');
        boton1.setForeground(Color.white);
        boton1.setBackground(Color.BLACK);
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               ValidarUsuario(); 
                     
            }
        });
       
        
        boton2 = new JButton("CERRAR");
        boton2.setBounds(650, 450, 250, 50);
        panel.add(boton2);
        boton2.setEnabled(true);
        boton2.setMnemonic('P');
        boton2.setForeground(Color.white);
        boton2.setBackground(Color.black);
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              cerrar();
              JOptionPane.showMessageDialog(null, "Hasta la proxima");
              
            }
        }); 
    }
    
    public void cerrar(){
              this.dispose();
          } 
    public void ValidarUsuario(){
        int resultado = 0;
        String usu_pass = String.valueOf(txtClave.getPassword());
        String usu_usuario = txtUsuario.getText();
        //Coneccion a la tabla usuarios
        String SQL = "SELECT * FROM usuarios where usu_usuario ='"+usu_usuario+"' and usu_pass='"+usu_pass+"'";
        
        try{
            Statement st=(Statement)con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            if(rs.next()){
                resultado=1;
                if(resultado==1){
                    Menu main = new Menu();
                    main.setVisible(true);
                    this.dispose();
                    JOptionPane.showMessageDialog(null, "Bienvenido");
                }
            }else{
               JOptionPane.showMessageDialog(null, "Usuario Incorrecto");
               cerrar();
               new Login().setVisible(true);
               
            
            }
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error Login");
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
 }




