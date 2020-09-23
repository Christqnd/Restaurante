/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.is.p3.RestaurantePorCapas.DAO;

import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Extra;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author 3lys
 */
public class ExtraDAO {

    private LinkedList<Extra> listadoExtrasBebidas;
    private LinkedList<Extra> listadoExtrasPostres;
    private static ExtraDAO instancia;

    private ExtraDAO() {
        listadoExtrasBebidas = new LinkedList<Extra>();
        listadoExtrasPostres = new LinkedList<Extra>();
    }

    public static ExtraDAO getInstancia() {
        if (instancia == null) {
            instancia = new ExtraDAO();
        }
        return instancia;
    }

    /**
     * @return the listadoExtrasBebidas
     */
    public LinkedList<Extra> getListadoExtrasBebidas() {
        return listadoExtrasBebidas;
    }

    /**
     * @param listadoExtrasBebidas the listadoExtrasBebidas to set
     */
    public void setListadoExtrasBebidas(LinkedList<Extra> listadoExtrasBebidas) {
        this.listadoExtrasBebidas = listadoExtrasBebidas;
    }

    /**
     * @return the listadoExtrasPostres
     */
    public LinkedList<Extra> getListadoExtrasPostres() {
        return listadoExtrasPostres;
    }

    /**
     * @param listadoExtrasPostres the listadoExtrasPostres to set
     */
    public void setListadoExtrasPostres(LinkedList<Extra> listadoExtrasPostres) {
        this.listadoExtrasPostres = listadoExtrasPostres;
    }

    public void iniciar() {
        Datos date = new Datos();
        listadoExtrasBebidas = date.agregarExtrasBebidas();
        listadoExtrasPostres = date.agregarExtrasPostres();
    }

    public void agregarBebida(Extra extra) {
        listadoExtrasBebidas.add(extra);
    }

    public void agregarPostre(Extra extra) {
        listadoExtrasBebidas.add(extra);
    }

    public Extra buscarBebida(String descripcion) {

        Iterator elIterador = listadoExtrasBebidas.iterator();
        while (elIterador.hasNext()) {
            Extra plato = (Extra) elIterador.next();
            if (plato.getDescripcion().equals(descripcion)) {
                return plato;
            }
        }
        return null;
    }

    public Extra buscarPostre(String descripcion) {

        Iterator elIterador = listadoExtrasPostres.iterator();
        while (elIterador.hasNext()) {
            Extra plato = (Extra) elIterador.next();
            if (plato.getDescripcion().equals(descripcion)) {
                return plato;
            }
        }
        return null;
    }

    public void modificarExtraBebida(Extra platoViejo, Extra platoNuevo) {
        listadoExtrasBebidas.remove(platoViejo);
        listadoExtrasBebidas.add(platoNuevo);
    }

    public void modificarExtraPostre(Extra platoViejo, Extra platoNuevo) {
        listadoExtrasPostres.remove(platoViejo);
        listadoExtrasPostres.add(platoNuevo);
    }

    public void eliminarExtraBebida(Extra plato) {
        listadoExtrasBebidas.remove(plato);
    }

    public void eliminarExtraPostre(Extra plato) {
        listadoExtrasPostres.remove(plato);
    }
}
