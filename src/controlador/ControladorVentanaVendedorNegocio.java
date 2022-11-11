package controlador;

import src.Articulo;
import src.CentroComercial;
import src.Cliente;
import src.Negocio;

public class ControladorVentanaVendedorNegocio {

    private CentroComercial controlador;
    private Negocio controladorAux;

    public ControladorVentanaVendedorNegocio() {
        this.controlador = new CentroComercial();
        this.controladorAux = new Negocio();
    }

    public Cliente buscarClientePorUsuario(String correo) {
        return controlador.buscarClientePorUsuario(correo);
    }

    public Articulo buscarArticulo(String codigo) {
        return controladorAux.buscarArticulo(codigo);
    }
}
