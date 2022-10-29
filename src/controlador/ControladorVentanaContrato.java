package controlador;

import src.AdministradorDeNegocio;
import src.CentroComercial;
import src.Contrato;
import src.Local;
import src.Negocio;

public class ControladorVentanaContrato {

    CentroComercial controlador;

    public ControladorVentanaContrato() {
        this.controlador = new CentroComercial();
    }

    public Local obtenerLocal(int fila, int columna) {
        return controlador.obtenerLocal(fila, columna);
    }

    public boolean anadirNegocio(AdministradorDeNegocio administradorDeNegocio, Negocio negocio, Contrato contrato, Local local) {
        return controlador.anadirNegocio(administradorDeNegocio, negocio, contrato, local);
    }

    public boolean validarCorreo(String correo) {
        return controlador.validarCorreo(correo);
    }

}
