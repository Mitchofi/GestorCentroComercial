/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Date;
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

    public ControladorVentanaCliente(Negocio negocio) {
        this.controlador = negocio;

    }

    public boolean realizarCompra(String codigo, Empleado empleado, int cantidad, Cliente cliente) {
        return controlador.realizarCompra(codigo, empleado, cantidad, cliente);
    }

    public boolean realizarSeparado(String codigo, int cantidad, Empleado empleado, Negocio negocio, Cliente cliente, Date fechaRecogida) {
        return controlador.realizarSeparado(codigo, cantidad, empleado, negocio, cliente, fechaRecogida);
    }

    public Articulo buscarArticulo(String codigo) {
        return controlador.buscarArticulo(codigo);
    }

    public float valorTotal(String codigo, int cantidad) {
        return controlador.valorTotal(codigo, cantidad);
    }

}
