package src;

import java.io.Serializable;
import util.Lista;

/**
 *
 * @author Acer
 */
public class Cliente extends Persona implements Serializable {

    private Vehiculo Vehiculo;
    private boolean multa;
    private HistorialCompra historialCompra;
    private HistorialConcurso historialConcurso;
    private Lista<Separado> listaArticulosSeparados;
    private float valorInvertidoOnline;
    private float valorInvertidoPresencial;
    private float valorTotal;

    /**
     *
     * @param Vehiculo
     * @param nombre
     * @param cedula
     * @param numeroCelular
     * @param correo
     * @param contrasena
     * @param edad
     */
    public Cliente(Vehiculo Vehiculo, String nombre, String cedula,
            String numeroCelular, String correo, String contrasena, short edad) {
        super(nombre, cedula, numeroCelular, correo, contrasena, edad);
        this.Vehiculo = Vehiculo;
        this.multa = false;
        this.historialCompra = new HistorialCompra();
        this.historialConcurso = new HistorialConcurso();
        this.listaArticulosSeparados = new Lista<>();
        this.valorInvertidoOnline = 0;
        this.valorInvertidoPresencial = 0;
        this.valorTotal = 0;
    }

    /**
     *
     * @return
     */
    public Vehiculo getVehiculo() {
        return Vehiculo;
    }

    /**
     *
     * @param Vehiculo
     */
    public void setVehiculo(Vehiculo Vehiculo) {
        this.Vehiculo = Vehiculo;
    }

    /**
     *
     * @return
     */
    public boolean isMulta() {
        return multa;
    }

    /**
     *
     * @param multa
     */
    public void setMulta(boolean multa) {
        this.multa = multa;
    }

    /**
     *
     * @return
     */
    public HistorialCompra getHistorialCompra() {
        return historialCompra;
    }

    /**
     *
     * @param historialCompra
     */
    public void setHistorialCompra(HistorialCompra historialCompra) {
        this.historialCompra = historialCompra;
    }

    /**
     *
     * @return
     */
    public HistorialConcurso getHistorialConcurso() {
        return historialConcurso;
    }

    /**
     *
     * @param historialConcurso
     */
    public void setHistorialConcurso(HistorialConcurso historialConcurso) {
        this.historialConcurso = historialConcurso;
    }

    /**
     *
     * @return
     */
    public Lista<Separado> getListaArticulosSeparados() {
        return listaArticulosSeparados;
    }

    /**
     *
     * @param listaArticulosSeparados
     */
    public void setListaArticulosSeparados(Lista<Separado> listaArticulosSeparados) {
        this.listaArticulosSeparados = listaArticulosSeparados;
    }

    /**
     *
     * @return
     */
    public float getValorInvertidoOnline() {
        return valorInvertidoOnline;
    }

    /**
     *
     * @param valorInvertidoOnline
     */
    public void setValorInvertidoOnline(float valorInvertidoOnline) {
        this.valorInvertidoOnline = valorInvertidoOnline;
    }

    /**
     *
     * @return
     */
    public float getValorInvertidoPresencial() {
        return valorInvertidoPresencial;
    }

    /**
     *
     * @param valorInvertidoPresencial
     */
    public void setValorInvertidoPresencial(float valorInvertidoPresencial) {
        this.valorInvertidoPresencial = valorInvertidoPresencial;
    }

    /**
     *
     * @return
     */
    public float getValorTotal() {
        return valorTotal;
    }

    /**
     *
     * @param valorTotal
     */
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
}
