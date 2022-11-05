package src;

import java.io.Serializable;
import util.Lista;

/**
 *
 * @author Acer
 */
public class HistorialConcurso implements Serializable {

    private Lista<Concurso> concursos;

    /**
     *
     */
    public HistorialConcurso() {
        this.concursos = new Lista<>();
    }

    /**
     *
     * @return
     */
    public Lista<Concurso> getConcursos() {
        return concursos;
    }

    /**
     *
     * @param concursos
     */
    public void setConcursos(Lista<Concurso> concursos) {
        this.concursos = concursos;
    }

}
