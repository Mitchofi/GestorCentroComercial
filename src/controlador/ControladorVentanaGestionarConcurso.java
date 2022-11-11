package controlador;

import src.CentroComercial;
import src.Cliente;
import src.Concurso;
import src.Persona;

public class ControladorVentanaGestionarConcurso {

    private CentroComercial controlador;

    public ControladorVentanaGestionarConcurso() {
        this.controlador = new CentroComercial();
    }

    public boolean anadirConcurso(Concurso concurso) {
        return controlador.anadirConcurso(concurso);
    }

    public boolean modificarConcurso(int codigo, Concurso concurso) {
        return controlador.modificarConcurso(codigo, concurso);
    }

    public boolean eliminarConcurso(int codigo) {
        return controlador.eliminarConcurso(codigo);
    }

    public Concurso buscarPorConcurso(int codigo) {
        return controlador.buscarPorConcurso(codigo);
    }

    public Persona buscarPorCedula(String cedula) {
        return controlador.buscarPorCedula(cedula);
    }

    public Cliente buscarClientePorUsuario(String correo) {
        return controlador.buscarClientePorUsuario(correo);
    }

}
