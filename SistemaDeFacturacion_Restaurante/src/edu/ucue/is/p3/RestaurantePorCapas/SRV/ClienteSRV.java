/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.is.p3.RestaurantePorCapas.SRV;

import edu.ucue.is.p3.RestaurantePorCapas.DAO.ClienteDAO;
import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Cliente;
import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Combo;
import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Extra;
import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Factura;
import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Plato;
import java.util.LinkedList;

/**
 *
 * @author 3lys
 */
public class ClienteSRV {

    private static ClienteSRV instancia;

    /**
     * Metodo Usado Para Conseguir Instancia De Esta Clase.
     *
     * @return instancia
     */
    public static ClienteSRV getInstancia() {
        if (instancia == null) {
            instancia = new ClienteSRV();
        }
        return instancia;
    }

    public void insertarCliente(String pNombre, String sNombre, String pApellido, String sApellido, String cedula, String telefono, String direccion, LinkedList<Combo> combosDeCliente, Factura factura) throws AtributoRequeridoException {
        if (combosDeCliente == null) {
            throw new AtributoRequeridoException("Para crear pedidos debe seleccionar al menos un combo");
        } else {
            if (pNombre.compareTo("") != 0 && sNombre.compareTo("") != 0 && pApellido.compareTo("") != 0&& sApellido.compareTo("") !=0 && cedula.compareTo("") != 0&& telefono.compareTo("") != 0&& direccion.compareTo("") != 0) {
                Cliente plato= new Cliente( pNombre, sNombre,  pApellido, sApellido,cedula,telefono,direccion, combosDeCliente,factura);
                ClienteDAO.getInstancia().agregarCliente(plato);
            }
            else{
                            throw new AtributoRequeridoException("Los datos son estrictamente necesarios");
            }
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

    public LinkedList<Cliente> listaCliente() {
        return ClienteDAO.getInstancia().getListadoClientes();
    }

    public Cliente buscarCliente(String numero) {
        return ClienteDAO.getInstancia().buscarCliente(numero);
    }

    public void modificarCliente(Cliente clienteViejo,String pNombre, String sNombre, String pApellido, String sApellido, String cedula, String telefono, String direccion, LinkedList<Combo> combosDeCliente, Factura factura) {
        Cliente comboNuevo = new Cliente( pNombre,  sNombre,  pApellido,  sApellido, cedula, telefono, direccion, combosDeCliente, factura);
        ClienteDAO.getInstancia().modificarCliente(clienteViejo, comboNuevo);
    }

    public void eliminarCliente(Cliente plato) {
        ClienteDAO.getInstancia().eliminarCliente(plato);
    }

//    public int numeroCliente(String cedula) {
//        for (int i = 0; i < 100; i++) {
//            if (null == buscarCliente(cedula)) {
//                return i;
//            }
//        }
//        return 100;
//    }
}
