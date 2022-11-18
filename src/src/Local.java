package src;

import java.io.Serializable;

public class Local implements Serializable {

    private Negocio negocio;
    private boolean disponible;
    private boolean desocupado;
    private float valorArriendo;

    public Local() {
        this.negocio = null;
        this.valorArriendo = 0;
        this.disponible = true;
        this.desocupado = true;
    }

    public Negocio getNegocio() {
        return negocio;
    }

    public void setNegocio(Negocio negocio) {
        this.negocio = negocio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public float getValorArriendo() {
        return valorArriendo;
    }

    public void setValorArriendo(float valorArriendo) {
        this.valorArriendo = valorArriendo;
    }

    public boolean isDesocupado() {
        return desocupado;
    }

    public void setDesocupado(boolean desocupado) {
        this.desocupado = desocupado;
    }

}
