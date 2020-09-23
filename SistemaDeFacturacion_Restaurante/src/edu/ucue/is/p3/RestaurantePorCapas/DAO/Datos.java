/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucue.is.p3.RestaurantePorCapas.DAO;

import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Cliente;
import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Combo;
import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Extra;
import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Factura;
import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Mesa;
import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Pedido;
import edu.ucue.is.p3.RestaurantePorCapas.MODEL.Plato;
import edu.ucue.is.p3.RestaurantePorCapas.SRV.ClienteSRV;
import edu.ucue.is.p3.RestaurantePorCapas.SRV.ComboSRV;
import edu.ucue.is.p3.RestaurantePorCapas.SRV.MesaSRV;
import edu.ucue.is.p3.RestaurantePorCapas.SRV.PlatoSRV;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 *
 * @author 3lys
 */
public class Datos {

    LinkedList<Plato> listadoPlatosPrincipales = new LinkedList<>();
    LinkedList<Plato> listadoPlatoSecundarios = new LinkedList<>();
    LinkedList<Extra> listadoExtrasBebidas = new LinkedList<>();
    LinkedList<Extra> listadoExtrasPostres = new LinkedList<>();
    LinkedList<Combo> listadoCombos = new LinkedList<>();
    LinkedList<Mesa> listadoMesas= new LinkedList<>();
    LinkedList<Cliente>listadoClientes= new LinkedList<>();
    LinkedList<Pedido> listadoPedidos=  new LinkedList<>();

    public LinkedList<Plato> agregarPlatosPrincipales() {
        listadoPlatosPrincipales.add(new Plato("Crema de Alcachofa", "1.60"));
        listadoPlatosPrincipales.add(new Plato("Crema de Jitomate con Queso", "1.50"));
        listadoPlatosPrincipales.add(new Plato("Crema de Huauzontle y Chile Ancho", "1.80"));
        listadoPlatosPrincipales.add(new Plato("Sopa Seca de Fideo", "1.70"));
        listadoPlatosPrincipales.add(new Plato("Sopa de Frijol y Fideo", "1.70"));
        listadoPlatosPrincipales.add(new Plato("Sopa de Camarón con Bopalitos", "1.60"));
        listadoPlatosPrincipales.add(new Plato("Sopa de jaiba y pulpo", "1.80"));
        listadoPlatosPrincipales.add(new Plato("Sopa de Ravioles Esteril", "1.30"));
        listadoPlatosPrincipales.add(new Plato("Crema de Zapallo", "2.15"));
        listadoPlatosPrincipales.add(new Plato("Crema de Coliflor con Queso", "2.25"));
        listadoPlatosPrincipales.add(new Plato("Crema de calabacín", "1.35"));
        return listadoPlatosPrincipales;
    }

    public LinkedList<Plato> agregarPlatosSecundarios() {
        listadoPlatoSecundarios.add(new Plato("Seco de Pollo con patatas", "1.80"));
        listadoPlatoSecundarios.add(new Plato("Seco de carne con guata", "1.90"));
        listadoPlatoSecundarios.add(new Plato("Pollo broster con patatas", "1.70"));
        listadoPlatoSecundarios.add(new Plato("Pollo frito con patatas", "1.75"));
        listadoPlatoSecundarios.add(new Plato("Carne a la plancha con ensalada", "1.75"));
        listadoPlatoSecundarios.add(new Plato("Guatita con arroz", "1.50"));
        listadoPlatoSecundarios.add(new Plato("Chaulafan con patatas", "1.75"));
        listadoPlatoSecundarios.add(new Plato("Chaulafan con seco de carne y patatas", "1.90"));
        listadoPlatoSecundarios.add(new Plato("Seco de Pollo,seco de carne y patatas", "2.35"));
        listadoPlatoSecundarios.add(new Plato("Chaulafan con pollo frito", "2.50"));
        listadoPlatoSecundarios.add(new Plato("Seco de Pollo con patatas", "1.34"));
        return listadoPlatoSecundarios;
    }

