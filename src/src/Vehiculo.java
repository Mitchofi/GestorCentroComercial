package src;

import java.io.Serializable;

/**
 *
 * @author Acer
 */
public class Vehiculo implements Serializable {

    private String tipo;
    private String placa;

    /**
     *
     * @param tipo
     * @param placa
     */
    public Vehiculo(String tipo, String placa) {
        this.tipo = tipo;
        this.placa = placa;
    }

    /**
     *
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * @return
     */
    public String getPlaca() {
        return placa;
    }

    /**
     *
     * @param placa
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

}
