package controlador;

import src.CentroComercial;

public class ControladorLogIn {

    CentroComercial controlador;

    public ControladorLogIn() {
        this.controlador = new CentroComercial();
    }

    public int iniciarSecion(String correo, String contrasena) {
        return controlador.iniciarSecion(correo, contrasena);
    }
}
