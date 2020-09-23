/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.is.p3.RestaurantePorCapas.MODEL;

/**
 *
 * @author 3lys
 */
public class Mesa {
    private int numeroMesa;
    private int numeroAscientos;
    private boolean disponibilidad;

    public Mesa(int numeroMesa,int numeroAscientos,boolean disponibilidad)
    {
        this.numeroMesa= numeroMesa;
        this.numeroAscientos= numeroAscientos;
        this.disponibilidad=disponibilidad;
    }

    /**
     * @return the numeroMesa
     */
    public int getNumeroMesa() {
        return numeroMesa;
    }

    /**
     * @param numeroMesa the numeroMesa to set
     */
    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    /**
     * @return the numeroAscientos
     */
    public int getNumeroAscientos() {
        return numeroAscientos;
    }

    /**
     * @param numeroAscientos the numeroAscientos to set
     */
    public void setNumeroAscientos(int numeroAscientos) {
        this.numeroAscientos = numeroAscientos;
    }

    /**
     * @return the disponibilidad
     */
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    /**
     * @param disponibilidad the disponibilidad to set
     */
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
  
}
