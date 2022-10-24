package src;

import Singleton.Singleton;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import util.Lista;

public class CentroComercial implements Serializable {

    private static Lista<Cliente> clientes;
    AdministradorGCentroComercial administrador;

    public CentroComercial() {
        this.clientes = Singleton.getINSTANCIA().getClientes();
        this.administrador = new AdministradorGCentroComercial("admin", "123", "julian", "123",
                "12334", Short.parseShort("18"));
    }

    public int iniciarSecion(String correo, String contrasena) {
        int resultado = 0;
        for (int i = 0; i < clientes.Size(); i++) {
            if (clientes.obtenerDato(i).getCorreo().equals(correo)
                    && clientes.obtenerDato(i).getContrasena().equals(contrasena)) {
                resultado = 1;
            } else if (administrador.getCorreo().equals(correo) && administrador.getContrasena().equals(contrasena)) {
                resultado = 2;
            }
        }
        return resultado;
    }

    public boolean anadirCliente(Cliente cliente) {
        boolean existe = true;
        boolean registrado = false;
        for (int i = 0; i < clientes.Size(); i++) {
            if (clientes.obtenerDato(i).getCedula().equals(cliente.getCedula())
                    || clientes.obtenerDato(i).getCorreo().equals(cliente.getCorreo())
                    || clientes.obtenerDato(i).getNumeroCelular().equals(cliente.getNumeroCelular())) {
                existe = false;
            }
        }
        if (existe) {
            clientes.add(cliente);
            serializarListaCliente();
            registrado = true;
        }
        return registrado;
    }

    public static void serializarListaCliente() {
        try {
            FileOutputStream archivo = new FileOutputStream("clientes.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(clientes);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
