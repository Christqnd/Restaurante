/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.is.p3.RestaurantePorCapas.SRV;

import edu.ucue.is.p3.RestaurantePorCapas.DAO.MesaDAO;
import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Mesa;
import java.util.LinkedList;

/**
 *
 * @author 3lys
 */
public class MesaSRV {

    private static MesaSRV instancia;

    /**
     * Metodo Usado Para Conseguir Instancia De Esta Clase.
     *
     * @return instancia
     */
    public static MesaSRV getInstancia() {
        if (instancia == null) {
            instancia = new MesaSRV();
        }
        return instancia;
    }

    public void insertarMesa(int numeroMesa, int numeroAscientos, boolean disponibilidad) {
        Mesa mesa = new Mesa(numeroMesa, numeroAscientos, disponibilidad);
        MesaDAO.getInstancia().agregarMesa(mesa);
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

    public LinkedList<Mesa> listaMesas() {
        return MesaDAO.getInstancia().getListadoMesas();
    }

    public Mesa buscarMesa(int numeroMesa) {
        return MesaDAO.getInstancia().buscarMesa(numeroMesa);
    }

    public void modificarMesa(Mesa mesaViejo, int numeroMesa, int numeroAscientos, boolean disponibilidad) {
        Mesa mesaNueva = new Mesa(numeroMesa, numeroAscientos, disponibilidad);
        MesaDAO.getInstancia().modificarMesa(mesaViejo, mesaNueva);
    }

    public void eliminarMesa(Mesa mesa) {
        MesaDAO.getInstancia().eliminarMesa(mesa);
    }

    public int numeroMesa() {
        for (int i = 0; i < 100; i++) {
            if (null == buscarMesa(i)) {
                return i;
            }
        }
        return 100;
    }

    public void cargarDatos() {
        MesaDAO.getInstancia().iniciar();
    }

}
