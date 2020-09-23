/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.is.p3.RestaurantePorCapas.DAO;

import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Empleado;

/**
 *
 * @author 3lys
 */
public class EmpleadoDAO {

    private static EmpleadoDAO instancia;
    private static Empleado empleado;

    /**
     * Metodo Usado Para Conseguir Instancia De Esta Clase.
     *
     * @return instancia
     */
    private EmpleadoDAO() {
    }

    public static EmpleadoDAO getInstancia() {
        if (instancia == null) {
            instancia = new EmpleadoDAO();
        }
        return instancia;
    }

    public static EmpleadoDAO isInstancedEmpleadoDAO() {
        return instancia;
    }

    public static EmpleadoDAO isInstancedAdministradorDAO() {
        return instancia;
    }

    public void insertar(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empleado obtener() {
        return empleado;
    }

}
