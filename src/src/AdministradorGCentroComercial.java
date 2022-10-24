package src;

import java.io.Serializable;

/**
 *
 * @author Acer
 */
public class AdministradorGCentroComercial extends Persona implements Serializable {

    private String correo;
    private String contrasena;

    /**
     *
     * @param correo
     * @param contrasena
     * @param nombre
     * @param cedula
     * @param numeroCelular
     * @param edad
     */
    public AdministradorGCentroComercial(String correo, String contrasena, String nombre, String cedula, String numeroCelular, short edad) {
        super(nombre, cedula, numeroCelular, edad);
        this.correo = correo;
        this.contrasena = contrasena;
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

}
