
package Vista;
//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfWriter;
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
import javax.swing.JFrame;
import javax.swing.text.Document;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Horario extends JFrame {
    private Conexion conexionDB;
    private ArrayList<String> registros;
    private JComboBox<String> cajaTexto1;
    private JTextField cajaTexto2;
    private JComboBox<String> cajaTexto3;
    private JTextArea textarea1;
    private JTable tabla;
    private DefaultTableModel tableModel;
    private JTable table;  // Agrega esta variable
    private JButton botonGuardarCambios;

    
    //creacion de una ventana grafica con JFrame
    public JPanel panel;
    public Horario(){
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
        panel.setBackground(Color.WHITE);
        //poner el panel sobre la ventana registro
        this.getContentPane().add(panel);
    
        JLabel label = new JLabel("REGISTRO HORARIO",SwingConstants.CENTER);
        panel.add(label);
        panel.setLayout(null);
        label.setBounds(150,10,850,50);
        label.setForeground(Color.BLACK);
        label.setBackground(Color.LIGHT_GRAY);
        label.setOpaque(true);
        //PONER IMAGEN
        JLabel labelimagen = new JLabel();
        ImageIcon imagen = new ImageIcon("registro.png");
        labelimagen.setBounds(20,130,270,280);
        panel.add(labelimagen);
        labelimagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(labelimagen.getWidth(), labelimagen.getHeight(), Image.SCALE_SMOOTH)));
        //LABEL CEDULA
        JLabel label1 = new JLabel();
        label1.setText("Dia:");
        panel.add(label1);
        //ubicar
        label1.setHorizontalAlignment(HEIGHT);
        //fuente
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("Bell MT",Font.PLAIN,15));
        label1.setBounds(310,60,200,50);
        
        //LABEL APELLIDO
        JLabel label2 = new JLabel();
        label2.setText("Hora:");
        panel.add(label2);
        //ubicar
        label2.setHorizontalAlignment(HEIGHT);
        //fuente
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("Bell MT",Font.PLAIN,15));
        label2.setBounds(310,90,200,50);
        
        //LABEL NOMBRE
        JLabel label3 = new JLabel();
        label3.setText("Materia:");
        panel.add(label3);
        //ubicar
        label3.setHorizontalAlignment(HEIGHT);
        //fuente
        label3.setForeground(Color.BLACK);
        label3.setFont(new Font("Bell MT",Font.PLAIN,15));
        label3.setBounds(310,120,200,50);
        
       
        
   
        //BOTON NUEVO
        JButton boton1 = new JButton("NUEVO");
        ImageIcon imagen1 = new ImageIcon("nuevo.png");
        boton1.setBounds(280,350,80,25);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('n');
        boton1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH)));
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cajaTexto1.setSelectedIndex(0);
                cajaTexto2.setText("");
                cajaTexto3.setSelectedIndex(0);
            }
        });//ACCION BOTON NUEVO
        
        //BOTON GUARDAR
        JButton boton2 = new JButton("GUARDAR");
        ImageIcon imagen2 = new ImageIcon("guardar.jpg");
        boton2.setBounds(370,350,80,25);
        panel.add(boton2);
        boton2.setEnabled(true);
        boton2.setMnemonic('g');
        boton2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dia = (String)cajaTexto1.getSelectedItem();
                String hora = cajaTexto2.getText();
                String materia = (String) cajaTexto3.getSelectedItem();

                String observaciones = textarea1.getText();
                agregarDatos(dia,hora,materia);
                limpiarCampos();
                mostrarDatos();
            }

            
        });
       
        //BOTON EDITAR
        JButton boton3 = new JButton("EDITAR");
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
            String dia = (String) table.getValueAt(filaSeleccionada, 1); // Columna de la cédula
            String hora = (String) table.getValueAt(filaSeleccionada, 2);
            String materia = (String) table.getValueAt(filaSeleccionada, 3);
            
            // Completar campos de texto con los valores de la fila
            cajaTexto1.setSelectedItem(dia);
            cajaTexto2.setText(hora);
            cajaTexto3.setSelectedItem(materia);
            

            // Habilitar campos de texto para edición
            habilitarCamposEdicion();
        }
    }
});
        // Agregar nuevo botón "GUARDAR CAMBIOS"
        botonGuardarCambios = new JButton("GUARDAR CAMBIOS");
        ImageIcon imagen6 = new ImageIcon("guardarcambios.png");
        botonGuardarCambios.setBounds(360, 390, 100, 25);
        panel.add(botonGuardarCambios);
        botonGuardarCambios.setMnemonic('c');//ALT + C
        botonGuardarCambios.setEnabled(false);
        botonGuardarCambios.setIcon(new ImageIcon(imagen6.getImage().getScaledInstance(botonGuardarCambios.getWidth(), botonGuardarCambios.getHeight(), Image.SCALE_SMOOTH)));
        botonGuardarCambios.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String dia = (String) cajaTexto1.getSelectedItem();
        String hora = cajaTexto2.getText();
        String materia = (String) cajaTexto3.getSelectedItem();
        // Actualizar datos en la base de datos
        actualizarDatos(dia,hora,materia);

        // Actualizar datos en la tabla de la interfaz
        int filaSeleccionada = table.getSelectedRow();
        tableModel.setValueAt(dia, filaSeleccionada, 1);
        tableModel.setValueAt(hora, filaSeleccionada, 2);
        tableModel.setValueAt(materia, filaSeleccionada, 3);
       
        // Deshabilitar campos de texto después de guardar los cambios
        deshabilitarCamposEdicion();
    }
});
        
        //BOTON ELIMINAR
        JButton boton4 = new JButton("ELIMINAR");
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
        JButton boton5 = new JButton("SALIR");
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
        boton6.setMnemonic('a');
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
        //CAJATEXTO DIA
        cajaTexto1=new JComboBox<>();
        cajaTexto1.setBounds(400, 70, 200, 20);
        panel.add(cajaTexto1);
        cajaTexto1.addItem("Lunes");
        cajaTexto1.addItem("Martes");
        cajaTexto1.addItem("Miercoles");
        cajaTexto1.addItem("Jueves");
        cajaTexto1.addItem("Viernes");
        cajaTexto1.addItem("Sabado");
        cajaTexto1.addItem("Domingo");
        
        
        //CAJATEXTO hora
        cajaTexto2=new JTextField();
        cajaTexto2.setBounds(400, 100, 200, 20);
        panel.add(cajaTexto2);
        cajaTexto2.setText("");
        
        
        //CAJATEXTO MATERIA
         cajaTexto3=new JComboBox<>();
        cajaTexto3.setBounds(400, 130, 200, 20);
        panel.add(cajaTexto3);
        cajaTexto3.addItem("POO");
        cajaTexto3.addItem("Calculo");
        cajaTexto3.addItem("EDO");
        cajaTexto3.addItem("Fisica");
        cajaTexto3.addItem("Computacion Digital");
        
        
        
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
        
   

    
     
        String[] columNames = {"dia","hora","materia"};
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
    
    public void agregarDatos(String dia, String hora, String materia) {
        String SQL = "INSERT INTO `horario` (h_dia, h_hora, h_materia) VALUES (?, ?, ?)";

        try {
            Connection con = conexionDB.conexion();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
            ps.setString(1, dia);
            ps.setString(2, hora);
            ps.setString(3, materia);
           
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos agregados correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar los datos: " + ex.getMessage());
        }
    }
    private void limpiarCampos() {
        cajaTexto1.setSelectedIndex(0);
        cajaTexto2.setText("");
        cajaTexto3.setSelectedIndex(0);
       
    }
    private void mostrarDatos() {
        String[] titulos = {"codigo", "dia", "hora", "materia"};
        String registro[] = new String[4];
        tableModel = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM `horario`";
        try {
            Connection con = conexionDB.conexion();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                registro[0] = rs.getString("h_codigo");
                registro[1] = rs.getString("h_dia");
                registro[2] = rs.getString("h_hora");
                registro[3] = rs.getString("h_materia");
               
                tableModel.addRow(registro);
            }
            // Set the table model to the table
            table.setModel(tableModel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos: " + e.getMessage());
        }
    }
    public void eliminarDatos(String cedula) {
    String SQL = "DELETE FROM `horario` WHERE estu_cedula = ?";
    
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
    cajaTexto1.setEnabled(true); // permitir editar+
    cajaTexto2.setEditable(true);
    cajaTexto3.setEnabled(true);
    botonGuardarCambios.setEnabled(true);
}
    private void deshabilitarCamposEdicion() {
    cajaTexto1.setEnabled(false);
    cajaTexto2.setEditable(false);
    cajaTexto3.setEnabled(false);
    
    botonGuardarCambios.setEnabled(false);
}
    public void actualizarDatos(String dia, String hora, String materia) {
    String SQL = "UPDATE `horario` SET  h_dia = ?, h_hora = ?, h_materia = ?";

    try {
        Connection con = conexionDB.conexion();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
        ps.setString(1, dia);
        ps.setString(2, hora);
        ps.setString(3, materia);
        

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
            Sheet sheet = workbook.createSheet("Horarios");

            // Agregar encabezados
            String[] headers = {"codigo", "dia", "hora","materia"};
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
            String filePath = folderPath + File.separator + "Horarios.xlsx";
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
    

