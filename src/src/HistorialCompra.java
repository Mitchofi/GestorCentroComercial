/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.io.Serializable;
import util.Lista;

/**
 *
 * @author usuario
 */
public class HistorialCompra implements Serializable {

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

    public void calcularValorTotal() {
        for (int i = 0; i < articulos.Size(); i++) {
            valorTotal += articulos.obtenerDato(i).getValorDelProducto();
        }
    }

    public Lista<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Lista<Articulo> articulos) {
        this.articulos = articulos;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
}
