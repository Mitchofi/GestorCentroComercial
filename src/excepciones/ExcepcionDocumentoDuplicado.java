/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Acer
 */
public class ExcepcionDocumentoDuplicado extends RuntimeException {

    public ExcepcionDocumentoDuplicado() {
        super("El documento ya se encuentra registrado a un usuario");
    }

}
