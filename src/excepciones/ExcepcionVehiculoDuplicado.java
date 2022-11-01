/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Acer
 */
public class ExcepcionVehiculoDuplicado extends RuntimeException {

    public ExcepcionVehiculoDuplicado() {
        super("Los datos del vehiculo ya se encuentra registrado en el parqueadero, "
                + "por lo que no se puede registrar");
    }

}
