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
public class Combo extends Plato{
    private Plato principal;
    private Plato segundo;
    private Extra bebida;
    private Extra postre;
    public Combo(String descripcion,String precio,Plato principal,Plato segundo,Extra bebida,Extra postre) {
        super(descripcion, precio);
        this.principal=principal;
        this.segundo= segundo;
        this.bebida= bebida;
        this.postre= postre;
    }

    /**
     * @return the principal
     */
    public Plato getPrincipal() {
        return principal;
    }

    /**
     * @param principal the principal to set
     */
    public void setPrincipal(Plato principal) {
        this.principal = principal;
    }

    /**
     * @return the segundo
     */
    public Plato getSegundo() {
        return segundo;
    }

    /**
     * @param segundo the segundo to set
     */
    public void setSegundo(Plato segundo) {
        this.segundo = segundo;
    }

    /**
     * @return the bebida
     */
    public Extra getBebida() {
        return bebida;
    }

    /**
     * @param bebida the bebida to set
     */
    public void setBebida(Extra bebida) {
        this.bebida = bebida;
    }

    /**
     * @return the postre
     */
    public Extra getPostre() {
        return postre;
    }

    /**
     * @param postre the postre to set
     */
    public void setPostre(Extra postre) {
        this.postre = postre;
    }
    
    
}
