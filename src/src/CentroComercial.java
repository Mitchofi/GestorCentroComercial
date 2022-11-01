package src;

import Singleton.Singleton;
import excepciones.ExcepcionClienteDuplicado;
import excepciones.ExcepcionCorreoDuplicado;
import excepciones.ExcepcionEmpleadoDuplicado;
import excepciones.ExcepcionNoSeEncuentraElUsuario;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import util.Lista;
import util.Queve;

public class CentroComercial implements Serializable {

    public static Lista<Persona> personas;
    public static Local[][] locales;
    public static Parqueadero parqueadero;
    public static Lista<Concurso> concursos;
    public static Queve<Solicitud> solicitudes;
    AdministradorGCentroComercial administrador;

    public CentroComercial() {
        this.personas = Singleton.getINSTANCIA().getPersonas();
        this.locales = Singleton.getINSTANCIA().getLocales();
        this.parqueadero = Singleton.getINSTANCIA().getParqueadero();
        this.concursos = Singleton.getINSTANCIA().getConcursos();
        this.administrador = new AdministradorGCentroComercial("julian",
                "12334", "123", "admin", "123", Short.parseShort("18"));
        if (locales[0][0] == null) {
            initLocales();
            serializarListaLocales();
        }
    }

    private void initLocales() {
        for (int i = 0; i < locales.length; i++) {
            for (int j = 0; j < locales[i].length; j++) {
                locales[i][j] = new Local();
            }
        }
    }

    public int iniciarSesion(String correo, String contrasena) throws ExcepcionNoSeEncuentraElUsuario {
        int resultado = 0;
        if (administrador.getCorreo().equals(correo)
                && administrador.getContrasena().equals(contrasena)) {
            resultado = 1;
        }
        if (resultado == 0) {
            for (int i = 0; i < personas.Size(); i++) {
                if (personas.obtenerDato(i) instanceof Cliente && personas.obtenerDato(i).getCorreo().equals(correo)
                        && personas.obtenerDato(i).getContrasena().equals(contrasena)) {
                    resultado = 3;
                }
            }
        }
        if (resultado == 0) {
            for (int i = 0; i < locales.length; i++) {
                for (int j = 0; j < locales[i].length; j++) {
                    if (locales[i][j].getNegocio() != null) {
                        if (locales[i][j].getNegocio().getAdministrador().getCorreo().equals(correo)
                                && locales[i][j].getNegocio().getAdministrador().getContrasena().equals(contrasena)) {
                            resultado = 2;
                        }
                    }
                }
            }
        }
        if (resultado == 0) {
            for (int i = 0; i < locales.length; i++) {
                for (int j = 0; j < locales[i].length; j++) {
                    if (locales[i][j].getNegocio() != null) {
                        for (int k = 0; k < locales[i][j].getNegocio().getEmpleados().Size(); k++) {
                            if (locales[i][j].getNegocio().getEmpleados().obtenerDato(k).getCorreo().equals(correo)
                                    && locales[i][j].getNegocio().getEmpleados().obtenerDato(k).getContrasena().equals(contrasena)
                                    && locales[i][j].getNegocio().getEmpleados().obtenerDato(k).getRol().equals("Encargado de Inventario del Negocio")) {
                                resultado = 4;
                            }
                        }
                    }
                }
            }
        }
        if (resultado == 0) {
            for (int i = 0; i < locales.length; i++) {
                for (int j = 0; j < locales[i].length; j++) {
                    if (locales[i][j].getNegocio() != null) {
                        for (int k = 0; k < locales[i][j].getNegocio().getEmpleados().Size(); k++) {
                            if (locales[i][j].getNegocio().getEmpleados().obtenerDato(k).getCorreo().equals(correo)
                                    && locales[i][j].getNegocio().getEmpleados().obtenerDato(k).getContrasena().equals(contrasena)
                                    && locales[i][j].getNegocio().getEmpleados().obtenerDato(k).getRol().equals("Vendedor del negocio")) {
                                resultado = 5;
                            }
                        }
                    }
                }
            }
        }
        if (resultado == 0) {
            for (int k = 0; k < personas.Size(); k++) {
                if (personas.obtenerDato(k).getCorreo().equals(correo)
                        && personas.obtenerDato(k).getContrasena().equals(contrasena)) {
                    resultado = 6;
                }

            }
        }
        if (resultado == 0) {
            throw new ExcepcionNoSeEncuentraElUsuario();
        }
        return resultado;
    }

