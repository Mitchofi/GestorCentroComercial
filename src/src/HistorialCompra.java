package src;

import java.io.Serializable;
import util.Lista;

/**
 *
 * @author Acer
 */
public class HistorialCompra implements Serializable{

    private Lista<Articulo> articulos;
    private float valorTotal;

    /**
     *
     * @param articulos
     */
    public HistorialCompra() {
        this.articulos = new Lista<>();
        calcularValorTotal();
    }

    /**
     *
     * @return
     */
    public Lista getArticulos() {
        return articulos;
    }

    /**
     *
     * @param articulos
     */
    public void setArticulos(Lista articulos) {
        this.articulos = articulos;
    }

    /**
     *
     * @return
     */
    public float getValorTotal() {
        return valorTotal;
    }

    /**
     *
     * @param valorTotal
     */
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     *
     */
    public void calcularValorTotal() {
        for (int i = 0; i < articulos.Size(); i++) {
            valorTotal += articulos.obtenerDato(i).getValorDelProducto();
        }
    }
}
