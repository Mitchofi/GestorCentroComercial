/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Acer
 */
public class ExcepcionNoSeEncuentraElUsuario extends RuntimeException {

    public ExcepcionNoSeEncuentraElUsuario() {
        super("Los datos del usuario no se encuentra registrado en el sistema "
                + "por lo que no se puede acceder");
    }

}
