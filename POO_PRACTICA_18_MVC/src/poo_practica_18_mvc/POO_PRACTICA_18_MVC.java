
package poo_practica_18_mvc;

import Control.Control;
import Modelo.Modelo;
import Vista.Vista;


public class POO_PRACTICA_18_MVC {

  
    public static void main(String[] args) {      
      Modelo mod=new Modelo();
      Vista vist=new Vista();
      Control cont= new Control(vist, mod);
      
      cont.iniciar();
      vist.setVisible(true);
      
    }
    
}
