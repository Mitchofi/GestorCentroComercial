/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Acer
 */
public class ExcepcionClienteDuplicado extends RuntimeException {

    public ExcepcionClienteDuplicado() {
        super("Los datos del cliente ya se encuentra registrado en el sistema "
                + "por lo que no se puede registrar");
    }

}
