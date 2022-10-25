package Singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import src.CentroComercial;
import src.Local;
import src.Persona;
import util.Lista;

public class Singleton {

    private static Singleton INSTANCIA = new Singleton();
    private static CentroComercial instanciaControlador = new CentroComercial();

    private Lista<Persona> personas;
    private static Local[][] locales;

    private Singleton() {
        leerListaPersonas();
        leerListaLocales();
    }

    public static Singleton getINSTANCIA() {
        return INSTANCIA;
    }

    public static CentroComercial getInstanciaControlador() {
        return instanciaControlador;
    }

    public static void setInstanciaControlador(CentroComercial aInstanciaControlador) {
        instanciaControlador = aInstanciaControlador;
    }

    public Lista<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(Lista<Persona> personas) {
        this.personas = personas;
    }

    private void leerListaPersonas() {
        try {
            FileInputStream archivo = new FileInputStream("personas.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            personas = (Lista<Persona>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            personas = new Lista<>();
        }
    }

    public static Local[][] getLocales() {
        return locales;
    }

    public static void setLocales(Local[][] aLocales) {
        locales = aLocales;
    }

    private void leerListaLocales() {
        try {
            FileInputStream archivo = new FileInputStream("locales.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            locales = (Local[][]) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            locales = new Local[5][4];
        }
    }
}
