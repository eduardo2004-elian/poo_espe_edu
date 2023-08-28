package POO_Examen_GenerarHorario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class MostrMenu {
	//creamos el scanner
	Scanner sc = new Scanner (System.in);
	int opt;
	int numLab,capacidLab,horaCierre,numComp,numMicros;
	int numAsig,horaAsig;
	String nameLab,equipLab,lugarLab,encargLab;
	String nombreAsig,carreraAsig,cursoAsig;
	String [] equipList;
    Lab_Compu lab_Compu;
    Lab_Quimi lab_Quimi;
    Personal pers;
    ArrayList<Lab_Compu> LabCompu = new ArrayList<>();
    ArrayList<Lab_Quimi> LabQuimi = new ArrayList<>();
    ArrayList<String> horario = new ArrayList<>(Collections.nCopies(24,null));

    public void menu() {
    	do { //mostramos el menu al usuario
    		System.out.println("--- MENU --- ");
    		System.out.println(" ");
            System.out.println("Seleccione una opcion");
            System.out.println(" ");
            System.out.println("[1] Agregar Laboratorios");
            System.out.println("[2] Asignar horarios");
            System.out.println("[3] Mostrar informacion de Laboratorios");
            opt=sc.nextInt(); //asignamos el valor ingresado a la variable opción
            sc.nextLine();//realizamos salto de linea
            //creamos metodo switch con la variable de laopcion
            switch(opt) {
            case 1:
            	aggLabs();
            	//llamamos al metodo encargado de agregar laboratorios
            	break; //colocamos breaj para que finalice ahí el caso1
            case 2:
            	aggAsignat(); //llamamos al metodo
            	break;
            case 3: 
            	infoLabs();
            	break;
            }
            
    	}while (opt !=4);
    }
    public void aggLabs() {
    	//creamos el submenu dentro de la primera opción
    	System.out.println("---AGREGAR LABORATORIOS---");
        System.out.println(" ");
        System.out.println("Seleccion una opcion");
        System.out.println(" ");
        System.out.println("[1] Laboratorio de Computacion");
        System.out.println("[2] Laboratorio de Quimica");
        opt=sc.nextInt(); //se le asigna a la varibale opcion el valor ingresado
        System.out.println("Escriba la cantidad de Laboratorios que desea ingresar");
        numLab=sc.nextInt();
        sc.nextLine();
        switch(opt) {
        case 1:
        	for(int i = 0; i < numLab; i++) {
        		 System.out.println(" ");
                 System.out.println("--- LABORATORIO: "+(i+1)+" --- ");
                 System.out.print("Ingrese el nombre del Laboratorio: ");
                 nameLab=sc.nextLine();
                 System.out.print("Ingrese la capacidad del Laboratorio:");
                 capacidLab=sc.nextInt();
                 sc.nextLine();
                 System.out.print("Ingreses los equipos del laboratorio[separarlos con una coma]: ");
                 equipLab=sc.nextLine();
                 equipList = equipLab.split(",");
                 System.out.print("Ingrese la hora a la que se cerrará el laboratorio: ");
                 horaCierre=sc.nextInt();
                 sc.nextLine();
                 System.out.print("Ingrese el nombre del encargado de este Laboratorio: ");
                 encargLab=sc.nextLine();
                 System.out.print("Ingrese el lugar donde se ubica el laboratorio: ");
                 lugarLab=sc.nextLine();
                 System.out.print("Ingrese el numero de computadoras disponibles: ");
                 numComp=sc.nextInt();
                 sc.nextLine();
                 LabCompu.add(new Lab_Compu(nameLab,capacidLab,equipList, horaCierre, horario,encargLab,lugarLab,numComp));
        	}
        	break;
        case 2:
        	for (int i = 0; i<numLab; i++){
                System.out.println(" ");
                        System.out.println("--- LABORATORIO: "+(i+1)+" --- ");
                        System.out.print("Ingrese el nombre del Laboratorio: ");
                        nameLab=sc.nextLine();
                        System.out.print("Ingrese la capacidad del Laboratorio");
                        capacidLab=sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingreses los equipos del laboratorio[separarlos con una coma]: ");
                        equipLab=sc.nextLine();
                        equipList=equipLab.split(",");
                        System.out.print("Ingrese la hora a la que se cerrará el laboratorio: ");
                        horaCierre=sc.nextInt();
                        sc.nextInt();
                        System.out.print("Ingrese el nombre del encargado de este Laboratorio: ");
                        encargLab=sc.nextLine();
                        System.out.print("Ingrese el lugar donde se ubica el laboratorio ");
                        lugarLab=sc.nextLine();
                        System.out.print("Ingrese el numero de Microscopios disponibles: ");
                        numMicros=sc.nextInt();
                        sc.nextLine();
                        LabQuimi.add(new Lab_Quimi(nameLab,capacidLab,equipList,horaCierre,encargLab,horario,lugarLab,numMicros));
                    }
                break;
        }
    	
    }
    public void aggAsignat() {
    	System.out.println("Ingrese la cantidad de asignaturas que desea ingresar: ");
    	numAsig=sc.nextInt();
    	sc.nextLine();
    	for(int i = 0; i <numAsig;i++) {
    		System.out.println("--- ASIGNATURA " + (i+1)+"---");
            System.out.println("Nombre:");
            nombreAsig=sc.nextLine();
            System.out.println("Carrera");
            carreraAsig=sc.nextLine();
            System.out.println("Curso");
            cursoAsig=sc.nextLine();
            System.out.println("Seleccione el laboratorio");
            System.out.println("[1] Laboratorio de Computacion");
            System.out.println("[2] Laboratorio de Quimica");
            opt=sc.nextInt();
            switch(opt) {
            case 1:
            	System.out.println("Escriba el numero del laboratorio: ");
                numLab=sc.nextInt();
                sc.nextLine();
                if(LabCompu.size()>=numLab){
                    lab_Compu=LabCompu.get(numLab-1);
                    System.out.print("Ingrese la hora a la que solicitara este Laboratorio: ");
                    horaAsig=sc.nextInt();
                    sc.nextLine();
                    if(lab_Compu.disponibilidad(horaAsig, nombreAsig)){
                        LabCompu.set(numLab-1, lab_Compu);
                        System.out.println("Se ha ingresado con exito");
                    }else{
                        System.out.println("EL LABORATORIO NO SE ENCUENTRA DISPONIBLE EN ESTE HORARIO");
                    }
                    
                }else{
                    System.out.println("NO SE HA ENCONTRADO ESE LABORATORIO");
                }
                break;
            case 2:
                System.out.println("Escriba el numero de laboratorio: ");
                numLab=sc.nextInt();
                sc.nextLine();
                if(LabQuimi.size()>=numLab){
                    lab_Quimi=LabQuimi.get(numLab-1);
                    System.out.print("Ingrese la hora a la que solicitara este Laboratorio: ");
                    horaAsig=sc.nextInt();
                    sc.nextLine();
                    if(lab_Quimi.disponibilidad(horaAsig, nombreAsig)){
                        LabQuimi.set(numLab-1, lab_Quimi);
                        System.out.println("Se ha ingresado con exito");
                    }else{
                        System.out.println("EL LABORATORIO NO SE ENCUENTRA DISPONIBLE EN ESTE HORARIO");
                    }
                }else{
                    System.out.println("NO SE HA ENCONTRADO ESE LABORATORIO");
                }
                break;
            }
    	}
    }
    public void infoLabs(){
        int conta = 1;
        System.out.println("--- LABORATORIOS [COMPUTACION] ---");
        for(Lab_Compu laboratorio: LabCompu){
            System.out.println("---LABORATORIO: "+(conta++)+" --- ");
            System.out.println("Nombre: "+laboratorio.nameLab);
            System.out.println("Capacidad: "+laboratorio.capacidad);    
            System.out.println("Equipos:");
            for(String e:laboratorio.equipList){
                System.out.println("->"+e);
        }
            System.out.println("Hora de cierre: "+laboratorio.horaCierre+"HH");
            System.out.println("Persona encargada: "+laboratorio.encargado);
            System.out.println("Lugar: "+laboratorio.lugar);
            System.out.println("Numero de PCs:"+laboratorio.numComp);
        }
        conta = 1;
        System.out.println("--- LABORATORIOS [QUIMICA] ---");
        for(Lab_Quimi laboratorio: LabQuimi){
            System.out.println("---LABORATORIO: "+(conta++)+" --- ");
            System.out.println("Nombre: "+laboratorio.nameLab);
            System.out.println("Capacidad: "+laboratorio.capacidad);    
            System.out.println("Equipos:");
            for(String e:laboratorio.equipList){
                System.out.println("->"+e);
        }
            System.out.println("Hora de cierre: "+laboratorio.horaCierre+"HH");
            System.out.println("Persona encargada: "+laboratorio.encargado);
            System.out.println("Lugar: "+laboratorio.lugar);
            System.out.println("Numero de PCs:"+laboratorio.numMicros);
    }
        }
}
