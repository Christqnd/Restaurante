/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.is.p3.RestaurantePorCapas.SRV;

/**
 *
 * @author lainiguez
 */
public class CedulaInvalidaException extends Exception {

    private String cedula;
    
    public CedulaInvalidaException(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }
    
    
}