    public Local returnLocalAdmin(String correo, String contrasena) {
        Local local = null;
        for (int i = 0; i < locales.length; i++) {
            for (int j = 0; j < locales[i].length; j++) {
                if (locales[i][j] != null && locales[i][j].getNegocio() != null) {
                    if (locales[i][j].getNegocio().getAdministrador().getCorreo().equals(correo)
                            && locales[i][j].getNegocio().getAdministrador().getContrasena().equals(contrasena)) {
                        local = locales[i][j];
                    }
                }
            }
        }
        return local;
    }

    public Local returnLocalEmpleado(String correo, String contrasena) {
        Local local = null;
        for (int i = 0; i < locales.length; i++) {
            for (int j = 0; j < locales[i].length; j++) {
                if (locales[i][j].getNegocio() != null) {
                    for (int k = 0; k < locales[i][j].getNegocio().getEmpleados().Size(); k++) {
                        if (locales[i][j].getNegocio().getAdministrador().getCorreo().equals(correo)
                                && locales[i][j].getNegocio().getAdministrador().getContrasena().equals(contrasena)
                                || locales[i][j].getNegocio().getEmpleados().obtenerDato(k).getCorreo().equals(correo)
                                && locales[i][j].getNegocio().getEmpleados().obtenerDato(k).getContrasena().equals(contrasena)) {
                            local = locales[i][j];
                        }
                    }
                }
            }
        }
        return local;
    }

    public Local obtenerLocal(int fila, int columna) {
        return locales[fila][columna];
    }

    public Parqueadero returnParqueadero() {
        return parqueadero;
    }

    public boolean anadirCliente(Cliente cliente) throws ExcepcionClienteDuplicado {
        boolean existe = true;
        boolean registrado = false;
        for (int i = 0; i < personas.Size(); i++) {
            if (personas.obtenerDato(i).getCedula().equals(cliente.getCedula())
                    || personas.obtenerDato(i).getCorreo().equals(cliente.getCorreo())
                    || personas.obtenerDato(i).getNumeroCelular().equals(cliente.getNumeroCelular())) {
                existe = false;
                throw new ExcepcionClienteDuplicado();
            }
        }
        for (int j = 0; j < locales.length; j++) {
            for (int k = 0; k < locales[j].length; k++) {
                if (locales[j][k].getNegocio() != null) {
                    if (locales[j][k].getNegocio().getAdministrador().getCorreo().equals(cliente.getCorreo())) {
                        existe = false;
                        throw new ExcepcionClienteDuplicado();
                    }
                }
            }
        }
        if (validarCorreo(cliente.getCorreo())) {
            existe = false;
        }
        if (existe) {
            personas.add(cliente);
            serializarListaPersonas();
            registrado = true;
        }
        return registrado;
    }

    public boolean modificarCliente(String cedula, Cliente cliente) {
        boolean modificado = false;
        boolean disponible = true;
        Cliente clienteAux = null;
        for (int i = 0; i < personas.Size(); i++) {
            if (personas.obtenerDato(i).getCedula().equals(cedula)) {
                clienteAux = (Cliente) personas.obtenerDato(i);
            }
        }
        for (int i = 0; i < personas.Size(); i++) {
            if (personas.obtenerDato(i).getCorreo().equals(cliente.getCorreo())) {
                disponible = false;
            }
        }
        if (validarCorreo(cliente.getCorreo())) {
            disponible = false;
        }
        if (disponible) {
            clienteAux.setCorreo(cliente.getCorreo());
            clienteAux.setContrasena(cliente.getContrasena());
            clienteAux.setEdad(cliente.getEdad());
            clienteAux.setNombre(cliente.getNombre());
            clienteAux.setNumeroCelular(cliente.getNumeroCelular());
            clienteAux.setVehiculo(cliente.getVehiculo());
            modificado = true;
            serializarListaPersonas();
        }
        return modificado;
    }

    public boolean eliminarCliente(String cedula) {
        boolean eliminado = false;
        for (int i = 0; i < personas.Size(); i++) {
            if (personas.obtenerDato(i).getCedula().equals(cedula)) {
                personas.eliminarDato(i);
                serializarListaPersonas();
                eliminado = true;
            }
        }
        return eliminado;
    }

