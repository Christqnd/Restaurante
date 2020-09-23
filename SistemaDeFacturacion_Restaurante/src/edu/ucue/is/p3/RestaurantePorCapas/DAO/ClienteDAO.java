/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.is.p3.RestaurantePorCapas.DAO;

import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Cliente;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
import sun.reflect.generics.tree.Tree;

/**
 *
 * @author 3lys
 */
public class ClienteDAO {

    private LinkedList<Cliente> listadoClientes = new LinkedList<>();
    private static ClienteDAO instancia;

    private ClienteDAO() {
       // iniciar();
    }

    public static ClienteDAO getInstancia() {
        if (instancia == null) {
            instancia = new ClienteDAO();
        }
        return instancia;
    }

    public void agregarCliente(Cliente Usuario) {
        getListadoClientes().add(Usuario);
    }

    public Cliente buscarCliente(String cedula) {
        Iterator elIterador = listadoClientes.iterator();
        while (elIterador.hasNext()) {
            Cliente mesa = (Cliente) elIterador.next();
            if (mesa.getCedula().equals(cedula)) {
                return mesa;
            }
        }
        return null;
    }

    public void modificarCliente(Cliente platoViejo, Cliente platoNuevo) {
        getListadoClientes().remove(platoViejo);
        getListadoClientes().add(platoNuevo);
    }

    public void eliminarCliente(Cliente plato) {
        getListadoClientes().remove(plato);
    }

    public void iniciar() {
        Datos date = new Datos();
     listadoClientes=date.agregarClientes();
    }

    /**
     * @return the listadoClientes
     */
    public LinkedList<Cliente> getListadoClientes() {
        return listadoClientes;
    }

    /**
     * @param listadoClientes the listadoClientes to set
     */
    public void setListadoClientes(LinkedList<Cliente> listadoClientes) {
        this.listadoClientes = listadoClientes;
    }


}
