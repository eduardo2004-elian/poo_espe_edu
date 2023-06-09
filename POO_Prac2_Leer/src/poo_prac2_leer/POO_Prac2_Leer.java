
package poo_prac2_leer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.csvreader.CsvReader;
import com.csvreader.CsvReader;
public class POO_Prac2_Leer {

    public static void main(String[] args) {
        List<Persona> persona = new ArrayList<Persona>();
        persona.add(new Persona("Lander S", "09123", "landers@gmail.com"));
        persona.add(new Persona("Eduardo C", "09892", "educ@gmail.com"));
        persona.add(new Persona("Aldo Suala", "09987", "aldox@gmail.com"));
        persona.add(new Persona("Joan P", "09368", "JoanPinzon@gmail.com"));
        
         ExportarCSV(persona);
         
         ImportarCAV(persona);
        
    }
    
}
