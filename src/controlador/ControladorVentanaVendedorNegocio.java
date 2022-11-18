package controlador;

import java.util.Date;
import src.Articulo;
import src.CentroComercial;
import src.Cliente;
import src.Empleado;
import src.Negocio;

public class ControladorVentanaVendedorNegocio {

    private CentroComercial controlador;
    private Negocio controladorAux;

    public ControladorVentanaVendedorNegocio(Negocio negocio) {
        this.controlador = new CentroComercial();
        this.controladorAux = negocio;
    }

    public Cliente buscarClientePorUsuario(String correo) {
        return controlador.buscarClientePorUsuario(correo);
    }

    public void eliminarSeparado(String codigo, int cantidad, Empleado empleado, Cliente cliente) {
        controladorAux.eliminarSeparado(codigo, cantidad, empleado, cliente);
    }

    public Articulo buscarArticulo(String codigo) {
        return controladorAux.buscarArticulo(codigo);
    }

    public boolean realizarCompra(String codigo, Empleado empleado, int cantidad, Cliente cliente) {
        return controladorAux.realizarCompra(codigo, empleado, cantidad, cliente);
    }

    public boolean realizarSeparado(String codigo, int cantidad, Empleado empleado, Negocio negocio, Cliente cliente, Date fechaRecogida) {
        return controladorAux.realizarSeparado(codigo, cantidad, empleado, negocio, cliente, fechaRecogida);
    }

    public void pagarSeparado(String codigo, int cantidad, Empleado empleado, Cliente cliente) {
        controladorAux.pagarSeparado(codigo, cantidad, empleado, cliente);
    }
}
