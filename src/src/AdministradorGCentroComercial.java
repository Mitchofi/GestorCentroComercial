package src;

import java.io.Serializable;

/**
 *
 * @author Acer
 */
public class AdministradorGCentroComercial extends Persona implements Serializable {

    public AdministradorGCentroComercial(String nombre, String cedula, String numeroCelular, String correo, String contrasena, short edad) {
        super(nombre, cedula, numeroCelular, correo, contrasena, edad);
    }

}