    public boolean anadirEmpleadoCentroComercial(Empleado empleado) throws ExcepcionEmpleadoDuplicado {
        boolean existe = true;
        boolean registrado = false;
        for (int i = 0; i < personas.Size(); i++) {
            if (personas.obtenerDato(i).getCedula().equals(empleado.getCedula())
                    || personas.obtenerDato(i).getCorreo().equals(empleado.getCorreo())
                    || personas.obtenerDato(i).getNumeroCelular().equals(empleado.getNumeroCelular())) {
                existe = false;
                throw new ExcepcionEmpleadoDuplicado();
            }
        }
        if (existe) {
            personas.add(empleado);
            serializarListaPersonas();
            registrado = true;
        }
        return registrado;
    }

    public boolean modificarEmpleadoCentroComercial(String cedula, Empleado empleado) {
        boolean modificado = false;
        boolean disponible = true;
        Empleado empleadoAux = null;
        int count = 0;
        for (int i = 0; i < personas.Size(); i++) {
            if (personas.obtenerDato(i).getCedula().equals(cedula)) {
                empleadoAux = (Empleado) personas.obtenerDato(i);
            }
        }
        for (int i = 0; i < personas.Size(); i++) {
            if (personas.obtenerDato(i).getCorreo().equals(empleado.getCorreo())) {
                count++;
            }
        }
        if (count >= 2) {
            disponible = false;
        }
        if (disponible) {
            empleadoAux.setCorreo(empleado.getCorreo());
            empleadoAux.setContrasena(empleado.getContrasena());
            empleadoAux.setEdad(empleado.getEdad());
            empleadoAux.setNombre(empleado.getNombre());
            empleadoAux.setNumeroCelular(empleado.getNumeroCelular());
            empleadoAux.setVehiculo(empleado.getVehiculo());
            empleadoAux.setRol(empleado.getRol());
            modificado = true;
            serializarListaPersonas();
        }
        return modificado;
    }

    public boolean eliminarEmpleadoCentroComercial(String cedula) {
        boolean eliminado = false;
        for (int i = 0; i < personas.Size(); i++) {
            if (personas.obtenerDato(i).getCedula().equals(cedula)) {
                personas.eliminarDato(i);
                serializarListaPersonas();
                eliminado = true;
            }
        }
        return eliminado;
    }

    public boolean anadirConcurso(Concurso concurso) {
        boolean existe = true;
        boolean registrado = false;
        for (int i = 0; i < concursos.Size(); i++) {
            if (concursos.obtenerDato(i).getNombreConcurso().equals(concurso.getNombreConcurso())
                    && concursos.obtenerDato(i).getFechaIncioConcurso().equals(concurso.getFechaIncioConcurso())
                    || concursos.obtenerDato(i).getFechaFinConcurso().equals(concurso.getFechaFinConcurso())) {
                existe = false;
                throw new ExcepcionClienteDuplicado();
            }
        }
        if (existe) {
            concursos.add(concurso);
            serializarListaConcursos();
            registrado = true;
        }
        return registrado;
    }

    public Persona buscarPorCedula(String cedula) {
        Persona persona = null;
        for (int i = 0; i < personas.Size(); i++) {
            if (personas.obtenerDato(i).getCedula().equals(cedula)) {
                persona = personas.obtenerDato(i);
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

    public boolean anadirNegocio(AdministradorDeNegocio administradorDeNegocio, Negocio negocio, Contrato contrato, Local local) {
        boolean registro = false;
        if (local.isDisponible()) {
            negocio.setContrato(contrato);
            local.setNegocio(negocio);
            local.setDisponible(false);
            registro = true;
            serializarListaLocales();
        }
        return registro;
    }

    public static void serializarListaPersonas() {
        try {
            FileOutputStream archivo = new FileOutputStream("personas.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(personas);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void serializarListaLocales() {
        try {
            FileOutputStream archivo = new FileOutputStream("locales.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(locales);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void serializarListaParqueadero() {
        try {
            FileOutputStream archivo = new FileOutputStream("parqueadero.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(parqueadero);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void serializarListaConcursos() {
        try {
            FileOutputStream archivo = new FileOutputStream("concursos.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(concursos);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
