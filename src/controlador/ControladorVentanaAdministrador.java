/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import src.CentroComercial;
import src.Empleado;
import src.Local;

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

    public boolean anadirEmpleado(Empleado empleado) {
        return controlador.anadirEmpleado(empleado);
    }
}
