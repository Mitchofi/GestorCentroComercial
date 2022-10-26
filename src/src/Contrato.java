package src;

import java.io.Serializable;
import java.util.Date;

public class Contrato  implements Serializable{

    private Negocio negocio;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFin;

    public Contrato(Negocio negocio, String descripcion, Date fechaInicio, Date fechaFin) {
        this.negocio = negocio;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Negocio getNegocio() {
        return negocio;
    }

    public void setNegocio(Negocio negocio) {
        this.negocio = negocio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

}
