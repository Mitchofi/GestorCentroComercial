package src;

import java.io.Serializable;
import java.util.Date;
import util.Lista;

/**
 *
 * @author Acer
 */
public class Separado implements Serializable {

    private Lista<Articulo> produtosSeparados;
    private Cliente cliente;
    private Negocio negocio;
    private Date fechaInicio;
    private Date fechaDeRecogida;
    private float valorTotal;

    public Separado(Lista<Articulo> produtosSeparados, Cliente cliente, Negocio negocio, Date fechaInicio, Date fechaDeRecogida, float valorTotal) {
        this.produtosSeparados = new Lista<>();
        this.cliente = cliente;
        this.negocio = negocio;
        this.fechaInicio = fechaInicio;
        this.fechaDeRecogida = fechaDeRecogida;
        this.valorTotal = valorTotal;
    }

    public Lista<Articulo> getProdutosSeparados() {
        return produtosSeparados;
    }

    public void setProdutosSeparados(Lista<Articulo> produtosSeparados) {
        this.produtosSeparados = produtosSeparados;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Negocio getNegocio() {
        return negocio;
    }

    public void setNegocio(Negocio negocio) {
        this.negocio = negocio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaDeRecogida() {
        return fechaDeRecogida;
    }

    public void setFechaDeRecogida(Date fechaDeRecogida) {
        this.fechaDeRecogida = fechaDeRecogida;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

}
