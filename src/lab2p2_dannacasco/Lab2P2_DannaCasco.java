/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_dannacasco;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

/**
 *
 * @author Danna Casco
 */
public class Lab2P2_DannaCasco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int opcion = 0;
    int opcion1=0;
    int inmueble = 0;
    ArrayList lista = new ArrayList();
    usuario admin = new usuario("Diegom.14","Dmotino14");
    usuario user = new usuario();
    ArrayList usuario = new ArrayList();

    
    do{
        System.out.println("");
        System.out.println("--Menu--");
        System.out.println("1.Log In/Sign Up");
        System.out.println("2.Log out");
        System.out.println("3.SALIR");
        System.out.print("Ingrese una opcion:  ");
        opcion  = sc.nextInt();
        
        if(opcion==1){
            System.out.println("");
            System.out.println("1.crear usuario");
            System.out.println("2.Ingresar");
            int entr = sc.nextInt();
            if(entr==1){
             usuario.add(newUser());
         System.out.println("");    
        System.out.println("--Menu--");
        System.out.println("1.Registro de inmueble");
        System.out.println("2.Manejo de estados");
        System.out.println("3.Log out");
        System.out.println("4.SALIR");
        System.out.print("Ingrese una opcion:  ");
        opcion  = sc.nextInt();

            }else if(entr==2){
                sc = new Scanner(System.in);
                System.out.println("");
                System.out.println("Ingrese username:  ");
                String username = sc.nextLine();
                System.out.println("Ingrese password:  ");
                String password = sc.nextLine();
                
               user = new usuario(password,username);
                System.out.println("");      
        System.out.println("--Menu--");
        System.out.println("1.Registro de inmueble");
        System.out.println("2.Manejo de estados");
        System.out.println("3.Log out");
        System.out.println("4.SALIR");
        System.out.print("Ingrese una opcion:  ");
        opcion  = sc.nextInt();
            
                
        switch (opcion){
            case 1:
            System.out.println("");
            System.out.println("--Registro--");
            System.out.println("1.crear inmueble"); 
            System.out.println("2.Listar inmuebles");
            System.out.println("3.Modificar inmueble ");
            System.out.println("4.Borrar inmueble");
            System.out.println("5.comprar inmueble");
            System.out.println("");
            System.out.print("Ingrese una opcion : ");
            sc = new Scanner(System.in);
            opcion1=sc.nextInt();
            
            if(opcion1==1||opcion1==3||opcion1==4 && user!=admin){
                System.out.println("acceso denegado");
            }else{
           
                
            switch(opcion1){
                    case 1:
            System.out.println("");
            System.out.println("--crear inmueble--");
            System.out.println("1.Casa");
            System.out.println("2.Edificio");
            System.out.println("3.Solar");
            System.out.print("Que desea crear: ");
            sc = new Scanner(System.in);
            inmueble = sc.nextInt();
            
                  if(inmueble==1){
                      lista.add(newCasa());
                      
                  }else if(inmueble==2){
                      lista.add(newEdificio());
                  }else{
                      lista.add(newSolar());
                  }
                        break;
                    case 2:
                        System.out.println("");    
            System.out.println("--listar inmueble--");
            System.out.println("1.Casa");
            System.out.println("2.Edificio");
            System.out.println("3.Solar");
            System.out.print("Que desea listar: ");
            sc = new Scanner(System.in);
            inmueble = sc.nextInt();
            
            if(opcion==1){
               String s="";
                    for (Object t : lista) {
                    if (t instanceof casa){
                    s+=""+lista.indexOf(t)+"-"+t+"\n" ;
                  }
                    
                        System.out.println(s);
            }              
              }else if(opcion==2){
                 String e = "";
                    for (Object y : lista) {
                    if (y instanceof edificio){
                    e+=""+lista.indexOf(y)+""+"-"+y+"\n" ;
                  }  
                   System.out.println(e);
            }           
              }else{
                  String sol="";
                    for (Object z : lista) {
                    if (z instanceof solar){
                    sol+=""+lista.indexOf(z)+"-"+z+"\n" ;
                  }
                  System.out.println(sol);

            }         
              }
                        break;
                    case 3:
                        System.out.println("1.Casa");
                        System.out.println("2.Edificio");
                        System.out.println("3.Solar");
                        System.out.println("Ingrese inmueble a modificar: ");
                        int inmueble1 = sc.nextInt();
                        
                        System.out.println("Ingrese posisicon a modificar: ");
                        int pos = sc.nextInt();
                        System.out.println("Ingrese modificacion : ");
                        Object mod = sc.nextLine();
            /*  if(inmueble==1){
                   if( pos>=0 && pos<lista.size()){
                   if(lista.get(pos) instanceof casa){
                  ((casa) lista.get(pos)).setLargo(mod););
                       
              }else{ 
                System.out.println("POSICION INVALIDA !!");
              }*/
                        break;
                    case 4:
                        System.out.println("--eliminar inmueble--");
                        System.out.println("1.casa");
                        System.out.println("2.Edifico");
                        System.out.println("3.solar");
                        System.out.println("Ingrese una opcion:  ");
                        int op = sc.nextInt();
                        
                System.out.println("Ingrese posicion a modificar: ");
                int pos2 = sc.nextInt();
                if(opcion==1){
                  if( pos2>=0 && pos2<lista.size()){
                if(lista.get(pos2) instanceof casa){
                  lista.remove(pos2);
                    System.out.println("Eliminado correctamente");
              }else if (opcion==2)  
                    if( pos2>=0 && pos2<lista.size()){
                if(lista.get(pos2) instanceof edificio){
                  lista.remove(pos2);
                    System.out.println("Eliminado correctamente");
              }else if (opcion==3){
                  
                    if( pos2>=0 && pos2<lista.size()){
                if(lista.get(pos2) instanceof solar){
                  lista.remove(pos2);
                    System.out.println("Eliminado correctamente");
              }else{  
                    System.out.println("POSICION INVALIDA !!"); 
              } 
              }
              
              } 
              }
              
              }    
                }
             
                        
                        break;
                    case 5:
                        System.out.println("");
                        System.out.println("--compra de inmueble");
                        System.out.println("1.casa");
                        System.out.println("2.edificio");
                        System.out.println("3.solar");
                        System.out.println("Que desea comprar: ");
                        int compra = sc.nextInt();
                        break;
                        
                        
                }
           
                
            break;
            }
            case 2:
                break;
            
           
            case 3:
                System.out.println("Saliendo de la cuenta...");
             lista = new ArrayList();
             user = new usuario();
             usuario = new ArrayList();


                break;
            
            case 4:
                System.out.println("que tenga buen dia :)");
                break;
                
            default:
                System.out.println("OPCION INVALIDA !!");
                break;
        
            
        }
        }
        
           
            
        
        
        
        
        
        
    
    }
    }while(opcion<4||opcion>4);
    
    }

    
    static casa newCasa (){
     Scanner sc = new Scanner(System.in);
     int numcasa,ancho,largo,baños,cuartos;
    Color color = null;
    String bloque;
    casa retorno;
        System.out.print("Ingrese numero de casa:  ");
        sc = new Scanner(System.in);
        numcasa = sc.nextInt();
        System.out.print("Ingrese bloque: ");
        bloque = sc.nextLine();
        color = JColorChooser.showDialog(null, "Seleccione color", color.black);
        System.out.println("Ingrese ancho :  ");
        sc = new Scanner(System.in);
        ancho = sc.nextInt();
        System.out.print("Ingrese largo:  ");
        largo = sc.nextInt();
        System.out.print("Ingrese numero de baños :  ");
        baños = sc.nextInt();
        System.out.print("Ingrese numero de cuartos:  ");
        cuartos = sc.nextInt();
        retorno =   new casa(numcasa, bloque, color, ancho, largo, baños, cuartos);
       
       return retorno;
    }
    
    static edificio newEdificio(){
            Scanner sc = new Scanner(System.in);
            int pisos,locales;
            String direccion;
            
            System.out.println("Ingrese numero de pisos:  ");
            pisos = sc.nextInt();
            System.out.println("Ingrese cantidad de locales:  ");
            locales = sc.nextInt();
            sc = new Scanner(System.in);
            System.out.println("Ingrese direccion:  ");
            direccion = sc.nextLine();
            
            edificio retorno = new edificio(pisos,locales,direccion);
            
            return retorno;
    }
    
    static solar newSolar(){
        Scanner sc = new Scanner(System.in);
            int largo,ancho;
          
            System.out.println("Ingrese largo :  ");
            largo = sc.nextInt();
            System.out.println("Ingrese ancho:  ");
            ancho = sc.nextInt();
           
            solar retorno = new solar(largo,ancho);
            
            return retorno;
    }
    
    static usuario newUser(){
                Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
            String name = sc.nextLine();
            System.out.println("Ingrese Usuario: ");
            String username = sc.nextLine();
            System.out.println("Ingrese contraseña: ");
            String password = sc.nextLine();
            System.out.println("Ingrese edad : ");
            sc = new Scanner(System.in);
            int edad = sc.nextInt();
            
         usuario retorno = new usuario(edad,name,password,username);

            return retorno;
    }
}
    
    


    