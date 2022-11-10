/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import src.Empleado;
import src.Negocio;

/**
 *
 * @author Acer
 */
public class ControladorVentanaAdministradorNegocio {

    Negocio controlador;

    public ControladorVentanaAdministradorNegocio() {
        this.controlador = new Negocio();
    }

    public boolean validarCorreo(String correo) {
        return controlador.validarCorreo(correo);
    }

    public boolean anadirEmpleadoLocal(Empleado empleado) {
        return controlador.anadirEmpleadoLocal(empleado);
    }

    public boolean modificarEmpleadoNegocio(String cedula, Empleado empleado, Negocio negocio) {
        return controlador.modificarEmpleadoNegocio(cedula, empleado, negocio);
    }

    public boolean eliminarEmpleadoNegocio(String cedula, Negocio negocio) {
        return controlador.eliminarEmpleadoNegocio(cedula, negocio);
    }

    public float ingresosGenerados() {
        return controlador.ingresosGenerados();
    }
}
