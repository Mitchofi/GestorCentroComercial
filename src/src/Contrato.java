package src;

import java.util.Date;

class Contrato {

    private String descripcion;
    private String nombreDelNegocio;
    private Persona dueñoDelNegocio;
    private Date fechaInicio;
    private Date fechaFin;

    public Contrato(String descripcion, String nombreDelNegocio, Persona dueñoDelNegocio, Date fechaInicio, Date fechaFin) {
        this.descripcion = descripcion;
        this.nombreDelNegocio = nombreDelNegocio;
        this.dueñoDelNegocio = dueñoDelNegocio;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreDelNegocio() {
        return nombreDelNegocio;
    }

    public void setNombreDelNegocio(String nombreDelNegocio) {
        this.nombreDelNegocio = nombreDelNegocio;
    }

    public Persona getDueñoDelNegocio() {
        return dueñoDelNegocio;
    }

    public void setDueñoDelNegocio(Persona dueñoDelNegocio) {
        this.dueñoDelNegocio = dueñoDelNegocio;
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
