/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.is.p3.RestaurantePorCapas.SRV;

import edu.ucue.is.p3.RestaurantePorCapas.DAO.ExtraDAO;
import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Extra;
import java.util.LinkedList;

/**
 *
 * @author 3lys
 */
public class ExtraSRV {

    private static ExtraSRV instancia;

    /**
     * Metodo Usado Para Conseguir Instancia De Esta Clase.
     *
     * @return instancia
     */
    public static ExtraSRV getInstancia() {
        if (instancia == null) {
            instancia = new ExtraSRV();
        }
        return instancia;
    }

    public void insertarBebida(String descripcion, String precio) {
        Extra elUsuario = new Extra(descripcion, precio);
        ExtraDAO.getInstancia().agregarBebida(elUsuario);

    }

    public void insertarPostre(String descripcion, String precio) {
        Extra elUsuario = new Extra(descripcion, precio);
        ExtraDAO.getInstancia().agregarPostre(elUsuario);

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

    public LinkedList<Extra> listaBebidas() {
        return ExtraDAO.getInstancia().getListadoExtrasBebidas();
    }

    public LinkedList<Extra> listaPostres() {
        return ExtraDAO.getInstancia().getListadoExtrasPostres();
    }

    public Extra buscarExtraBebida(String nombreUsuario) {
        return ExtraDAO.getInstancia().buscarBebida(nombreUsuario);
    }

    public Extra buscarExtraPostre(String nombreUsuario) {
        return ExtraDAO.getInstancia().buscarPostre(nombreUsuario);
    }

    public void modificarExtraBebida(Extra platoViejo, String descripcion, String precio) {
        Extra platoNuevo = new Extra(descripcion, precio);
        ExtraDAO.getInstancia().modificarExtraBebida(platoViejo, platoNuevo);
    }

    public void modificarExtraPostre(Extra platoViejo, String descripcion, String precio) {
        Extra platoNuevo = new Extra(descripcion, precio);
        ExtraDAO.getInstancia().modificarExtraPostre(platoViejo, platoNuevo);
    }

    public void eliminarExtraBebida(Extra plato) {
        ExtraDAO.getInstancia().eliminarExtraBebida(plato);
    }

    public void eliminarExtraPostre(Extra plato) {
        ExtraDAO.getInstancia().eliminarExtraPostre(plato);
    }
}
