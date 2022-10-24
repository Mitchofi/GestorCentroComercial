package src;

import java.io.Serializable;

/**
 *
 * @author Acer
 */
public class Multa implements Serializable{

    private String nombreMulta;
    private String descripcion;
    private float valor;

    /**
     *
     * @param nombreMulta
     * @param descripcion
     * @param valor
     */
    public Multa(String nombreMulta, String descripcion, float valor) {
        this.nombreMulta = nombreMulta;
        this.descripcion = descripcion;
        this.valor = valor;
    }

    /**
     *
     * @return
     */
    public String getNombreMulta() {
        return nombreMulta;
    }

    /**
     *
     * @param nombreMulta
     */
    public void setNombreMulta(String nombreMulta) {
        this.nombreMulta = nombreMulta;
    }

    /**
     *
     * @return
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * @return
     */
    public float getValor() {
        return valor;
    }

    /**
     *
     * @param valor
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

}
