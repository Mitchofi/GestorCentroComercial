package controlador;

import src.Articulo;
import src.Negocio;

public class ControladorVentanaEncargadoInventario {

    Negocio controlador;

    public ControladorVentanaEncargadoInventario(Negocio negocio) {
        this.controlador = negocio;
    }

    public boolean registrarNuevoArticulo(Articulo articulo) {
        return controlador.registrarNuevoArticulo(articulo);
    }

    public boolean modificarArticulo(String codigo, Articulo articulo) {
        return controlador.modificarArticulo(codigo, articulo);
    }

    public boolean eliminarArticulo(String codigo) {
        return controlador.eliminarArticulo(codigo);
    }
}
