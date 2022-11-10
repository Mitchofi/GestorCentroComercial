package controlador;

import excepciones.ExcepcionClienteDuplicado;
import src.CentroComercial;
import src.Cliente;
import src.Persona;

public class ControladorVentanaGestionarCliente {

    private CentroComercial controlador;

    public ControladorVentanaGestionarCliente() {
        this.controlador = new CentroComercial();

    }

    public boolean anadirCliente(Cliente cliente) throws ExcepcionClienteDuplicado {
        return controlador.anadirCliente(cliente);
    }

    public boolean modificarCliente(String cedula, Cliente cliente) {
        return controlador.modificarCliente(cedula, cliente);
    }

    public boolean eliminarCliente(String cedula) {
        return controlador.eliminarCliente(cedula);
    }

    public Persona buscarPorCedula(String cedula) {
        return controlador.buscarPorCedula(cedula);
    }
}
