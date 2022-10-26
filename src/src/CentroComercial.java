package src;

import Singleton.Singleton;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import util.Lista;
import util.Queve;

public class CentroComercial implements Serializable {
    
    public static Lista<Persona> personas;
    public static Local[][] locales;
    Lista<Concurso> concursos;
    AdministradorGCentroComercial administrador;
    Queve<Solicitud> solicitudes;
    Parqueadero parqueadero;
    
    public CentroComercial() {
        this.personas = Singleton.getINSTANCIA().getPersonas();
        this.locales = Singleton.getINSTANCIA().getLocales();
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
    
    public int iniciarSecion(String correo, String contrasena) {
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
        return resultado;
    }
    
    public Local obtenerLocal(int fila, int columna) {
        return locales[fila][columna];
    }
    
    public boolean anadirCliente(Cliente cliente) {
        boolean existe = true;
        boolean registrado = false;
        for (int i = 0; i < personas.Size(); i++) {
            if (personas.obtenerDato(i).getCedula().equals(cliente.getCedula())
                    || personas.obtenerDato(i).getCorreo().equals(cliente.getCorreo())
                    || personas.obtenerDato(i).getNumeroCelular().equals(cliente.getNumeroCelular())) {
                existe = false;
            }
        }
        if (existe) {
            personas.add(cliente);
            serializarListaPersonas();
            registrado = true;
        }
        return registrado;
    }
    
    public boolean anadirNegocio(AdministradorDeNegocio administradorDeNegocio, Negocio negocio, Contrato contrato, Local local) {
        boolean registro = false;
        if (local.isDisponible()) {
            negocio.setContrato(contrato);
            local.setNegocio(negocio);
            local.setDisponible(false);
            registro = true;
        }
        serializarListaLocales();
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
}
