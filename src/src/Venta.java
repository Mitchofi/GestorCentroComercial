package src;

import java.io.Serializable;
import java.util.Date;
import util.Lista;

class Venta implements Serializable {

    private float valorTotal;
    private Cliente cliente;
    private Negocio negocio;
    private Empleado empleado;
    private Date fechaVenta;
    private Lista<Articulo> articulos;

    public Venta(float valorTotal, Cliente cliente, Negocio negocio, Empleado empleado, Date fechaVenta, Lista<Articulo> articulos) {
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.negocio = negocio;
        this.empleado = empleado;
        this.fechaVenta = fechaVenta;
        this.articulos = new Lista<>();
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
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

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Lista<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Lista<Articulo> articulos) {
        this.articulos = articulos;
    }

}
