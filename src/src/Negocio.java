package src;

import excepciones.ExcepcionCorreoDuplicado;
import excepciones.ExcepcionEmpleadoDuplicado;
import java.io.Serializable;
import static src.CentroComercial.locales;
import static src.CentroComercial.personas;
import static src.CentroComercial.serializarListaLocales;
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

    public Negocio() {
        this.nombre = null;
        this.contrato = null;
        this.administrador = null;
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

    public boolean anadirEmpleadoLocal(Empleado empleado) throws ExcepcionEmpleadoDuplicado {
        boolean existe = true;
        boolean registrado = false;
        for (int i = 0; i < empleados.Size(); i++) {
            for (int j = 0; j < CentroComercial.personas.Size(); j++) {
                if (CentroComercial.personas.obtenerDato(j).getCedula().equals(empleado.getCedula())
                        || empleados.obtenerDato(i).getCedula().equals(empleado.getCedula())
                        || empleados.obtenerDato(i).getCorreo().equals(empleado.getCorreo())
                        || empleados.obtenerDato(i).getNumeroCelular().equals(empleado.getNumeroCelular())) {
                    existe = false;
                    throw new ExcepcionEmpleadoDuplicado();
                }
            }

        }
        if (existe) {
            empleados.add(empleado);
            registrado = true;
        }
        return registrado;
    }

    public boolean modificarEmpleadoLocal(String cedula, Empleado empleado, Local local) {
        Local localAux = local;
        Persona aux = buscarPorCedulaLocal(cedula, local);
        Empleado empleadoAux = (Empleado) aux;
        boolean modificado = false;
        boolean disponible = true;
        if (empleadoAux != null) {
            for (int i = 0; i < localAux.getNegocio().getEmpleados().Size(); i++) {
                for (int j = 0; j < personas.Size(); j++) {
                    if (localAux.getNegocio().getEmpleados().obtenerDato(i).getCorreo().equals(empleado.getCorreo())
                            || localAux.getNegocio().getEmpleados().obtenerDato(i).getNumeroCelular().equals(empleado.getNumeroCelular())
                            || personas.obtenerDato(j).getCorreo().equals(empleado.getCorreo())
                            || personas.obtenerDato(j).getNumeroCelular().equals(empleado.getNumeroCelular())) {
                        disponible = false;
                    }
                }
            }
            validarCorreo(empleado.getCorreo());
            if (disponible) {
                empleadoAux.setCorreo(empleado.getCorreo());
                empleadoAux.setContrasena(empleado.getContrasena());
                empleadoAux.setEdad(empleado.getEdad());
                empleadoAux.setNombre(empleado.getNombre());
                empleadoAux.setNumeroCelular(empleado.getNumeroCelular());
                empleadoAux.setRol(empleado.getRol());
                empleadoAux.setVehiculo(empleado.getVehiculo());
                modificado = true;
                serializarListaLocales();
            }
        }
        return modificado;
    }

    public boolean eliminarEmpleadoLocal(String cedula, Local local) {
        boolean eliminado = false;
        for (int i = 0; i < local.getNegocio().getEmpleados().Size(); i++) {
            if (local.getNegocio().getEmpleados().obtenerDato(i).getCedula().equals(cedula)) {
                local.getNegocio().getEmpleados().eliminarDato(i);
                serializarListaLocales();
                eliminado = true;
            }
        }
        return eliminado;
    }

    public Persona buscarPorCedulaLocal(String cedula, Local local) {
        Persona persona = null;
        for (int i = 0; i < local.getNegocio().getEmpleados().Size(); i++) {
            if (local.getNegocio().getEmpleados().obtenerDato(i).getCedula().equals(cedula)) {
                persona = local.getNegocio().getEmpleados().obtenerDato(i);
            }
        }
        return persona;
    }

    public boolean validarCorreo(String correo) throws ExcepcionCorreoDuplicado {
        boolean existe = false;
        for (int k = 0; k < personas.Size(); k++) {
            if (personas.obtenerDato(k).getCorreo().equals(correo)) {
                existe = true;
            }
        }
        for (int i = 0; i < locales.length; i++) {
            for (int j = 0; j < locales[i].length; j++) {
                if (locales[i][j].getNegocio() != null) {
                    for (int k = 0; k < locales[i][j].getNegocio().getEmpleados().Size(); k++) {
                        for (int l = 0; l < personas.Size(); l++) {
                            if (locales[i][j].getNegocio().getAdministrador().getCorreo().equals(personas.obtenerDato(l).getCorreo())
                                    || locales[i][j].getNegocio().getEmpleados().obtenerDato(k).getCorreo().equals(correo)) {
                                existe = true;
                                throw new ExcepcionCorreoDuplicado();
                            }
                        }
                    }
                }
            }
        }
        return existe;
    }

    public float ingresosGenerados() {
        float ingresos = 0;
        for (int i = 0; i < ventas.Size(); i++) {
            if (ventas != null) {
                ingresos += ventas.obtenerDato(i).getValorTotal();
            }
        }
        return ingresos;
    }
}
