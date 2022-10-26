package src;

import java.io.Serializable;
import java.util.Date;

class Solicitud implements Serializable {

    public static final String CANCELADA = "cancelada";
    public static final String PENDIENTE = "pendiente";
    public static final String PROGRESO = "progreso";
    public static final String ATENDIDA = "atendida";

    private String descripcion;
    private String estado;
    private Date fecha;

    public Solicitud(String descripcion, Date fecha) {
        this.descripcion = descripcion;
        this.estado = PENDIENTE;
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
