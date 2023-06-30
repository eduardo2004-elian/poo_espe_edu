package practica11_unidad2_sobreescritura;

import Animal.Animal;


 public class Persona extends Animal{
    @Override
    public void comer(){
    System.out.println("Soy un humano");
}    
}
