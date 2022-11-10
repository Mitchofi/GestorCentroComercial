package controlador;

import src.CentroComercial;
import src.Cliente;

public class ControladorVentanaSignUp {

    CentroComercial controlador;

    public ControladorVentanaSignUp() {
        this.controlador = new CentroComercial();
    }

    public boolean anadirCliente(Cliente cliente) {
        return controlador.anadirCliente(cliente);
    }
}
