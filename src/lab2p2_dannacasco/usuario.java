/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_dannacasco;

/**
 *
 * @author Danna Casco
 */
class usuario {
    public int edad;
    public String nombre,contraseña,username;

    public usuario(int edad, String nombre, String contraseña, String username) {
        this.edad = edad;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.username = username;
    }

    public usuario(String contraseña, String username) {
        this.contraseña = contraseña;
        this.username = username;
    }

    public usuario() {
    }
    
    

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getUsername() {
        return username;
    }

   
}
