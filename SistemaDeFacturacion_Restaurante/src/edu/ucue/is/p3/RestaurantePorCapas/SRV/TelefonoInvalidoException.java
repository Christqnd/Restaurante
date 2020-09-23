/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.is.p3.RestaurantePorCapas.SRV;

/**
 *
 * @author 3lys
 */
public class TelefonoInvalidoException extends Exception{
     private String telefono;
    
    public TelefonoInvalidoException(String telefono) {
        this.telefono = telefono;
    }

    public String getCedula() {
        return telefono;
    }
       
}
