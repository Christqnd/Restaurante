/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.is.p3.RestaurantePorCapas.DAO;

import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Administrador;

/**
 *
 * @author 3lys
 */
public class AdministradorDAO {

    private static Administrador administrador;
    private static AdministradorDAO instancia;

    /**
     * Metodo Usado Para Conseguir Instancia De Esta Clase.
     *
     * @return instancia
     */
    private AdministradorDAO() {
    }

    public static AdministradorDAO getInstancia() {
        if (instancia == null) {
            instancia = new AdministradorDAO();
        }
        return instancia;
    }
    
    public static AdministradorDAO isInstancedAdministradorDAO()
    {
        return instancia;
    }
    public void insertar(Administrador administrador) {
        this.administrador = administrador;
    }

    public Administrador obtenerAdministrador()// throws EmpleadoNoEncontradoException 
    {
        return administrador;
    }
}
