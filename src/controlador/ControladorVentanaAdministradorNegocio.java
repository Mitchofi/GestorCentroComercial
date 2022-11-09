/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import src.Empleado;
import src.Local;
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

    public boolean modificarEmpleadoLocal(String cedula, Empleado empleado, Local local) {
        return controlador.modificarEmpleadoLocal(cedula, empleado, local);
    }

    public boolean eliminarEmpleadoLocal(String cedula, Local local) {
        return controlador.eliminarEmpleadoLocal(cedula, local);
    }

    public float ingresosGenerados() {
        return controlador.ingresosGenerados();
    }
}
