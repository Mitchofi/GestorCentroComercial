package src;

import java.io.Serializable;

public class Empleado extends Persona implements Serializable {

    public static final String VENDEDOR = "vendedor";
    private Vehiculo vehiculo;
    private String rol;

    public Empleado(Vehiculo vehiculo, String rol, String nombre, String cedula, String numeroCelular, String correo, String contrasena, short edad) {
        super(nombre, cedula, numeroCelular, correo, contrasena, edad);
        this.vehiculo = vehiculo;
        this.rol = rol;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}
