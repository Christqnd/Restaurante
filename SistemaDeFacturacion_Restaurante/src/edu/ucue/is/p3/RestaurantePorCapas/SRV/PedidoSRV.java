/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.is.p3.RestaurantePorCapas.SRV;

import edu.ucue.is.p3.RestaurantePorCapas.DAO.ClienteDAO;
import edu.ucue.is.p3.RestaurantePorCapas.DAO.PedidoDAO;
import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Cliente;
import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Mesa;
import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Pedido;
import java.util.LinkedList;

/**
 *
 * @author 3lys
 */
public class PedidoSRV {

    private static PedidoSRV instancia;

    /**
     * Metodo Usado Para Conseguir Instancia De Esta Clase.
     *
     * @return instancia
     */
    public static PedidoSRV getInstancia() {
        if (instancia == null) {
            instancia = new PedidoSRV();
        }
        return instancia;
    }

    public void insertarPedido(Cliente cliente, Mesa mesa) throws AtributoRequeridoException, MesaNoDisponibleException {
        if (!(cliente.getCedula().equals("") || cliente.getDireccion().equals("") || cliente.getTelefono().equals("") || cliente.getpApellido().equals("") || cliente.getpNombre().equals("") || cliente.getsApellido().equals("") || cliente.getsNombre().equals(""))) {
            if (cliente.getCombosDeCliente().size() == 0) {
                throw new AtributoRequeridoException("Debe registrar al menos un combo para ser procesado el pedido");
            } else {
                if (mesa.isDisponibilidad() == true) {
                    Pedido plato = new Pedido(cliente, mesa);
                    PedidoDAO.getInstancia().agregarPedido(plato);
                } else {
                    throw new MesaNoDisponibleException("La mesa no esta disponible por le momento");
                }
            }
        } else {
            throw new MesaNoDisponibleException("Asegúrese de ingresar todos los datos necesarios del cliente");
        }
    }

    private void validarDatosPlatos(String auxNombUsu, String auxContra) {
        StringBuilder msj = new StringBuilder();

        if (auxNombUsu == null || auxNombUsu.trim().length() == 0) {
            msj.append("El Nombre Del Usuario No Puede Ser Un Campo Vacio.");
        } else if (auxContra == null || auxContra.trim().length() == 0) {
            msj.append("La Contraseña Del Usuario No Puede Ser Un Campo Vacio.");
        }

        if (msj.length() > 0) {
            //   throw new AdministradorUsuarioExcepcion(msj.toString());
        }
    }

    public LinkedList<Pedido> listaPedidos() {
        return PedidoDAO.getInstancia().getListadoPedidos();
    }

    public Pedido buscarPedido(String cedula) {
        return PedidoDAO.getInstancia().buscarPedido(cedula);
    }

    public void modificarPedido(Pedido pedidoViejo, Cliente cliente, Mesa mesa) {
        Pedido pedidoNuevo = new Pedido(cliente, mesa);
        PedidoDAO.getInstancia().modificarPedido(pedidoViejo, pedidoNuevo);
    }

    public void eliminarPedido(Pedido plato) {
        PedidoDAO.getInstancia().eliminarPedido(plato);
    }

    public void cargarDatos() {
        ClienteDAO.getInstancia().iniciar();
        PedidoDAO.getInstancia().iniciar();
    }
}
