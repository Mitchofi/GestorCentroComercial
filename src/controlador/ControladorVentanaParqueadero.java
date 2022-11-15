/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import src.CentroComercial;
import src.Parqueadero;
import src.Vehiculo;
import util.Queve;

/**
 *
 * @author Acer
 */
public class ControladorVentanaParqueadero {

    CentroComercial controladorAux;

    public ControladorVentanaParqueadero() {
        this.controladorAux = new CentroComercial();
    }

    public Parqueadero returnParqueadero() {
        return controladorAux.returnParqueadero();
    }

    /*public int validarCorreo(String correo) {
        return controlador.validarCorreo(correo);
    }*/
    public Vehiculo buscarVehiculo(String tipo, String placa) {
        return controladorAux.returnParqueadero().buscarVehiculo(tipo, placa);
    }

    public boolean anadirVehiculoACola(String tipo, String placa) {
        return controladorAux.returnParqueadero().anadirVehiculoACola(tipo, placa);
    }

    public Queve<Vehiculo> returnCola() {
        return controladorAux.returnParqueadero().returnCola();
    }
}
