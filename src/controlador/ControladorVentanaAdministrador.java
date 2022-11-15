/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import src.CentroComercial;
import src.Local;
import src.Persona;

/**
 *
 * @author Acer
 */
public class ControladorVentanaAdministrador {

    private CentroComercial controlador;

    public ControladorVentanaAdministrador() {
        this.controlador = new CentroComercial();
    }

    public Local obtenerLocal(int fila, int columna) {
        return controlador.obtenerLocal(fila, columna);
    }

    public int validarCorreo(String correo) {
        return controlador.validarCorreo(correo);
    }

    public Persona buscarPorCedula(String cedula) {
        return controlador.buscarPorCedula(cedula);
    }
}
