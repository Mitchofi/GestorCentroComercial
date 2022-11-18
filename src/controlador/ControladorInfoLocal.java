package controlador;

import java.util.Date;
import src.AdministradorDeNegocio;
import src.CentroComercial;
import src.Contrato;
import src.Local;
import src.Negocio;

public class ControladorInfoLocal {

    CentroComercial controlador;
    Negocio controladorAux;

    public ControladorInfoLocal(Negocio negocio) {
        this.controlador = new CentroComercial();
        this.controladorAux = negocio;
    }

    public boolean eliminarNegocio(Local local) {
        return controlador.eliminarNegocio(local);
    }

    public void modificarAdmin(AdministradorDeNegocio administradorDeNegocio) {
        controladorAux.modificarAdmin(administradorDeNegocio);
    }

    public int validarCorreo(String correo) {
        return controlador.validarCorreo(correo);
    }

    public boolean validarCorreoAdmin(String correo) {
        return controlador.validarCorreoAdmin(correo);
    }

    public void modificarNegocio(String nombre, Date fechaFin, Date fechaInicio, String descripcion) {
        controladorAux.modificarNegocio(nombre, fechaFin, fechaInicio, descripcion);
    }
}
