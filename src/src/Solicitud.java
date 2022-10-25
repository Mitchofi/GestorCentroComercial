package src;

class Solicitud {

    public static final String CANCELADA = "cancelada";
    public static final String PENDIENTE = "pendiente";
    public static final String PROGRESO = "progreso";
    public static final String ATENDIDA = "atendida";

    private String descripcion;
    private String estado;

    public Solicitud(String descripcion) {
        this.descripcion = descripcion;
        this.estado = PENDIENTE;
    }
    

}
