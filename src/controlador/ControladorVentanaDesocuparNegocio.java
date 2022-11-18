package controlador;


import src.CentroComercial;
import src.Local;
import src.Negocio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author usuario
 */
public class ControladorVentanaDesocuparNegocio {

    CentroComercial controlador;

    public ControladorVentanaDesocuparNegocio() {
        this.controlador = new CentroComercial();
    }

    public Local returnLocal(Negocio negocio) {
        return controlador.returnLocal(negocio);
    }
}
