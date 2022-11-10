package controlador;

import src.CentroComercial;
import src.Cliente;
import src.Local;
import src.Negocio;

public class ControladorVentanaLogIn {

    CentroComercial controlador;

    public ControladorVentanaLogIn() {
        this.controlador = new CentroComercial();
    }

    public int iniciarSecion(String correo, String contrasena) {
        return controlador.iniciarSesion(correo, contrasena);
    }

    public Negocio returnNegocio(String correo, String contrasena) {
        return controlador.returnNegocio(correo, contrasena);
    }

    public Negocio returnNegocioEmpleado(String correo, String contrasena) {
        return controlador.returnNegocioEmpleado(correo, contrasena);
    }
        public Cliente buscarCliente(String correo, String contrasena) {
            return controlador.buscarCliente(correo, contrasena);
        }
 
}
