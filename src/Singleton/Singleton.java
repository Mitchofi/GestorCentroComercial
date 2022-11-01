package Singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import src.CentroComercial;
import src.Concurso;
import src.Local;
import src.Parqueadero;
import src.Persona;
import util.Lista;

public class Singleton {

    private static Singleton INSTANCIA = new Singleton();
    private static CentroComercial instanciaControlador = new CentroComercial();

    private Lista<Persona> personas;
    private static Local[][] locales;
    private Lista<Concurso> concursos;
    private Parqueadero parqueadero;

    private Singleton() {
        leerListaPersonas();
        leerListaLocales();
        leerListaConcursos();
        leerListaParqueadero();
    }

    public static Singleton getINSTANCIA() {
        return INSTANCIA;
    }

    public static CentroComercial getInstanciaControlador() {
        return instanciaControlador;
    }

    public Lista<Persona> getPersonas() {
        return personas;
    }

    public Lista<Concurso> getConcursos() {
        return concursos;
    }

    public static Local[][] getLocales() {
        return locales;
    }

    public Parqueadero getParqueadero() {
        return parqueadero;
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

    private void leerListaConcursos() {
        try {
            FileInputStream archivo = new FileInputStream("concursos.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            concursos = (Lista<Concurso>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            concursos = new Lista<>();
        }
    }

    private void leerListaParqueadero() {
        try {
            FileInputStream archivo = new FileInputStream("parqueadero.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            parqueadero = (Parqueadero) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            parqueadero = new Parqueadero();
        }
    }
}
