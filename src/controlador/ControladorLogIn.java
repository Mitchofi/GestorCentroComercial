package controlador;

import src.CentroComercial;
import src.Cliente;
import src.Local;

public class ControladorLogIn {

    CentroComercial controlador;

    public ControladorLogIn() {
        this.controlador = new CentroComercial();
    }

    public int iniciarSecion(String correo, String contrasena) {
        return controlador.iniciarSesion(correo, contrasena);
    }

    public Local returnLocalAdmin(String correo, String contrasena) {
        return controlador.returnLocalAdmin(correo, contrasena);
    }

    public Local returnLocalEmpleado(String correo, String contrasena) {
        return controlador.returnLocalEmpleado(correo, contrasena);
    }
        public Cliente buscarCliente(String correo, String contrasena) {
            return controlador.buscarCliente(correo, contrasena);
        }
 
}
