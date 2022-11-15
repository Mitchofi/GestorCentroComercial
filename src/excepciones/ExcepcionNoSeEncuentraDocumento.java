/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Acer
 */
public class ExcepcionNoSeEncuentraDocumento extends RuntimeException {

    public ExcepcionNoSeEncuentraDocumento() {
        super("La persona con el documento ingresado no existe en el sistema");
    }

}
