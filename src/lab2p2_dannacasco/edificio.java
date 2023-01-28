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
class edificio {
    private int numeroDePisos,cantidadDeLocales;
    private String direccionPorReferencia;
    ArrayList<Object> edificio = new ArrayList();

    public edificio() {
    }

    public edificio(int pisos, int locales, String direccion) {
        numeroDePisos = pisos;
        cantidadDeLocales = locales;
        direccionPorReferencia = direccion;
    }
    
      public void setEdificios(ArrayList <Object> edificio){
        this.edificio= edificio;
    }
    
    public  ArrayList<Object> getEdificios(){
        return edificio;
    }

    @Override
   public String toString(){
        return "Numero de pisos:  "+numeroDePisos+"\n"+" Cantidad de locales :  "+cantidadDeLocales+"\n"+" Direccion: "+direccionPorReferencia+"\n"+"\n";
    }
    
    
    
    
    
}
