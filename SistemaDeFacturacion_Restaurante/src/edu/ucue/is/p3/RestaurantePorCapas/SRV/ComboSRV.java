/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.is.p3.RestaurantePorCapas.SRV;

import edu.ucue.is.p3.RestaurantePorCapas.DAO.ComboDAO;
import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Combo;
import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Extra;
import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Plato;
import java.util.LinkedList;

/**
 *
 * @author 3lys
 */
public class ComboSRV {

    private static ComboSRV instancia;

    /**
     * Metodo Usado Para Conseguir Instancia De Esta Clase.
     *
     * @return instancia
     */
    public static ComboSRV getInstancia() {
        if (instancia == null) {
            instancia = new ComboSRV();
        }
        return instancia;
    }

    public void insertarCombo(String descripcion, String precio, Plato principal, Plato segundo, Extra bebida, Extra postre) throws AtributoRequeridoException {
        if (principal == null && segundo == null && bebida == null && postre == null) {
            throw new AtributoRequeridoException("Para crear un combo debe seleccionar al menos un plato");
        } else {
            Combo plato = new Combo(descripcion, precio, principal, segundo, bebida, postre);
            ComboDAO.getInstancia().agregarCombo(plato);
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

    public LinkedList<Combo> listaCombos() {
        return ComboDAO.getInstancia().getListadoCombos();
    }

    public Combo buscarCombo(String numero) {
        return ComboDAO.getInstancia().buscarCombo(numero);
    }

    public void modificarCombo(Combo platoViejo, String descripcion, String precio, Plato principal, Plato segundo, Extra bebida, Extra postre) {
        Combo comboNuevo = new Combo(descripcion, precio, principal, segundo, bebida, postre);
        ComboDAO.getInstancia().modificarCombo(platoViejo, comboNuevo);
    }

    public void eliminarCombo(Combo plato) {
        ComboDAO.getInstancia().eliminarCombo(plato);
    }
   public void cargarDatos() {        
        ComboDAO.getInstancia().iniciar();
    }
    public int numeroCombo() {
        for (int i = 0; i < 100; i++) {
            if (null == buscarCombo(Integer.toString(i))) {
                return i;
            }
        }
        return 100;
    }
}
