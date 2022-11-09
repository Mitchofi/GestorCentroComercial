package controlador;

import src.CentroComercial;
import src.Local;

public class ControladorInfoLocal {

    CentroComercial controlador;

    public ControladorInfoLocal() {
        this.controlador = new CentroComercial();
    }

    public boolean eliminarNegocio(Local local) {
        return controlador.eliminarNegocio(local);
    }
}
