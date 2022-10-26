package src;

import java.io.Serializable;

public class Empleado extends Persona  implements Serializable {

    public static final String VENDEDOR = "vendedor";
    private String rol;

    public Empleado(String nombre, String cedula, String numeroCelular, String correo, String contrasena, short edad) {
        super(nombre, cedula, numeroCelular, correo, contrasena, edad);
        this.rol = rol;
    }

}
