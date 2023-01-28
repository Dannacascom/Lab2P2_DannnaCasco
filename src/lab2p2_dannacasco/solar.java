/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_dannacasco;

import java.util.ArrayList;

/**
 *
 * @author Danna Casco
 */
class solar {
    private int ancho,largo; 
    ArrayList<Object> solar = new ArrayList();

    public solar() {
    }

    public solar(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
        

    }
    
     @Override
   public String toString(){
      return " Ancho: "+ancho+"\n"+" largo :  "+largo+"\n"+"\n";
    }
}
