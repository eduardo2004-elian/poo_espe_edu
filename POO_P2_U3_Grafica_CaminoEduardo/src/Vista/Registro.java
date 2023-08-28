
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
public class Registro extends JFrame{
    //creacion de una ventana grafica con JFrame
    public JPanel panel;
    public Registro(){
        this.setSize(500,500);
        setTitle("Registro");
        //para cerrar sistema
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //para centrar la ventana
        setBounds(500,200,500,500);
        setLocationRelativeTo(null);
        iniciarComponentes();
        
    }
    public void iniciarComponentes(){
        colocarPanel();
        colocarEtiquetas();
        colocarBotones();
        colocarCajaTexto();
        colocarAreaTexto();
    }
    public void colocarPanel(){
        panel = new JPanel();
        //dar color al panel
        panel.setBackground(Color.CYAN);
        //poner el panel sobre la ventana registro
        this.getContentPane().add(panel);
    }
    public void colocarEtiquetas(){
        JLabel label = new JLabel("REGISTRAR",SwingConstants.CENTER);
        panel.add(label);
        panel.setLayout(null);
        label.setBounds(80,10,350,50);
        label.setForeground(Color.BLACK);
        label.setBackground(Color.LIGHT_GRAY);
        label.setOpaque(true);
        
        JLabel label1 = new JLabel();
        label1.setText("Nombre:");
        panel.add(label1);
        //ubicar
        label1.setHorizontalAlignment(HEIGHT);
        //fuente
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("Bell MT",Font.PLAIN,20));
        label1.setBounds(40,60,200,50);
        //poner imagen
        JLabel labelimagen = new JLabel();
        ImageIcon imagen = new ImageIcon("registro.png");
        labelimagen.setBounds(20,120,90,70);
        panel.add(labelimagen);
        labelimagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(labelimagen.getWidth(), labelimagen.getHeight(), Image.SCALE_SMOOTH)));
    }
    public void colocarBotones(){
        JButton boton1 = new JButton("CLICK");
        boton1.setBounds(30,310,100,50);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('a');
        
        JButton boton2 = new JButton("Imagen");
        ImageIcon imagen1 = new ImageIcon("click.png");
        boton2.setBounds(210, 310,100,50);
        panel.add(boton2);
        boton2.setEnabled(true);
        boton2.setMnemonic('b');
        
        boton2.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
    }
    public void colocarCajaTexto(){
        JTextField cajaTexto1=new JTextField();
        cajaTexto1.setBounds(150, 70, 250, 30);
        panel.add(cajaTexto1);
        cajaTexto1.setText("POO");
        System.out.println("El texto de la caja es : "+ cajaTexto1.getText());
    }
    public void colocarAreaTexto(){
       JTextArea textarea1 = new JTextArea();
       textarea1.setBounds(130, 130, 250, 150);
       panel.add(textarea1);
       textarea1.setText("POO");
       textarea1.append("\n Escribir aqui....");
    
       JScrollPane barra=new JScrollPane();
       //vertical
        barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        //HORIZONTAL
        barra.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barra.setBounds(450, 10, 15, 430);
        //barra.setViewportView(panel);
        panel.add(barra);
        panel.setLayout(null);
        panel.setSize(400,300);
        panel.setVisible(true);
    }
}

