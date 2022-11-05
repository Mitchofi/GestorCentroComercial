/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Acer
 */
public class ExcepcionConcursoDuplicado extends RuntimeException {

    public ExcepcionConcursoDuplicado() {
        super("El Concurso ya se encuentra registrado en el sistema");
    }

}
