/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.is.p3.RestaurantePorCapas.SRV;

import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Empleado;
import edu.ucue.is.p3.RestaurantePorCapas.DAO.EmpleadoDAO;

/**
 *
 * @author 3lys
 */
public class EmpleadoSRV {

    public void guardarDatosEmpleado(String pNombre, String sNombre, String pApellido,
            String sApellido, String cedulaAdm, String telefonoAdm, String direccionAdm,
            String nombreAdmUsu, String contrasenaAdmUsu)
            throws CedulaInvalidaException, TelefonoInvalidoException, AtributoRequeridoException {
        validarCedula(cedulaAdm);
        validarTelefono(telefonoAdm);
        validarDatoRequerido(pNombre, "Parámetro primer nombre no puede contener un valor nulo o vacío");
        validarDatoRequerido(sNombre, "Parámetro segundo nombre no puede contener un valor nulo o vacío");
        validarDatoRequerido(pApellido, "Parámetro primer apellido no puede contener un valor nulo o vacío");
        validarDatoRequerido(sApellido, "Parámetro segundo apellido no puede contener un valor nulo o vacío");
        validarDatoRequerido(cedulaAdm, "Parámetro cedula no puede contener un valor nulo o vacío");
        validarDatoRequerido(direccionAdm, "Parámetro direccion no puede contener un valor nulo o vacío");

        Empleado administrador = new Empleado(pNombre, sNombre, pApellido, sApellido, cedulaAdm, telefonoAdm, direccionAdm, nombreAdmUsu, contrasenaAdmUsu);
        EmpleadoDAO.getInstancia().insertar(administrador);
    }

    public Empleado obtenerEmpleado() {
        return EmpleadoDAO.getInstancia().obtener();
    }

    public boolean existeIntanciaDeEmpleado() {
        if (EmpleadoDAO.isInstancedEmpleadoDAO()!= null) {
            return true;
        } else {
            return false;
        }
    }

    private void validarCedula(String cedula) throws CedulaInvalidaException {
        if (cedula == null || cedula.trim().length() != 10) {
            throw new CedulaInvalidaException(cedula);
        }

        //resto de lógica de validación de cédula
    }

    private void validarTelefono(String telefono) throws TelefonoInvalidoException {
        if (telefono == null || telefono.trim().length() != 10) {
            throw new TelefonoInvalidoException(telefono);
        }
    }

    private void validarDatoRequerido(String atributo, String mensaje) throws AtributoRequeridoException {
        if (atributo == null || atributo.trim().length() == 0) {
            throw new AtributoRequeridoException(mensaje);
        }
    }
}
