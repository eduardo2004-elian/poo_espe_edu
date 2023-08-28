package Vista;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import Control.Conexion;
import java.lang.String;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;


public class Estudiante extends JFrame{
    
    private Conexion conexionDB;
    private ArrayList<String> registros;
    private JTextField cajaTexto1;
    private JTextField cajaTexto2;
    private JTextField cajaTexto3;
    private JTextField cajaTexto4;
    private JTextField cajaTexto5;
    private JTextField cajaTexto6;
    private JComboBox<String> cajaTexto7;
    private JRadioButton cajaTexto8;
    private JRadioButton cajaTexto9;
    private JTextArea textarea1;
    private JTable tabla;
    private DefaultTableModel tableModel;
    private JTable table;  // Agrega esta variable
    private JButton botonGuardarCambios;

    
    //creacion de una ventana grafica con JFrame
    public JPanel panel;
    public Estudiante(){
        conexionDB = new Conexion();
        this.setSize(600,450);
        setTitle("Registro");
        //para cerrar sistema
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //para centrar la ventana
        setBounds(700,200,1300,710);
        setLocationRelativeTo(null);
        iniciarComponentes();
        
    }
    public void iniciarComponentes(){
        
    
    
        panel = new JPanel();
        //dar color al panel
        panel.setBackground(Color.CYAN);
        //poner el panel sobre la ventana registro
        this.getContentPane().add(panel);
    
        JLabel label = new JLabel("REGISTRO ESTUDIANTES",SwingConstants.CENTER);
        panel.add(label);
        panel.setLayout(null);
        label.setBounds(150,10,850,50);
        label.setForeground(Color.BLACK);
        label.setBackground(Color.LIGHT_GRAY);
        label.setOpaque(true);
        //PONER IMAGEN
        JLabel labelimagen = new JLabel();
        ImageIcon imagen = new ImageIcon("registro.png");
        labelimagen.setBounds(10,110,150,160);
        panel.add(labelimagen);
        labelimagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(labelimagen.getWidth(), labelimagen.getHeight(), Image.SCALE_SMOOTH)));
        JLabel labelimagenestu = new JLabel();
        ImageIcon imagenestu = new ImageIcon("estu.png");
        labelimagenestu.setBounds(140,110,150,160);
        panel.add(labelimagenestu);
        labelimagenestu.setIcon(new ImageIcon(imagenestu.getImage().getScaledInstance(labelimagenestu.getWidth(), labelimagenestu.getHeight(), Image.SCALE_SMOOTH)));
        //LABEL CEDULA
        JLabel label1 = new JLabel();
        label1.setText("Cedula:");
        panel.add(label1);
        //ubicar
        label1.setHorizontalAlignment(HEIGHT);
        //fuente
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("Bell MT",Font.PLAIN,15));
        label1.setBounds(310,60,200,50);
        
        //LABEL APELLIDO
        JLabel label2 = new JLabel();
        label2.setText("Apellido:");
        panel.add(label2);
        //ubicar
        label2.setHorizontalAlignment(HEIGHT);
        //fuente
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("Bell MT",Font.PLAIN,15));
        label2.setBounds(310,90,200,50);
        
        //LABEL NOMBRE
        JLabel label3 = new JLabel();
        label3.setText("Nombre:");
        panel.add(label3);
        //ubicar
        label3.setHorizontalAlignment(HEIGHT);
        //fuente
        label3.setForeground(Color.BLACK);
        label3.setFont(new Font("Bell MT",Font.PLAIN,15));
        label3.setBounds(310,120,200,50);
        
        //LABEL EMAIL
        JLabel label4 = new JLabel();
        label4.setText("Dir. email:");
        panel.add(label4);
        //ubicar
        label4.setHorizontalAlignment(HEIGHT);
        //fuente
        label4.setForeground(Color.BLACK);
        label4.setFont(new Font("Bell MT",Font.PLAIN,15));
        label4.setBounds(310,150,200,50);
        
        //LABEL TELEFONO
        JLabel label5= new JLabel();
        label5.setText("Teléfono:");
        panel.add(label5);
        //ubicar
        label5.setHorizontalAlignment(HEIGHT);
        //fuente
        label5.setForeground(Color.BLACK);
        label5.setFont(new Font("Bell MT",Font.PLAIN,15));
        label5.setBounds(310,180,200,50);
        
        //LABEL DIRECCION
        JLabel label6= new JLabel();
        label6.setText("Direccion:");
        panel.add(label6);
        //ubicar
        label6.setHorizontalAlignment(HEIGHT);
        //fuente
        label6.setForeground(Color.BLACK);
        label6.setFont(new Font("Bell MT",Font.PLAIN,15));
        label6.setBounds(310,210,200,50);
        
        //LABEL MATERIA
        JLabel label7= new JLabel();
        label7.setText("Materia:");
        panel.add(label7);
        //ubicar
        label7.setHorizontalAlignment(HEIGHT);
        //fuente
        label7.setForeground(Color.BLACK);
        label7.setFont(new Font("Bell MT",Font.PLAIN,15));
        label7.setBounds(310,240,200,50);
        
        //LABEL ESTADO
        JLabel label8= new JLabel();
        label8.setText("Estado:");
        panel.add(label8);
        //ubicar
        label8.setHorizontalAlignment(HEIGHT);
        //fuente
        label8.setForeground(Color.BLACK);
        label8.setFont(new Font("Bell MT",Font.PLAIN,15));
        label8.setBounds(310,270,200,50);
        
        
   
        //BOTON NUEVO
        JButton boton1 = new JButton("");
        ImageIcon imagen1 = new ImageIcon("nuevo.png");
        boton1.setBounds(280,350,80,25);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('n');
        boton1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH)));
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cajaTexto1.setText("");
                cajaTexto2.setText("");
                cajaTexto3.setText("");
                cajaTexto4.setText("");
                cajaTexto5.setText("");
                cajaTexto6.setText("");
                cajaTexto7.setSelectedIndex(0);
                cajaTexto8.setSelected(true);
                textarea1.setText("");
                
            }
        });//ACCION BOTON NUEVO
        
        //BOTON GUARDAR
        JButton boton2 = new JButton("");
        ImageIcon imagen2 = new ImageIcon("guardar.jpg");
        boton2.setBounds(370,350,80,25);
        panel.add(boton2);
        boton2.setEnabled(true);
        boton2.setMnemonic('g');
        boton2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cedula = cajaTexto1.getText();
                String apellido = cajaTexto2.getText();
                String nombre = cajaTexto3.getText();
                String direccionEmail = cajaTexto4.getText();
                String telefono = cajaTexto5.getText();
                String direccion = cajaTexto6.getText();
                String materia = (String) cajaTexto7.getSelectedItem();
                String estado = cajaTexto8.isSelected() ? "Activo" : "Inactivo";
                System.out.println("Estado: " + estado); // Agrega esta línea para imprimir el estado en la consola
                

                String observaciones = textarea1.getText();
                agregarDatos(cedula, apellido, nombre, direccionEmail, telefono, direccion, materia, estado);
                limpiarCampos();
                mostrarDatos();
            }

            
        });
       
        //BOTON EDITAR
        JButton boton3 = new JButton("");
        ImageIcon imagen3 = new ImageIcon("editar.jpg");
        boton3.setBounds(460,350,80,25);
        panel.add(boton3);
        boton3.setEnabled(true);
        boton3.setMnemonic('e');
        boton3.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(boton3.getWidth(), boton3.getHeight(), Image.SCALE_SMOOTH)));
        
        boton3.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int filaSeleccionada = table.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila para editar.");
        } else {
            // Obtener valores de la fila seleccionada
            String cedula = (String) table.getValueAt(filaSeleccionada, 1); // Columna de la cédula
            String apellido = (String) table.getValueAt(filaSeleccionada, 2);
            String nombre = (String) table.getValueAt(filaSeleccionada, 3);
            String direccionEmail = (String) table.getValueAt(filaSeleccionada, 4);
            String telefono = (String) table.getValueAt(filaSeleccionada, 5);
            String direccion = (String) table.getValueAt(filaSeleccionada, 6);
            String materia = (String) table.getValueAt(filaSeleccionada, 7);
            String estado = (String) table.getValueAt(filaSeleccionada, 8);

            // Completar campos de texto con los valores de la fila
            cajaTexto1.setText(cedula);
            cajaTexto2.setText(apellido);
            cajaTexto3.setText(nombre);
            cajaTexto4.setText(direccionEmail);
            cajaTexto5.setText(telefono);
            cajaTexto6.setText(direccion);
            cajaTexto7.setSelectedItem(materia);
            cajaTexto8.setSelected(estado.equals("Activo"));

            // Habilitar campos de texto para edición
            habilitarCamposEdicion();
        }
    }
});
        // Agregar nuevo botón "GUARDAR CAMBIOS"
        botonGuardarCambios = new JButton("");
        ImageIcon imagen6 = new ImageIcon("guardarcambios.png");
        botonGuardarCambios.setBounds(360, 390, 100, 25);
        panel.add(botonGuardarCambios);
        botonGuardarCambios.setMnemonic('c');//ALT + C
        botonGuardarCambios.setEnabled(false);
        botonGuardarCambios.setIcon(new ImageIcon(imagen6.getImage().getScaledInstance(botonGuardarCambios.getWidth(), botonGuardarCambios.getHeight(), Image.SCALE_SMOOTH)));
        botonGuardarCambios.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String cedula = cajaTexto1.getText();
        String apellido = cajaTexto2.getText();
        String nombre = cajaTexto3.getText();
        String direccionEmail = cajaTexto4.getText();
        String telefono = cajaTexto5.getText();
        String direccion = cajaTexto6.getText();
        String materia = (String) cajaTexto7.getSelectedItem();
        String estado = cajaTexto8.isSelected() ? "Activo" : "Inactivo";

        // Actualizar datos en la base de datos
        actualizarDatos(cedula, apellido, nombre, direccionEmail, telefono, direccion, materia, estado);

        // Actualizar datos en la tabla de la interfaz
        int filaSeleccionada = table.getSelectedRow();
        tableModel.setValueAt(cedula, filaSeleccionada, 1);
        tableModel.setValueAt(apellido, filaSeleccionada, 2);
        tableModel.setValueAt(nombre, filaSeleccionada, 3);
        tableModel.setValueAt(direccionEmail, filaSeleccionada, 4);
        tableModel.setValueAt(telefono, filaSeleccionada, 5);
        tableModel.setValueAt(direccion, filaSeleccionada, 6);
        tableModel.setValueAt(materia, filaSeleccionada, 7);
        tableModel.setValueAt(estado, filaSeleccionada, 8);

        // Deshabilitar campos de texto después de guardar los cambios
        deshabilitarCamposEdicion();
    }
});
        
        //BOTON ELIMINAR
        JButton boton4 = new JButton("");
        ImageIcon imagen4 = new ImageIcon("eliminar.jpg");
        boton4.setBounds(550,350,75,25);
        panel.add(boton4);
        boton4.setEnabled(true);
        boton4.setMnemonic('d');
        boton4.setIcon(new ImageIcon(imagen4.getImage().getScaledInstance(boton4.getWidth(), boton4.getHeight(), Image.SCALE_SMOOTH)));
        boton4.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int filaSeleccionada = table.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar.");
        } else {
            String cedula = (String) table.getValueAt(filaSeleccionada, 1); // Columna de la cédula

            // Eliminar fila de la base de datos
            eliminarDatos(cedula);

            // Eliminar fila de la tabla en la interfaz
            tableModel.removeRow(filaSeleccionada);
        }
    }
});
        
        //BOTON SALIR
        JButton boton5 = new JButton("");
        ImageIcon imagen5 = new ImageIcon("salir.png");
        boton5.setBounds(470,390,80,25);
        panel.add(boton5);
        boton5.setEnabled(true);
        boton5.setMnemonic('s');
        boton5.setIcon(new ImageIcon(imagen5.getImage().getScaledInstance(boton5.getWidth(), boton5.getHeight(), Image.SCALE_SMOOTH)));
        boton5.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Cerrar la ventana y terminar el programa
        dispose(); // Cierra la ventana actual
        System.exit(0); // Finaliza el programa
    }
    
});
        //BOTON ATRAS
        JButton boton6 = new JButton("");
        ImageIcon imagenatras = new ImageIcon("atras.png");
        boton6.setBounds(15,15,32,30);
        panel.add(boton6);
        boton6.setEnabled(true);
        boton6.setMnemonic('A');
        boton6.setIcon(new ImageIcon(imagenatras.getImage().getScaledInstance(boton6.getWidth(), boton6.getHeight(), Image.SCALE_SMOOTH)));
        boton6.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Cerrar la ventana y terminar el programa
        dispose(); // Cierra la ventana actual
        Menu main = new Menu();
        main.setVisible(true);
    }
   
});
        //BOTON GUARDAR EN EXCEL
        JButton boton7 = new JButton("Guardar en Excel");
        ImageIcon imagenExcel = new ImageIcon("logoexcel.png");
        boton7.setBounds(350,550,250,50);
        panel.add(boton7);
        boton7.setEnabled(true);
        boton7.setMnemonic('x');
        boton7.setIcon(new ImageIcon(imagenExcel.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH)));
        boton7.addActionListener(new ActionListener(){
        
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton7) {
            try {
                guardarEnExcel();
            } catch (Exception ex) {
                Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
        });

   
        
        //CAJATEXTO CEDULA
        cajaTexto1=new JTextField();
        cajaTexto1.setBounds(400, 70, 200, 20);
        panel.add(cajaTexto1);
        cajaTexto1.setText("");
        //CAJATEXTO APELLIDO
        cajaTexto2=new JTextField();
        cajaTexto2.setBounds(400, 100, 200, 20);
        panel.add(cajaTexto2);
        cajaTexto2.setText("");
        //CAJATEXTO Nombre
         cajaTexto3=new JTextField();
        cajaTexto3.setBounds(400, 130, 200, 20);
        panel.add(cajaTexto3);
        cajaTexto3.setText("");
        //CAJATEXTO Mail
         cajaTexto4=new JTextField();
        cajaTexto4.setBounds(400, 160, 200, 20);
        panel.add(cajaTexto4);
        cajaTexto4.setText("");
        //CAJATEXTO telefono
         cajaTexto5=new JTextField();
        cajaTexto5.setBounds(400, 190, 200, 20);
        panel.add(cajaTexto5);
        cajaTexto5.setText("");
        //CAJATEXTO direccion
         cajaTexto6=new JTextField();
        cajaTexto6.setBounds(400, 220, 200, 20);
        panel.add(cajaTexto6);
        cajaTexto6.setText("   ");
        //CAJATEXTO MATERIA  COMBO BOX
        cajaTexto7 = new JComboBox<>();
        cajaTexto7.setBounds(400, 250, 200, 20);
        panel.add(cajaTexto7);
        cajaTexto7.addItem("Ninguna materia");
        cajaTexto7.addItem("POO");
        cajaTexto7.addItem("Computacion Digital");
        cajaTexto7.addItem("Calculo Vectorial");
        cajaTexto7.addItem("Fisica");
        cajaTexto7.addItem("EDO");
        cajaTexto7.addActionListener((ActionEvent e) -> {
            JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
            String selectedOption = (String) comboBox.getSelectedItem();
            System.out.println("Opción seleccionada: " + selectedOption);
        });
        panel.add(cajaTexto7);
        //CAJA ESTADO RADIO BUTTON
        cajaTexto8 = new JRadioButton("Activo"); // Opción 1 para el radio button
        cajaTexto9 = new JRadioButton("Inactivo"); // Opción 2 para el radio button
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(cajaTexto8);
        buttonGroup.add(cajaTexto9);
        
        cajaTexto8.setBounds(400, 280, 200, 20);
        cajaTexto9.setBounds(400, 300, 200, 20);
        
        panel.setLayout(null); // Usamos un diseño nulo para poder posicionar los componentes manualmente
        
        panel.add(cajaTexto8);
        panel.add(cajaTexto9);
        
        System.out.println("El texto de la caja es : "+ cajaTexto1.getText());
    
        textarea1 = new JTextArea();
       textarea1.setBounds(350, 430, 250, 120);
       panel.add(textarea1);
       textarea1.setText("Comandos:");
       textarea1.append("\nNuevo: ALT + N ");
       textarea1.append("\nGuardar: ALT + G ");
       textarea1.append("\nEditar: ALT + E ");
       textarea1.append("\nEliminar: ALT + D ");
       textarea1.append("\nGuardar Cambios: ALT + C ");
       textarea1.append("\nSalir: ALT + S ");
       
    
       JScrollPane barra=new JScrollPane();
       //vertical
        barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        //HORIZONTAL
        barra.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        barra.setBounds(0, 650, 1300, 15);
        //barra.setViewportView(panel);
        panel.add(barra);
        panel.setLayout(null);
        panel.setSize(400,300);
        panel.setVisible(true);
        
   

    
     
        String[] columNames = {"Codigo","Cedula","Apellido", "Nombre", "Direccion Email", " Telefono", "Direccion", "Materia", "Estado"};
        DefaultTableModel tableModel = new DefaultTableModel(columNames,0);
        //tabla de datos
         table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(630,70,610,500);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel.add(scrollPane); 
     mostrarDatos();
     
}
    
    public void agregarDatos(String cedula, String apellido, String nombre, String direccionEmail,
            String telefono, String direccion, String materia, String estado) {
        String SQL = "INSERT INTO `estudiante` (estu_cedula, estu_apellido, estu_nombre, estu_mail, estu_telefono, estu_direccion, estu_materia, estu_estado) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection con = conexionDB.conexion();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
            ps.setString(1, cedula);
            ps.setString(2, apellido);
            ps.setString(3, nombre);
            ps.setString(4, direccionEmail);
            ps.setString(5, telefono);
            ps.setString(6, direccion);
            ps.setString(7, materia);
            ps.setString(8, estado);
           
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos agregados correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar los datos: " + ex.getMessage());
        }
    }
    private void limpiarCampos() {
        cajaTexto1.setText("");
        cajaTexto2.setText("");
        cajaTexto3.setText("");
        cajaTexto4.setText("");
        cajaTexto5.setText("");
        cajaTexto6.setText("");
        cajaTexto7.setSelectedIndex(0);
        cajaTexto8.setSelected(true);
        textarea1.setText("");
    }
    private void mostrarDatos() {
        String[] titulos = {"Código", "Cedula", "Apellido", "Nombre", "Direc. Email", "Telefono", "Direccion", "Materia", "Estado"};
        String registro[] = new String[9];
        tableModel = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM `estudiante`";
        try {
            Connection con = conexionDB.conexion();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                registro[0] = rs.getString("estu_codigo");
                registro[1] = rs.getString("estu_cedula");
                registro[2] = rs.getString("estu_apellido");
                registro[3] = rs.getString("estu_nombre");
                registro[4] = rs.getString("estu_mail");
                registro[5] = rs.getString("estu_telefono");
                registro[6] = rs.getString("estu_direccion");
                registro[7] = rs.getString("estu_materia");
                registro[8] = rs.getString("estu_estado");
                tableModel.addRow(registro);
            }
            // Set the table model to the table
            table.setModel(tableModel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos: " + e.getMessage());
        }
    }
    public void eliminarDatos(String cedula) {
    String SQL = "DELETE FROM `estudiante` WHERE estu_cedula = ?";
    
    try {
        Connection con = conexionDB.conexion();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
        ps.setString(1, cedula);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + ex.getMessage());
    }
}
    private void habilitarCamposEdicion() {
    cajaTexto1.setEditable(false); // No permitir editar la cédula
    cajaTexto2.setEditable(true);
    cajaTexto3.setEditable(true);
    cajaTexto4.setEditable(true);
    cajaTexto5.setEditable(true);
    cajaTexto6.setEditable(true);
    cajaTexto7.setEnabled(true);
    cajaTexto8.setEnabled(true);
    botonGuardarCambios.setEnabled(true);
}
    private void deshabilitarCamposEdicion() {
    cajaTexto1.setEditable(true);
    cajaTexto2.setEditable(false);
    cajaTexto3.setEditable(false);
    cajaTexto4.setEditable(false);
    cajaTexto5.setEditable(false);
    cajaTexto6.setEditable(false);
    cajaTexto7.setEnabled(false);
    cajaTexto8.setEnabled(false);
    botonGuardarCambios.setEnabled(false);
}
    public void actualizarDatos(String cedula, String apellido, String nombre, String direccionEmail,
        String telefono, String direccion, String materia, String estado) {
    String SQL = "UPDATE `estudiante` SET estu_apellido = ?, estu_nombre = ?, estu_mail = ?, "
            + "estu_telefono = ?, estu_direccion = ?, estu_materia = ?, estu_estado = ? WHERE estu_cedula = ?";

    try {
        Connection con = conexionDB.conexion();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
        ps.setString(1, apellido);
        ps.setString(2, nombre);
        ps.setString(3, direccionEmail);
        ps.setString(4, telefono);
        ps.setString(5, direccion);
        ps.setString(6, materia);
        ps.setString(7, estado);
        ps.setString(8, cedula);

        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al actualizar los datos: " + ex.getMessage());
    }
}
        public void guardarEnExcel() throws Exception {
        try {
        String folderPath = "Archivos EXCEL"; // Nombre de la carpeta
        File folder = new File(folderPath);

        if (!folder.exists()) {
            if (folder.mkdir()) {
                System.out.println("Carpeta creada: " + folderPath);
            } else {
                System.out.println("No se pudo crear la carpeta");
            }
        }
            
            // Crear un libro de trabajo y una hoja de trabajo
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Estudiantes");

            // Agregar encabezados
            String[] headers = {"codigo","Cedula", "Apellido", "Nombre", "Dir. Email", "Telefono", "Direccion", "Materia", "Estado"};
            Row headerRow = sheet.createRow(0);
            for (int i = 0; i < headers.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(headers[i]);
            }

            // Agregar datos de la tabla a la hoja de trabajo
            for (int row = 0; row < table.getRowCount(); row++) {
                Row excelRow = sheet.createRow(row + 1);
                for (int col = 0; col < table.getColumnCount(); col++) {
                    Cell cell = excelRow.createCell(col);
                    cell.setCellValue(String.valueOf(table.getValueAt(row, col)));
                }
            }

            // Guardar el archivo Excel
            String filePath = folderPath + File.separator + "Estudiantes.xlsx";
            try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
                workbook.write(outputStream);
                JOptionPane.showMessageDialog(null, "Datos guardados en Excel correctamente");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al guardar en Excel: " + ex.getMessage());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al crear el archivo Excel: " + ex.getMessage());
        }
    }
}
