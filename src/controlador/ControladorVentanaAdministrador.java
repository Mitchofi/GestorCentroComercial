/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import excepciones.ExcepcionClienteDuplicado;
import src.CentroComercial;
import src.Cliente;
import src.Concurso;
import src.Empleado;
import src.Local;
import src.Persona;

/**
 *
 * @author Acer
 */
public class ControladorVentanaAdministrador {

    CentroComercial controlador;

    public ControladorVentanaAdministrador() {
        this.controlador = new CentroComercial();
    }

    public Local obtenerLocal(int fila, int columna) {
        return controlador.obtenerLocal(fila, columna);
    }

    public boolean validarCorreo(String correo) {
        return controlador.validarCorreo(correo);
    }

    public boolean anadirEmpleadoCentroComercial(Empleado empleado) {
        return controlador.anadirEmpleadoCentroComercial(empleado);
    }

    public boolean modificarEmpleadoCentroComercial(String cedula, Empleado empleado) {
        return controlador.modificarEmpleadoCentroComercial(cedula, empleado);
    }

    public boolean eliminarEmpleadoCentroComercial(String cedula) {
        return controlador.eliminarEmpleadoCentroComercial(cedula);
    }

    public boolean anadirCliente(Cliente cliente) throws ExcepcionClienteDuplicado {
        return controlador.anadirCliente(cliente);
    }

    public boolean modificarCliente(String cedula, Cliente cliente) {
        return controlador.modificarCliente(cedula, cliente);
    }

    public boolean eliminarCliente(String cedula) {
        return controlador.eliminarCliente(cedula);
    }

    public boolean anadirConcurso(Concurso concurso) {
        return controlador.anadirConcurso(concurso);
    }

    public Persona buscarPorCedula(String cedula) {
        return controlador.buscarPorCedula(cedula);
    }
}
