package src;

import java.io.Serializable;

/**
 *
 * @author Acer
 */
public class Persona implements Serializable{

    private String nombre;
    private String cedula;
    private String numeroCelular;
    private short edad;

    /**
     *
     * @param nombre
     * @param cedula
     * @param numeroCelular
     * @param edad
     */
    public Persona(String nombre, String cedula, String numeroCelular, short edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.numeroCelular = numeroCelular;
        this.edad = edad;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getCedula() {
        return cedula;
    }

    /**
     *
     * @param cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     *
     * @return
     */
    public String getNumeroCelular() {
        return numeroCelular;
    }

    /**
     *
     * @param numeroCelular
     */
    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    /**
     *
     * @return
     */
    public short getEdad() {
        return edad;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(short edad) {
        this.edad = edad;
    }

}
