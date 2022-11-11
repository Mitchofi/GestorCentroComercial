/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import src.Articulo;
import src.Cliente;
import src.Empleado;
import src.Negocio;

/**
 *
 * @author usuario
 */
public class ControladorVentanaCliente {

    private Negocio controlador;

    public ControladorVentanaCliente() {
        this.controlador = new Negocio();

    }

    public boolean realizarCompra(String codigo, Empleado empleado, int cantidad, Cliente cliente) {
        return controlador.realizarCompra(codigo, empleado, cantidad, cliente);
    }

    public Articulo buscarArticulo(String codigo) {
        return controlador.buscarArticulo(codigo);
    }

    public float valorTotal(String codigo, int cantidad) {
        return controlador.valorTotal(codigo, cantidad);
    }

}
