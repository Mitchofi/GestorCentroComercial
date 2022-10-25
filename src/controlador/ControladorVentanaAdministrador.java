package controlador;

import src.AdministradorDeNegocio;
import src.CentroComercial;
import src.Cliente;
import src.Local;

public class ControladorVentanaAdministrador {

    CentroComercial controlador;

    public ControladorVentanaAdministrador() {
        this.controlador = new CentroComercial();
    }

    public Local obtenerLocal(int fila, int columna) {
        return controlador.obtenerLocal(fila, columna);
    }

    public boolean anadirAdministradorNegocio(AdministradorDeNegocio administradorDeNegocio) {
        return controlador.anadirAdministradorNegocio(administradorDeNegocio);
    }
}
