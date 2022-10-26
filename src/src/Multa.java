package src;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Acer
 */
public class Multa implements Serializable {

    private String descripcion;
    private float valor;
    private Date fecha;
    private Cliente cliente;

    public Multa(String descripcion, float valor, Date fecha, Cliente cliente) {
        this.descripcion = descripcion;
        this.valor = valor;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
