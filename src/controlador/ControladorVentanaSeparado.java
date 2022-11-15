package controlador;

import src.Articulo;
import src.Cliente;
import src.Empleado;
import src.Negocio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author usuario
 */
public class ControladorVentanaSeparado {

    private Negocio controlador;

    public ControladorVentanaSeparado(Negocio negocio) {
        this.controlador = negocio;
    }

    public Articulo buscarArticulo(String codigo) {
        return controlador.buscarArticulo(codigo);
    }

    public void eliminarSeparado(String codigo, int cantidad, Empleado empleado, Cliente cliente) {
        controlador.eliminarSeparado(codigo, cantidad, empleado, cliente);
    }

    public void pagarSeparado(String codigo, int cantidad, Empleado empleado, Cliente cliente) {
        controlador.pagarSeparado(codigo, cantidad, empleado, cliente);
    }
}
