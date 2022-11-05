package src;

import java.io.Serializable;
import java.util.Date;
import util.Lista;

/**
 *
 * @author Acer
 */
public class Concurso implements Serializable {

    private int codigo;
    private float valorMinimo;
    private boolean estado;
    private String nombreConcurso;
    private String premioConcurso;
    private Date fechaIncioConcurso;
    private Date fechaFinConcurso;
    private Cliente ganador;
    private Lista<Cliente> participantes;

    public Concurso(float valorMinimo, boolean estado, String nombreConcurso,
            String premioConcurso, Date fechaIncioConcurso,
            Date fechaFinConcurso) {
        this.codigo++;
        this.valorMinimo = valorMinimo;
        this.estado = true;
        this.nombreConcurso = nombreConcurso;
        this.premioConcurso = premioConcurso;
        this.fechaIncioConcurso = fechaIncioConcurso;
        this.fechaFinConcurso = fechaFinConcurso;
        this.ganador = null;
        this.participantes = new Lista<>();
    }

    public float getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(float valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombreConcurso() {
        return nombreConcurso;
    }

    public void setNombreConcurso(String nombreConcurso) {
        this.nombreConcurso = nombreConcurso;
    }

    public String getPremioConcurso() {
        return premioConcurso;
    }

    public void setPremioConcurso(String premioConcurso) {
        this.premioConcurso = premioConcurso;
    }

    public Date getFechaIncioConcurso() {
        return fechaIncioConcurso;
    }

    public void setFechaIncioConcurso(Date fechaIncioConcurso) {
        this.fechaIncioConcurso = fechaIncioConcurso;
    }

    public Date getFechaFinConcurso() {
        return fechaFinConcurso;
    }

    public void setFechaFinConcurso(Date fechaFinConcurso) {
        this.fechaFinConcurso = fechaFinConcurso;
    }

    public Cliente getGanador() {
        return ganador;
    }

    public void setGanador(Cliente ganador) {
        this.ganador = ganador;
    }

    public Lista<Cliente> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Lista<Cliente> participantes) {
        this.participantes = participantes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
