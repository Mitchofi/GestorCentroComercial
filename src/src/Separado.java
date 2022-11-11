package src;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Acer
 */
public class Separado implements Serializable {

    private Articulo produtosSeparado;
    private Cliente cliente;
    private Date fechaInicio;
    private Date fechaDeRecogida;
    private Negocio negocio;
    private float valorTotal;

    public Separado(Articulo produtosSeparado, Cliente cliente, Negocio negocio, Date fechaInicio, Date fechaDeRecogida) {
        this.produtosSeparado = produtosSeparado;
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.negocio = negocio;
        this.fechaDeRecogida = fechaDeRecogida;
        this.valorTotal = 0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public Articulo getProdutosSeparado() {
        return produtosSeparado;
    }

    public void setProdutosSeparado(Articulo produtosSeparado) {
        this.produtosSeparado = produtosSeparado;
    }

    public Negocio getNegocio() {
        return negocio;
    }

    public void setNegocio(Negocio negocio) {
        this.negocio = negocio;
    }

}
