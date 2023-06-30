package lab2_gestiondehorarios;

import java.util.ArrayList; //añadimos la importacion para usar los arrays
import java.util.Collections; //importamos para agregar colecciones
import java.util.Scanner; //importamos la clase scanner del paquete java.util

public class Menu {
    Scanner sc = new Scanner(System.in); //creamos el scanner
    //definimos las variables
    int opt;
    int numLab,capacidLab,horaCierre,numComp,numMicros;
    int numAsig,horaAsig;
    String nameLab, equipLab, lugarLab,encargLab;
    String nombreAsig;
    String []equipList;
    Lab_Compu lab_Compu;
    Lab_Quimi lab_quimi;
    ArrayList<Lab_Compu> LabCompu = new ArrayList<>();
    ArrayList<Lab_Quimi> LabQuimi = new ArrayList<>();
    ArrayList<String> horario = new ArrayList<>(Collections.nCopies(24,null));
public void menu(){
    do{ //creamos el menu
        System.out.println("---MENU---");
        System.out.println(" ");
        System.out.println("Seleccione una opcion");
        System.out.println(" ");
        System.out.println("[1] Agregar Laboratorios");
        System.out.println("[2] Asignar horarios");
        System.out.println("[3] Mostrar informacion de Laboratorios");
        opt = sc.nextInt(); //asignamos el valor ingresado a la variable opcion
        sc.nextLine(); //creamos salto de linea
        switch(opt){ //creamos metodo switch con la variable de opcion
            case 1:
                aggLabs(); //llamamos al metodo encargado de agregar labs
                break; //colocamos break para terminar ahí el caso1
            case 2:
                aggAsignat(); //llamamos al metodo encargado de agg asignaturas
                break;
            case 3:
                infoLabs(); //llamamos al metodo encargado de dar info de los labs
                break;
        }
} while (opt!=4);
}
public void aggLabs(){ //creamos el metodo para agregar labs
    //creamos el menu y lo imprimimos
    System.out.println("---AGREGAR LABORATORIOS---");
    System.out.println(" ");
    System.out.println("Seleccione una opcion");
    System.out.println(" ");
    System.out.println("[1] Laboratorio de Computacion");
    System.out.println("[2] Laboratorio de Quimica");
    opt=sc.nextInt(); //se le asigna a la variable de opción el valor ingresado
    System.out.println("Escriba cuantos laboratorios desea ingresar");
    numLab=sc.nextInt();
    sc.nextLine();
    switch(opt){ //creamos el bloque swtich
        case 1: 
            for(int i=0; i < numLab;i++){ //creamos el metodo for, donde i se aumentara siempre y cuando sea menor al numero de laboratorio
                System.out.println(" ");
                System.out.println("---LABORATORIO: "+(i+1)+" ---");
                System.out.print("Ingrese el nombre del laboratorio: ");
                nameLab=sc.nextLine();
                System.out.print("Ingrese la capacidad del laboratorio: ");
                capacidLab=sc.nextInt();
                sc.nextLine();
                System.out.print("Ingrese los equipos del laboratorio[separarlos con coma]: ");                
                equipLab=sc.nextLine();
                equipList=equipLab.split(",");
                System.out.print("Ingrese la hora a la que se cerrara el laboratorio: ");
                horaCierre=sc.nextInt();
                sc.nextLine();
                System.out.print("Ingrese el nombre del encargado de este laboratorio: ");
                encargLab=sc.nextLine();
                System.out.print("Ingrese el lugar donde se ubica el laboratorio: ");
                lugarLab=sc.nextLine();
                System.out.print("Ingrese el numero de computadores disponibles: ");
                numComp=sc.nextInt();
                sc.nextLine();
                LabCompu.add(new Lab_Compu(nameLab,capacidLab,equipList,horaCierre,horario,encargLab,lugarLab,numComp));
            }
            break;
        case 2:
            for (int i = 0; i<numLab;i++){
                System.out.println("---LABORATORIO: "+(i+1)+" ---");
                System.out.print("Ingrese el nombre del laboratorio:                        ");
                nameLab=sc.nextLine();   
                System.out.print("Ingrese la capacidad del laboratorio:                     ");
                capacidLab=sc.nextInt();
                sc.nextLine();
                System.out.print("Ingresa los equipos del laboratorio[separarlos con coma]: ");
                equipLab=sc.nextLine();
                equipList=equipLab.split(",");
                System.out.print("Ingrese la hora a la que se cerrara el laboratorio:       ");
                horaCierre=sc.nextInt();
                sc.nextLine();
                System.out.print("Ingrese el nombre del encargado de este laboratorio:      ");
                encargLab=sc.nextLine();
                System.out.print("Ingrese el lugar donde se ubica el laboratorio:           ");
                lugarLab=sc.nextLine();
                System.out.print("Ingrese el numero de Microoscopios disponibles:           ");
                numMicros=sc.nextInt();
                sc.nextLine();
                LabQuimi.add(new Lab_Quimi(nameLab, capacidLab,equipList,horaCierre,horario,encargLab,lugarLab,numMicros));
            }
            break;
    }
}
public void aggAsignat(){
    System.out.println("Ingrese la cantidad de Asignaturas que desea ingresar: ");
    numAsig=sc.nextInt();
    sc.nextLine();
    for(int i = 0 ;i<numAsig;i++){
        System.out.println("--- ASIGNATURA: "+(i+1)+" ---");
        System.out.println("Nombre: ");
        nombreAsig= sc.nextLine();
        System.out.println("Seleccione el laboratorio");
        System.out.println("[1] Computacion");
        System.out.println("[2] Quimica");
        opt=sc.nextInt();
        switch(opt){
            case 1:
                System.out.print("Escriba el numero del Laboratorio: ");
                numLab=sc.nextInt();
                sc.nextLine();
                if (LabCompu.size()>=numLab){
                    lab_Compu=LabCompu.get(numLab-1);
                    System.out.print("Ingrese la hora a la que solicitara este Laboratorio: ");
                    horaAsig=sc.nextInt();
                    sc.nextLine();
                    if(lab_Compu.disponibilidad(horaAsig,nombreAsig)){
                        LabCompu.set(numLab-1,lab_Compu);
                        System.out.println("Se ha ingresado con exito!");
                    }else{
                        System.out.println("EL LABORATORIO NO SE ENCUENTRA DISPONIBLE EN ESE HORARIO");
                    }
                }else{
                    System.out.println("NO SE HA ENCONTRADO ESE LABORATORIO");
                }
                break;
            case 2:
                System.out.print("Escriba el numero del Laboratorio: ");
                numLab=sc.nextInt();
                sc.nextLine();
                if(LabCompu.size()>=numLab){
                    lab_quimi=LabQuimi.get(numLab-1);
                    System.out.print("Ingrese la hora a la que solicitara este laboratorio");
                    horaAsig=sc.nextInt();
                    sc.nextLine();
                    if(lab_quimi.disponibilidad(horaAsig, nombreAsig)){
                        LabQuimi.set(numLab-1, lab_quimi);
                        System.out.println("Se ha ingresado con exito!");
                    }else{
                        System.out.println("EL LABORATORIO NO SE ENCUENTRA DISPONIBLE EN ESTE HORARIO");
                    }
                }else{
                    System.out.println("NO SE HA ENCONTRADO ESTE LABORATORIO");
                }
                break;
                        
        }
        
    }
}
public void infoLabs(){
    int conta=1;
    System.out.println("---LABORATORIOS[COMPUTACION]---");
    for(Lab_Compu laboratorio:LabCompu){
        System.out.println("---LABORATORIO: "+(conta++)+"---");
        System.out.println("Nombre:    "+laboratorio.nameLab);
        System.out.println("Capacidad: "+laboratorio.capacidad);
        System.out.println("Equipos:   ");
        for(String e:laboratorio.equipList){
            System.out.println("-> "+e);
        }
        System.out.println("Hora de cierre:    "+laboratorio.horaCierre);
        System.out.println("Persona encargada: "+laboratorio.encargado);
        System.out.println("Lugar:             "+laboratorio.lugar);
        System.out.println("Numero de PCs:     "+laboratorio.numComp);   
    }
    conta=1;
    System.out.println("---LABORATORIOS[QUIMICA]---");
    for(Lab_Quimi laboratorio:LabQuimi){
        System.out.println("---LABORATORIO: "+(conta++)+" ---");
        System.out.println("Nombre:    "+laboratorio.nameLab);
        System.out.println("Capacidad: "+laboratorio.capacidad);
        System.out.println("Equipos:   ");
        for(String e:laboratorio.equipList){
            System.out.println("-> "+e);
        }
        System.out.println("Hora de cierre:          "+laboratorio.horaCierre);
        System.out.println("Persona encargada:       "+laboratorio.encargado);
        System.out.println("Lugar:                   "+laboratorio.lugar);
        System.out.println("Numero de Microoscopios: "+laboratorio.numMicros); 
    }
}
}