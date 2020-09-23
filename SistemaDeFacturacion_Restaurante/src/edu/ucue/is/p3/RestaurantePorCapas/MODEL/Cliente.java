/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.is.p3.RestaurantePorCapas.MODEL;

import java.util.LinkedList;

/**
 *
 * @author 3lys
 */
public class Cliente extends Persona {

    private Factura factura;
    private LinkedList<Combo> combosDeCliente;

    public Cliente(String pNombre, String sNombre, String pApellido, String sApellido, String cedula, String telefono, String direccion, LinkedList<Combo> combosDeCliente, Factura factura) {
        super(pNombre, sNombre, pApellido, sApellido, cedula, telefono, direccion);
        this.factura = factura;
        this.combosDeCliente = combosDeCliente;
    }

    /**
     * @return the factura
     */
    public Factura getFactura() {
        return factura;
    }

    /**
     * @param factura the factura to set
     */
    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    /**
     * @return the combosDeCliente
     */
    public LinkedList<Combo> getCombosDeCliente() {
        return combosDeCliente;
    }

    /**
     * @param combosDeCliente the combosDeCliente to set
     */
    public void setCombosDeCliente(LinkedList<Combo> combosDeCliente) {
        this.combosDeCliente = combosDeCliente;
    }

}
