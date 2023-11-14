/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Jefferson
 */
public class Usuario {
    //variables

    private String nombreUsuario;
    private String contraseña;

    

    public Usuario(String nombreUsuario, String Contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = Contraseña;
    }
    
    //get y set
    public String getNombreUsuario() {
        return nombreUsuario;

    }

    public String getContraseña() {
        return contraseña;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    

}
