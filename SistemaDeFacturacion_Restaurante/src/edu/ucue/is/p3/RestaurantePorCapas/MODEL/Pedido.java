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
public class Pedido {
    private Mesa mesa;
    private Cliente cliente;
//    private Factura factura;
  
    public Pedido(Cliente cliente,Mesa mesa)
    {
        this.cliente=cliente;
        this.mesa= mesa;
    }
    /**
     * @return the mesa
     */
    public Mesa getMesa() {
        return mesa;
    }

    /**
     * @param mesa the mesa to set
     */
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the factura
     */
    public Factura getFactura() {
        return cliente.getFactura();
    }
    
}
