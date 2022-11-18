/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import src.Parqueadero;

/**
 *
 * @author usuario
 */
public class ControladorVentanaGestionarCupoParqueadero {

    private Parqueadero controlador;

    public ControladorVentanaGestionarCupoParqueadero() {
        this.controlador = new Parqueadero();
    }

    public double ValorAPagarMoto(int horas) {
        return controlador.ValorAPagarMoto(horas);
    }

    public double ValorAPagarCarro(int horas) {
        return controlador.ValorAPagarCarro(horas);
    }
}
