/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.is.p3.RestaurantePorCapas.DAO;

import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Plato;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 *
 * @author 3lys
 */
public class PlatoDAO {

    private LinkedList<Plato> listadoPlatosPrincipales;
    private LinkedList<Plato> listadoPlatosSecundarios;
    private static PlatoDAO instancia;

    private PlatoDAO() {
        listadoPlatosPrincipales = new LinkedList<Plato>();
        listadoPlatosSecundarios = new LinkedList<Plato>();
    }

    public static PlatoDAO getInstancia() {
        if (instancia == null) {
            instancia = new PlatoDAO();
        }
        return instancia;
    }

    public LinkedList<Plato> getListadoPlatosPrincipales() {
        return listadoPlatosPrincipales;
    }

    public void setListadoPlatoPrincipal(LinkedList<Plato> listadoPlatoPrincipal) {
        this.listadoPlatosPrincipales = listadoPlatoPrincipal;
    }

    public LinkedList<Plato> getListadoPlatosSecundarios() {
        return listadoPlatosSecundarios;
    }

    public void setListadoPlatoSecundarios(LinkedList<Plato> listadoPlatoSecundarios) {
        this.listadoPlatosSecundarios = listadoPlatoSecundarios;
    }

    public void agregarPlatoPrincipal(Plato Usuario) {
        listadoPlatosPrincipales.add(Usuario);
    }

    public void agregarPlatoSecundario(Plato Usuario) {
        listadoPlatosSecundarios.add(Usuario);
    }

    public Plato buscarPlatoPrincipal(String descripcion) {

        Iterator elIterador = listadoPlatosPrincipales.iterator();
        while (elIterador.hasNext()) {
            Plato plato = (Plato) elIterador.next();
            if (plato.getDescripcion().equals(descripcion)) {
                return plato;
            }
        }
        return null;
    }

    public Plato buscarPlatoSecundario(String descripcion) {

        Iterator elIterador = listadoPlatosSecundarios.iterator();
        while (elIterador.hasNext()) {
            Plato plato = (Plato) elIterador.next();
            if (plato.getDescripcion().equals(descripcion)) {
                return plato;
            }
        }
        return null;
    }

    public void modificarPlatoPrincipal(Plato platoViejo, Plato platoNuevo) {
        listadoPlatosPrincipales.remove(platoViejo);
        listadoPlatosPrincipales.add(platoNuevo);
    }

    public void modificarPlatoSecundario(Plato platoViejo, Plato platoNuevo) {
        listadoPlatosSecundarios.remove(platoViejo);
        listadoPlatosSecundarios.add(platoNuevo);
    }

    public void eliminarPlatoPrincipal(Plato plato) {
        listadoPlatosPrincipales.remove(plato);
    }
    public void eliminarPlatoSecundario(Plato plato) {
        listadoPlatosSecundarios.remove(plato);
    }
    public void iniciar() {
        Datos date = new Datos();
        listadoPlatosPrincipales = date.agregarPlatosPrincipales();
        listadoPlatosSecundarios = date.agregarPlatosSecundarios();
    }
}
