/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_dannacasco;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Danna Casco
 */
class casa {
  private int numeroDeCasa; 
  private String numeroDeBloque;
  private Color color;
  private int ancho,largo;
  private int numeroDeBaños;
  private int numeroDeCuartos;
  private ArrayList <Object> casa = new ArrayList();


    public casa() {
    }

public casa(int numCasa, String bloque, Color c, int ancho, int largo, int baños, int cuartos) {
        numeroDeCasa = numCasa;
        numeroDeBloque = bloque;
        color = c;
        this.ancho = ancho;
        this.largo = largo;
        numeroDeBaños = baños;
        numeroDeCuartos = cuartos;
    }

    public void setNumeroDeCasa(int numeroDeCasa) {
        this.numeroDeCasa = numeroDeCasa;
    }

    public void setNumeroDeBloque(String numeroDeBloque) {
        this.numeroDeBloque = numeroDeBloque;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void setNumeroDeBaños(int numeroDeBaños) {
        this.numeroDeBaños = numeroDeBaños;
    }

    public void setNumeroDeCuartos(int numeroDeCuartos) {
        this.numeroDeCuartos = numeroDeCuartos;
    }

    public int getNumeroDeCasa() {
        return numeroDeCasa;
    }

    public String getNumeroDeBloque() {
        return numeroDeBloque;
    }

    public Color getColor() {
        return color;
    }

    public int getAncho() {
        return ancho;
    }

    public int getLargo() {
        return largo;
    }

    public int getNumeroDeBaños() {
        return numeroDeBaños;
    }

    public int getNumeroDeCuartos() {
        return numeroDeCuartos;
    }

    public void setCasa(ArrayList <Object> casa){
        this.casa= casa;
    }
   
    
    public  ArrayList<Object> getCasa(){
        return casa;
    }
    
  @Override
    public String toString(){
        return "Numero de casa:  "+numeroDeCasa+"\n"+" Bloque:  "+numeroDeBloque+"\n"+" Color: "+color+"\n"+" ancho: "+ancho+"\n"+" largo: "+largo+"\n"+" Numero de baños: "+numeroDeBaños+"\n"+" Numero de Cuartos: "+numeroDeCuartos+"\n"+"\n";
    }

  
    
  
}
