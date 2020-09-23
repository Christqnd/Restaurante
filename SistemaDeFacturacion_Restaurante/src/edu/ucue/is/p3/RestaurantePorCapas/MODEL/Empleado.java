/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.is.p3.RestaurantePorCapas.MODEL;


/**
 *
 * @author 3lys
 */
public class Empleado extends Persona {

    private String usuario;
    private String contrasena;

    public Empleado(String pNombre, String sNombre, String pApellido, String sApellido, String cedula, String telefono, String direccion,String usuario,String contrasena) {
        super(pNombre, sNombre, pApellido, sApellido, cedula, telefono, direccion);
        this.usuario=usuario;
        this.contrasena=contrasena;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
