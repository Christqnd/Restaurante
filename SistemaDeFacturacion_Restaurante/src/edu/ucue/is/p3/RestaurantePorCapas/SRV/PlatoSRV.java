/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.is.p3.RestaurantePorCapas.SRV;

import edu.ucue.is.p3.RestaurantePorCapas.DAO.ExtraDAO;
import edu.ucue.is.p3.RestaurantePorCapas.DAO.PlatoDAO;
import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Extra;
import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Plato;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 *
 * @author 3lys
 */
public class PlatoSRV {

    private static PlatoSRV instancia;

    /**
     * Metodo Usado Para Conseguir Instancia De Esta Clase.
     *
     * @return instancia
     */
    
    public static PlatoSRV getInstancia() {
        if (instancia == null) {
            instancia = new PlatoSRV();
        }
        return instancia;
    }

    public void insertarPlatoPrincipal(String descripcion, String precio) {
        Plato plato = new Plato(descripcion, precio);
        PlatoDAO.getInstancia().agregarPlatoPrincipal(plato);

    }

    public void insertarPlatoSecundario(String descripcion, String precio) {
        Plato plato = new Plato(descripcion, precio);
        PlatoDAO.getInstancia().agregarPlatoSecundario(plato);

    }

    public void insertarBebida(String descripcion, String precio) {
        Extra extra = new Extra(descripcion, precio);
        ExtraDAO.getInstancia().agregarBebida(extra);

    }

    public void insertarPostre(String descripcion, String precio) {
        Extra extra = new Extra(descripcion, precio);
        ExtraDAO.getInstancia().agregarPostre(extra);

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

    public LinkedList<Plato> listaPlatosPrincipales() {
        return PlatoDAO.getInstancia().getListadoPlatosPrincipales();
    }

    public LinkedList<Plato> listaPlatosSecundarios() {
        return PlatoDAO.getInstancia().getListadoPlatosSecundarios();
    }

    public LinkedList<Extra> listaBebidas() {
        return ExtraDAO.getInstancia().getListadoExtrasBebidas();
    }

    public LinkedList<Extra> listaPostres() {
        return ExtraDAO.getInstancia().getListadoExtrasPostres();
    }

    public Plato buscarPlatoPrincipal(String des) {
        return PlatoDAO.getInstancia().buscarPlatoPrincipal(des);
    }

    public Plato buscarPlatoSecundario(String des) {
        return PlatoDAO.getInstancia().buscarPlatoSecundario(des);
    }

    public Extra buscarBebida(String des) {
        return ExtraDAO.getInstancia().buscarBebida(des);
    }

    public Extra buscarPostre(String des) {
        return ExtraDAO.getInstancia().buscarPostre(des);
    }

    public void modificarPlatoPrincipal(Plato platoViejo, String descripcion, String precio) {
        Plato platoNuevo = new Plato(descripcion, precio);
        PlatoDAO.getInstancia().modificarPlatoPrincipal(platoViejo, platoNuevo);
    }

    public void modificarPlatoSecundario(Plato platoViejo, String descripcion, String precio) {
        Plato platoNuevo = new Plato(descripcion, precio);
        PlatoDAO.getInstancia().modificarPlatoSecundario(platoViejo, platoNuevo);
    }

    public void modificarExtraBebida(Extra platoViejo, String descripcion, String precio) {
        Extra platoNuevo = new Extra(descripcion, precio);
        ExtraDAO.getInstancia().modificarExtraBebida(platoViejo, platoNuevo);
    }

    public void modificarExtraPostre(Extra platoViejo, String descripcion, String precio) {
        Extra platoNuevo = new Extra(descripcion, precio);
        ExtraDAO.getInstancia().modificarExtraPostre(platoViejo, platoNuevo);
    }

    public void eliminarPlatoPrincipal(Plato plato) {
        PlatoDAO.getInstancia().eliminarPlatoPrincipal(plato);
    }

    public void eliminarPlatoSecundario(Plato plato) {
        PlatoDAO.getInstancia().eliminarPlatoSecundario(plato);
    }

    public void eliminarExtraBebida(Extra plato) {
        ExtraDAO.getInstancia().eliminarExtraBebida(plato);
    }

    public void eliminarExtraPostre(Extra plato) {
        ExtraDAO.getInstancia().eliminarExtraPostre(plato);
    }

    public void cargarDatos() {
        PlatoDAO.getInstancia().iniciar();
        ExtraDAO.getInstancia().iniciar();
    }
}
