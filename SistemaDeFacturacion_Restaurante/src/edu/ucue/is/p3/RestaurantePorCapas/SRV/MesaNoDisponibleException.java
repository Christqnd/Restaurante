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
public class MesaNoDisponibleException extends Exception {

    public MesaNoDisponibleException(String mensaje) {
        super(mensaje);
    }
}
