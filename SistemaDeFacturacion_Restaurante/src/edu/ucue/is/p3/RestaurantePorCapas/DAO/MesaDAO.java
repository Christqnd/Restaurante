/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.is.p3.RestaurantePorCapas.DAO;

import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Mesa;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author 3lys
 */
public class MesaDAO {

    private LinkedList<Mesa> listadoMesas = new LinkedList<>();
    
    private static MesaDAO instancia;

    private MesaDAO() {
    }

    public static MesaDAO getInstancia() {
        if (instancia == null) {
            instancia = new MesaDAO();
        }
        return instancia;
    }

    public void agregarMesa(Mesa Usuario) {
        listadoMesas.add(Usuario);
    }

    public Mesa buscarMesa(int numeroMesa) {

        Iterator elIterador = listadoMesas.iterator();
        while (elIterador.hasNext()) {
            Mesa mesa = (Mesa) elIterador.next();
            if (mesa.getNumeroMesa()==numeroMesa) {
                return mesa;
            }
        }
        return null;
    }

    public void modificarMesa(Mesa platoViejo, Mesa platoNuevo) {
        listadoMesas.remove(platoViejo);
        listadoMesas.add(platoNuevo);
    }

    public void eliminarMesa(Mesa plato) {
        listadoMesas.remove(plato);
    }

    public void iniciar() {
        Datos date = new Datos();
        listadoMesas = date.agregarMesas();
    }

    /**
     * @return the listadoCombos
     */
    public LinkedList<Mesa> getListadoMesas() {
        return listadoMesas;
    }

    /**
     * @param listadoCombos the listadoCombos to set
     */
    public void setListadoMesas(LinkedList<Mesa> listadoMesas) {
        this.listadoMesas = listadoMesas;
    }
}
