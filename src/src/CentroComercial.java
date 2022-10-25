package src;

import Singleton.Singleton;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import util.Lista;

public class CentroComercial implements Serializable {

    private static Lista<Persona> personas;
    private static Local[][] locales;
    AdministradorGCentroComercial administrador;

    public CentroComercial() {
        this.personas = Singleton.getINSTANCIA().getPersonas();
        this.locales = Singleton.getINSTANCIA().getLocales();
        if (locales[0][0] == null) {
            initLocales();
            serializarListaLocales();
        }
        anadirAdmin();
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
        for (int i = 0; i < personas.Size(); i++) {
            if (personas.obtenerDato(i) instanceof Cliente && personas.obtenerDato(i).getCorreo().equals(correo)
                    && personas.obtenerDato(i).getContrasena().equals(contrasena)) {
                resultado = 1;
            } else if (personas.obtenerDato(i) instanceof AdministradorGCentroComercial) {
                resultado = 2;
            }
        }
        return resultado;
    }

    public Local obtenerLocal(int fila, int columna) {
        return locales[fila][columna];
    }

    public void anadirAdmin() {
        boolean existe = true;
        administrador = new AdministradorGCentroComercial("julian",
                "12334", "123", "admin", "123", Short.parseShort("18"));
        for (int i = 0; i < personas.Size(); i++) {
            if (personas.obtenerDato(i).getCedula().equals(administrador.getCedula())
                    || personas.obtenerDato(i).getCorreo().equals(administrador.getCorreo())
                    || personas.obtenerDato(i).getNumeroCelular().equals(administrador.getNumeroCelular())) {
                existe = false;
            }
        }
        if (existe) {
            personas.add(administrador);
            serializarListaPersonas();
        }
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

    public boolean anadirAdministradorNegocio(AdministradorDeNegocio administradorDeNegocio) {
        boolean existe = true;
        boolean registrado = false;
        for (int i = 0; i < personas.Size(); i++) {
            if (personas.obtenerDato(i).getCedula().equals(administradorDeNegocio.getCedula())
                    || personas.obtenerDato(i).getCorreo().equals(administradorDeNegocio.getCorreo())
                    || personas.obtenerDato(i).getNumeroCelular().equals(administradorDeNegocio.getNumeroCelular())) {
                existe = false;
            }
        }
        if (existe) {
            personas.add(administradorDeNegocio);
            serializarListaPersonas();
            registrado = true;
        }
        return registrado;
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
