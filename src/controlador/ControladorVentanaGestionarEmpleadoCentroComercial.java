package controlador;

import src.CentroComercial;
import src.Empleado;
import src.Persona;

public class ControladorVentanaGestionarEmpleadoCentroComercial {

    CentroComercial controlador;

    public ControladorVentanaGestionarEmpleadoCentroComercial() {
        this.controlador = new CentroComercial();

    }

    public int validarCorreo(String correo) {
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

    public Persona buscarPorCedula(String cedula) {
        return controlador.buscarPorCedula(cedula);
    }
}
