package src;

import java.io.Serializable;
import java.util.Date;
import util.Lista;

/**
 *
 * @author Acer
 */
public class Concurso implements Serializable{

    private String nombreConcurso;
    private String premioConcurso;
    private Cliente ganador;
    private Lista<Cliente> participantes;
    private Date fechaIncioConcurso;
    private Date fechaFinConcurso;
    private boolean estado;

    /**
     *
     * @param nombreConcurso
     * @param premioConcurso
     * @param ganador
     * @param participantes
     * @param fechaIncioConcurso
     * @param fechaFinConcurso
     * @param estado
     */
    public Concurso(String nombreConcurso, String premioConcurso,
            Cliente ganador, Date fechaIncioConcurso, Date fechaFinConcurso) {
        this.nombreConcurso = nombreConcurso;
        this.premioConcurso = premioConcurso;
        this.ganador = ganador;
        this.participantes = new Lista<>();
        this.fechaIncioConcurso = fechaIncioConcurso;
        this.fechaFinConcurso = fechaFinConcurso;
        this.estado = true;
    }

    /**
     *
     * @return
     */
    public String getNombreConcurso() {
        return nombreConcurso;
    }

    /**
     *
     * @param nombreConcurso
     */
    public void setNombreConcurso(String nombreConcurso) {
        this.nombreConcurso = nombreConcurso;
    }

    /**
     *
     * @return
     */
    public String getPremioConcurso() {
        return premioConcurso;
    }

    /**
     *
     * @param premioConcurso
     */
    public void setPremioConcurso(String premioConcurso) {
        this.premioConcurso = premioConcurso;
    }

    /**
     *
     * @return
     */
    public Cliente getGanador() {
        return ganador;
    }

    /**
     *
     * @param ganador
     */
    public void setGanador(Cliente ganador) {
        this.ganador = ganador;
    }

    /**
     *
     * @return
     */
    public Lista<Cliente> getParticipantes() {
        return participantes;
    }

    /**
     *
     * @param participantes
     */
    public void setParticipantes(Lista<Cliente> participantes) {
        this.participantes = participantes;
    }

    /**
     *
     * @return
     */
    public Date getFechaIncioConcurso() {
        return fechaIncioConcurso;
    }

    /**
     *
     * @param fechaIncioConcurso
     */
    public void setFechaIncioConcurso(Date fechaIncioConcurso) {
        this.fechaIncioConcurso = fechaIncioConcurso;
    }

    /**
     *
     * @return
     */
    public Date getFechaFinConcurso() {
        return fechaFinConcurso;
    }

    /**
     *
     * @param fechaFinConcurso
     */
    public void setFechaFinConcurso(Date fechaFinConcurso) {
        this.fechaFinConcurso = fechaFinConcurso;
    }

    /**
     *
     * @return
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     *
     * @param estado
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
