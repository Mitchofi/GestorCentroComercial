package src;

import java.io.Serializable;
import java.util.Date;
import util.Lista;

/**
 *
 * @author Acer
 */
public class Separado implements Serializable{

    private Lista<Articulo> listaAriculosSeparados;
    private Date fechaDeRecogida;

    /**
     *
     * @param fechaDeRecogida
     */
    public Separado(Date fechaDeRecogida) {
        this.listaAriculosSeparados = new Lista<>();
        this.fechaDeRecogida = fechaDeRecogida;
    }

    /**
     *
     * @return
     */
    public Lista<Articulo> getListaAriculosSeparados() {
        return listaAriculosSeparados;
    }

    /**
     *
     * @param listaAriculosSeparados
     */
    public void setListaAriculosSeparados(Lista<Articulo> listaAriculosSeparados) {
        this.listaAriculosSeparados = listaAriculosSeparados;
    }

    /**
     *
     * @return
     */
    public Date getFechaDeRecogida() {
        return fechaDeRecogida;
    }

    /**
     *
     * @param fechaDeRecogida
     */
    public void setFechaDeRecogida(Date fechaDeRecogida) {
        this.fechaDeRecogida = fechaDeRecogida;
    }

}
