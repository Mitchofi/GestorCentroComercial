package src;

import java.io.Serializable;
import static src.CentroComercial.personas;
import static src.CentroComercial.serializarListaPersonas;
import util.Lista;

public class Negocio implements Serializable {

    private String nombre;
    private Contrato contrato;
    private AdministradorDeNegocio administrador;
    private Lista<Venta> ventas;
    private Lista<Empleado> empleados;
    private Lista<Articulo> articulos;
    private Lista<Separado> separados;
    private Lista<Multa> multas;

    public Negocio(String nombre, AdministradorDeNegocio administrador) {
        this.nombre = nombre;
        this.contrato = null;
        this.administrador = administrador;
        this.ventas = new Lista<>();
        this.empleados = new Lista<>();
        this.articulos = new Lista<>();
        this.separados = new Lista<>();
        this.multas = new Lista<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public AdministradorDeNegocio getAdministrador() {
        return administrador;
    }

    public void setAdministrador(AdministradorDeNegocio administrador) {
        this.administrador = administrador;
    }

    public Lista<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(Lista<Venta> ventas) {
        this.ventas = ventas;
    }

    public Lista<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Lista<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Lista<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Lista<Articulo> articulos) {
        this.articulos = articulos;
    }

    public Lista<Separado> getSeparados() {
        return separados;
    }

    public void setSeparados(Lista<Separado> separados) {
        this.separados = separados;
    }

    public Lista<Multa> getMultas() {
        return multas;
    }

    public void setMultas(Lista<Multa> multas) {
        this.multas = multas;
    }

    public boolean anadirEmpleado(Empleado empleado) {
        boolean existe = true;
        boolean registrado = false;
        for (int i = 0; i < empleados.Size(); i++) {
            for (int j = 0; j < CentroComercial.personas.Size(); j++) {
                if (CentroComercial.personas.obtenerDato(j).getCedula().equals(empleado.getCedula()) 
                        || empleados.obtenerDato(i).getCedula().equals(empleado.getCedula())
                        || empleados.obtenerDato(i).getCorreo().equals(empleado.getCorreo())
                        || empleados.obtenerDato(i).getNumeroCelular().equals(empleado.getNumeroCelular())) {
                    existe = false;
                }
            }

        }
        if (existe) {
            empleados.add(empleado);
            registrado = true;
        }
        return registrado;
    }
}
