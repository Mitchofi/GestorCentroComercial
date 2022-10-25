package src;

import java.io.Serializable;

public class Local implements Serializable {

    private String nombre;
    private Negocio negocio;
    private boolean disponible;
    private float valorArriendo;

    public Local() {
        this.nombre = null;
        this.negocio = null;
        this.disponible = true;
        this.valorArriendo = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

}
