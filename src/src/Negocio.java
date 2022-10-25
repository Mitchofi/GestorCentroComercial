package src;

class Negocio {

    private Contrato contrato;
    private Solicitud solicitud[];

    public Negocio(Contrato contrato) {
        this.contrato = contrato;
        this.solicitud = new Solicitud[3];
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Solicitud[] getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud[] solicitud) {
        this.solicitud = solicitud;
    }

}
