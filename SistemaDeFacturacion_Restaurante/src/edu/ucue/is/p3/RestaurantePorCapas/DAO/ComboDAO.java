/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.is.p3.RestaurantePorCapas.DAO;

import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Combo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author 3lys
 */
public class ComboDAO {

    private LinkedList<Combo> listadoCombos = new LinkedList<>();
    private static ComboDAO instancia;

    private ComboDAO() {
    }

    public static ComboDAO getInstancia() {
        if (instancia == null) {
            instancia = new ComboDAO();
        }
        return instancia;
    }

    public void agregarCombo(Combo Usuario) {
        listadoCombos.add(Usuario);
    }

    public Combo buscarCombo(String numero) {
        Iterator elIterador = listadoCombos.iterator();
        while (elIterador.hasNext()) {
            Combo plato = (Combo) elIterador.next();
            if (plato.getDescripcion().equals(numero)) {
                return plato;
            }
        }
        return null;
    }

    public void modificarCombo(Combo platoViejo, Combo platoNuevo) {
        listadoCombos.remove(platoViejo);
        listadoCombos.add(platoNuevo);        
    }

    public void eliminarCombo(Combo plato) {
        listadoCombos.remove(plato);
    }

    public void iniciar() {
        Datos date = new Datos();
        listadoCombos = date.agregarCombos();
    }

    /**
     * @return the listadoCombos
     */
    public LinkedList<Combo> getListadoCombos() {
        return listadoCombos;
    }

    /**
     * @param listadoCombos the listadoCombos to set
     */
    public void setListadoCombos(LinkedList<Combo> listadoCombos) {
        this.listadoCombos = listadoCombos;
    }
}
