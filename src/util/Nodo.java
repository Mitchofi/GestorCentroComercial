package util;

import java.io.Serializable;

/**
 *
 * @author Acer
 * @param <T>
 */
public class Nodo<T> implements Serializable {
//FIFO = First in, first out
//EnQueve = encolar
//DesQueve = desecolar

    private T Dato;
    private Nodo nodoSig;

    /**
     *
     * @param dato
     */
    public Nodo(T dato) {
        this.Dato = dato;
        this.nodoSig = null;
    }

    /**
     *
     * @return
     */
    public T getDato() {
        return Dato;
    }

    /**
     *
     * @return
     */
    public Nodo getNodoSig() {
        return nodoSig;
    }

    /**
     *
     * @param nodoSig
     */
    public void setNodoSig(Nodo nodoSig) {
        this.nodoSig = nodoSig;
    }

}
