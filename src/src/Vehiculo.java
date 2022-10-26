package src;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Acer
 */
public class Vehiculo implements Serializable {

    private String tipo;
    private String placa;
    private Date fechaEntrada;
    private Date fechaSalida;

    public Vehiculo(String tipo, String placa) {
        this.tipo = tipo;
        this.placa = placa;
        this.fechaEntrada = null;
        this.fechaSalida = null;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

}
