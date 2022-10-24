package Singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import src.CentroComercial;
import src.Cliente;
import util.Lista;

public class Singleton {

    private static Singleton INSTANCIA = new Singleton();
    private static CentroComercial instanciaControlador = new CentroComercial();

    public static Singleton getINSTANCIA() {
        return INSTANCIA;
    }

    public static CentroComercial getInstanciaControlador() {
        return instanciaControlador;
    }

    public static void setInstanciaControlador(CentroComercial aInstanciaControlador) {
        instanciaControlador = aInstanciaControlador;
    }

    private Lista<Cliente> clientes;

    private Singleton() {
        leerListaClientes();
    }

    public Lista<Cliente> getClientes() {
        return clientes;
    }

    public void getClientes(Lista<Cliente> usuarios) {
        this.clientes = usuarios;
    }

    private void leerListaClientes() {
        try {
            FileInputStream archivo = new FileInputStream("Clientes.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            clientes = (Lista<Cliente>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            clientes = new Lista<>();
        }
    }

}
