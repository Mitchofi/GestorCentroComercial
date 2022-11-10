package controlador;

import src.Negocio;

public class ControladorVentanaVentas {

    Negocio controlador;

    public ControladorVentanaVentas() {
        this.controlador = new Negocio();
    }

    public float ingresosGenerados() {
        return controlador.ingresosGenerados();
    }
}
