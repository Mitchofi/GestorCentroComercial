package util;

import java.io.Serializable;

/**
 *
 * @author Acer
 * @param <T>
 */
public class Queve<T> implements Serializable {

    Nodo<T> head;
    int size;

    /**
     *
     * @return
     */
    public boolean isEmpty() {
        boolean vacio = false;
        if (head == null) {
            vacio = true;
        }
        return vacio;
    }

    /**
     *
     */
    public Queve() {
        this.head = null;
        this.size = 0;
    }

    /**
     *
     * @param dato
     * @return
     */
    public boolean add(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (head == null) {
            head = nuevo;
        } else {
            Nodo<T> aux = head;
            while (aux.getNodoSig() != null) {
                aux = aux.getNodoSig();
            }
            aux.setNodoSig(nuevo);
        }
        size++;
        return true;
    }

    /**
     *
     * @param dato
     */
    public void addInHead(T dato) {
        Nodo<T> nuevo = new Nodo<T>(dato);
        if (head == null) {
            head = nuevo;
        } else {
            Nodo<T> aux = head;
            nuevo.setNodoSig(aux);
            head = nuevo;
        }
        size++;
    }

    /**
     *
     * @return
     */
    public T peek() {
        if (isEmpty()) {
            throw new NullPointerException();
        } else {
            return head.getDato();
        }
    }

    /**
     *
     * @return
     */
    public T poll() {
        T data;
        if (isEmpty()) {
            throw new NullPointerException();
        } else {
            data = head.getDato();
            head = head.getNodoSig();
            size--;
        }
        return data;
    }

    /**
     *
     * @param pos
     * @return
     */
    public T getData(int pos) {
        T dato;
        Nodo<T> aux = head;
        if (pos == 0) {
            dato = head.getDato();
        } else {
            for (int i = 0; i < pos; i++) {
                aux = aux.getNodoSig();
            }
            dato = aux.getDato();
        }
        return dato;
    }

    /**
     *
     * @return
     */
    public int size() {
        return size;
    }

    /**
     *
     */
    public void clean() {
        head = null;
        size = 0;
    }
}
