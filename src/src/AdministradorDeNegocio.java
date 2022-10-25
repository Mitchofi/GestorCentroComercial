package src;

import java.io.Serializable;

public class AdministradorDeNegocio extends Persona implements Serializable {

    public AdministradorDeNegocio(String nombre, String cedula, String numeroCelular, String correo, String contrasena, short edad) {
        super(nombre, cedula, numeroCelular, correo, contrasena, edad);
    }

}
