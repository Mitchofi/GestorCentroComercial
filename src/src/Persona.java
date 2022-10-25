package src;

import java.io.Serializable;

/**
 *
 * @author Acer
 */
public class Persona implements Serializable {

    private String nombre;
    private String cedula;
    private String numeroCelular;
    private String correo;
    private String contrasena;
    private short edad;

    /**
     *
     * @param nombre
     * @param cedula
     * @param numeroCelular
     * @param correo
     * @param contrasena
     * @param edad
     */
    public Persona(String nombre, String cedula, String numeroCelular, String correo, String contrasena, short edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.numeroCelular = numeroCelular;
        this.correo = correo;
        this.contrasena = contrasena;
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
    public String getCorreo() {
        return correo;
    }

    /**
     *
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     *
     * @return
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     *
     * @param contrasena
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
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
