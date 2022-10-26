package controlador;

import src.CentroComercial;
import src.Cliente;

public class ControladorSignUp {

    CentroComercial controlador;

    public ControladorSignUp() {
        this.controlador = new CentroComercial();
    }

    public boolean anadirCliente(Cliente cliente) {
        return controlador.anadirCliente(cliente);
    }
}
