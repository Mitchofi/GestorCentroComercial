package util;

import java.io.Serializable;

/**
 *
 * @author Acer
 * @param <T>
 */
public class Lista<T> implements Serializable{

    private Nodo<T> cabeza;
    private int tamano;

    /**
     *
     */
    public Lista() {
        this.cabeza = null;
        this.tamano = 0;
    }

    /**
     *
     * @param dato
     */
    public void add(T dato) {
        Nodo<T> nuevo = new Nodo(dato);
        if (cabeza == null) {
            this.cabeza = nuevo;
        } else {
            Nodo<T> aux = cabeza;
            while (aux.getNodoSig() != null) {
                aux = aux.getNodoSig();
            }
            aux.setNodoSig(nuevo);
        }
        tamano++;
    }

    /**
     *
     * @param dato
     * @param posicion
     */
    public void addPos(T dato, int posicion) {
        if (posicion > tamano || posicion < 0) {
            throw new IndexOutOfBoundsException();
        } else {

            Nodo<T> nuevo = new Nodo(dato);
            Nodo<T> auxInicial = cabeza;
            for (int i = 0; i < posicion; i++) {
                auxInicial = cabeza.getNodoSig();
            }
            if (auxInicial.getNodoSig() == null) {
                auxInicial.setNodoSig(nuevo);
            } else {
                Nodo<T> auxSecundario;
                auxSecundario = auxInicial.getNodoSig();
                nuevo.setNodoSig(auxSecundario);
                auxInicial.setNodoSig(nuevo);
            }
            tamano++;
        }
    }

    /**
     *
     * @param pos
     * @return
     */
    public T obtenerDato(int pos) {
        T per;
        if (pos > tamano || pos < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (pos == 0) {
            per = cabeza.getDato();
        } else {
            Nodo<T> aux = cabeza;
            for (int i = 0; i < pos; i++) {
                aux = aux.getNodoSig();
            }
            per = aux.getDato();
        }
        return per;
    }

    /**
     *
     * @param pos
     */
    public void eliminarDato(int pos) {
        if (pos > tamano || pos < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (pos == 0) {
            cabeza = cabeza.getNodoSig();
        } else {
            Nodo<T> aux = cabeza;
            Nodo<T> aux2;
            Nodo<T> aux3;
            for (int i = 0; i < pos - 1; i++) {
                aux = aux.getNodoSig();
            }
            aux2 = aux.getNodoSig();
            aux3 = aux2.getNodoSig();
            aux.setNodoSig(aux3);
        }
        tamano--;
    }

    /**
     *
     */
    public void eliminarTodo() {
        cabeza = null;
        tamano = 0;
    }

    /**
     *
     * @return
     */
    public int Size() {
        return this.tamano;
    }
}
