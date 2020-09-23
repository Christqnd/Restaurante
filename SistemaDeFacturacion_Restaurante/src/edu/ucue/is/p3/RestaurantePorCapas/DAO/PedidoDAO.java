/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.is.p3.RestaurantePorCapas.DAO;

import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Cliente;
import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Pedido;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author 3lys
 */
public class PedidoDAO {

    private LinkedList<Pedido> listadoPedidos = new LinkedList<>();
    private static PedidoDAO instancia;

    private PedidoDAO() {
    }

    public static PedidoDAO getInstancia() {
        if (instancia == null) {
            instancia = new PedidoDAO();
        }
        return instancia;
    }

    public void agregarPedido(Pedido Usuario) {
        getListadoPedidos().add(Usuario);
    }

    public Pedido buscarPedido(String cedula) {
        Iterator elIterador = listadoPedidos.iterator();
        while (elIterador.hasNext()) {
            Pedido mesa = (Pedido) elIterador.next();
            if (mesa.getCliente().getCedula().equals(cedula)) {
                return mesa;
            }
        }
        return null;
    }

    public void modificarPedido(Pedido platoViejo, Pedido platoNuevo) {
        getListadoPedidos().remove(platoViejo);
        getListadoPedidos().add(platoNuevo);
    }

    public void eliminarPedido(Pedido plato) {
        getListadoPedidos().remove(plato);
    }

    public void iniciar() {
        Datos date = new Datos();
       listadoPedidos= date.agregarPedidos();
    }

    /**
     * @return the listadoClientes
     */
    public LinkedList<Pedido> getListadoClientes() {
        return listadoPedidos;
    }

    /**
     * @param listadoClientes the listadoClientes to set
     */
    public void setListadoClientes(LinkedList<Pedido> listadoPedido) {
        this.listadoPedidos = listadoPedido;
    }

    /**
     * @return the listadoPedidos
     */
    public LinkedList<Pedido> getListadoPedidos() {
        return listadoPedidos;
    }

    /**
     * @param listadoPedidos the listadoPedidos to set
     */
    public void setListadoPedidos(LinkedList<Pedido> listadoPedidos) {
        this.listadoPedidos = listadoPedidos;
    }
}
