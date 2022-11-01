/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import src.CentroComercial;
import src.Parqueadero;

/**
 *
 * @author Acer
 */
public class ControladorVentanaParqueadero {

    CentroComercial controlador;

    public ControladorVentanaParqueadero() {
        this.controlador = new CentroComercial();
    }

    public Parqueadero returnParqueadero() {
        return controlador.returnParqueadero();
    }

    public boolean validarCorreo(String correo) {
        return controlador.validarCorreo(correo);
    }

}