    public LinkedList<Extra> agregarExtrasBebidas() {
        listadoExtrasBebidas.add(new Extra("Cola Coca grande", "1.00"));
        listadoExtrasBebidas.add(new Extra("Cola Pepsi pequeña", "0.25"));
        listadoExtrasBebidas.add(new Extra("Cola Sprite mediana", "0.50"));
        listadoExtrasBebidas.add(new Extra("Cola Manzana mediana", "0.50"));
        listadoExtrasBebidas.add(new Extra("Jugo de Tomate", "1.70"));
        listadoExtrasBebidas.add(new Extra("Jugo de Coco con hielo", "1.60"));
        listadoExtrasBebidas.add(new Extra("Jugo de Naranaja con hielo", "1.80"));
        return listadoExtrasBebidas;
    }

    public LinkedList<Extra> agregarExtrasPostres() {
        listadoExtrasPostres.add(new Extra("Crema de mandarina y anís ", "1.00"));
        listadoExtrasPostres.add(new Extra("Manzana teplada", "0.50"));
        listadoExtrasPostres.add(new Extra("Textura de chocolate", "0.50"));
        listadoExtrasPostres.add(new Extra("Bomba de arroz con leche", "0.50"));
        listadoExtrasPostres.add(new Extra("Minitarta de quesos con mermelada de tomate", "1.70"));
        listadoExtrasPostres.add(new Extra("Esponja de frutas", "1.10"));
        listadoExtrasPostres.add(new Extra("Minitarta selva negra con naranja", "1.20"));
        return listadoExtrasPostres;
    }

    public LinkedList<Combo> agregarCombos() {

        listadoCombos.add(new Combo("0", "2.90", PlatoSRV.getInstancia().listaPlatosPrincipales().get(1), PlatoSRV.getInstancia().listaPlatosSecundarios().get(2), PlatoSRV.getInstancia().listaBebidas().get(3), PlatoSRV.getInstancia().listaPostres().get(4)));
        listadoCombos.add(new Combo("1", "3.90", PlatoSRV.getInstancia().listaPlatosPrincipales().get(2), PlatoSRV.getInstancia().listaPlatosSecundarios().get(1), PlatoSRV.getInstancia().listaBebidas().get(4), PlatoSRV.getInstancia().listaPostres().get(5)));
        listadoCombos.add(new Combo("2", "2.60", PlatoSRV.getInstancia().listaPlatosPrincipales().get(3), PlatoSRV.getInstancia().listaPlatosSecundarios().get(3), PlatoSRV.getInstancia().listaBebidas().get(4), PlatoSRV.getInstancia().listaPostres().get(3)));
        listadoCombos.add(new Combo("3", "3.50", PlatoSRV.getInstancia().listaPlatosPrincipales().get(4), PlatoSRV.getInstancia().listaPlatosSecundarios().get(2), PlatoSRV.getInstancia().listaBebidas().get(1), PlatoSRV.getInstancia().listaPostres().get(4)));
        return listadoCombos;
    }

    LinkedList<Mesa> agregarMesas() {
        listadoMesas.add(new Mesa(0,3,true));
        listadoMesas.add(new Mesa(1,4,true));
        listadoMesas.add(new Mesa(2,5,true));
        return  listadoMesas;
    }
    LinkedList<Cliente> agregarClientes()
    {
//        listadoPlatosPrincipales=agregarPlatosPrincipales();
//        listadoPlatoSecundarios= agregarPlatosSecundarios();
//        listadoExtrasBebidas= agregarExtrasBebidas();
//        listadoExtrasPostres= agregarExtrasPostres();
        listadoClientes.add(new Cliente("Juan", "Carlos", "Perez", "Monsalve", "0102345679", "0983726318", "Av las americas", ComboSRV.getInstancia().listaCombos(), new Factura(24.20, 2.3, 4.2, 1)));
        listadoClientes.add(new Cliente("Fernando", "Adrian", "Lopez", "Zuñiga", "0102234279", "0934226318", "Remigio Crespo",ComboSRV.getInstancia().listaCombos() , new Factura(25.20, 3.3, 2.2, 1)));
        return  listadoClientes;
    }
    
        LinkedList<Pedido> agregarPedidos()
    {
//        listadoClientes=agregarClientes();
        listadoPedidos.add(new Pedido(ClienteSRV.getInstancia().listaCliente().getFirst(), MesaSRV.getInstancia().listaMesas().getFirst()));
        listadoPedidos.add(new Pedido(ClienteSRV.getInstancia().listaCliente().getLast(),MesaSRV.getInstancia().listaMesas().getLast()));
        return  listadoPedidos;
    }
}
