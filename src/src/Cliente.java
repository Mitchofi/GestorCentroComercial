package src;

import java.io.Serializable;
import util.Lista;

/**
 *
 * @author Acer
 */
public class Cliente extends Persona implements Serializable {

    private String correo;
    private String contrasena;
    private Vehiculo Vehiculo;
    private Lista<Articulo> articulos;
    private Lista<Multa> multas;
    private HistorialCompra historialCompra;
    private HistorialConcurso historialConcurso;
    private Lista<Separado> listaArticulosSeparados;
    private float valorInvertidoOnline;
    private float valorInvertidoPresencial;
    private float valorTotal;

    /**
     *
     * @param correo
     * @param contrasena
     * @param Vehiculo
     * @param nombre
     * @param cedula
     * @param numeroCelular
     * @param edad
     */
    public Cliente(String correo, String contrasena, Vehiculo Vehiculo,
            String nombre, String cedula,
            String numeroCelular, short edad) {
        super(nombre, cedula, numeroCelular, edad);
        this.correo = correo;
        this.contrasena = contrasena;
        this.Vehiculo = Vehiculo;
        this.articulos = new Lista<>();
        this.multas = new Lista<>();
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
    public String getCorreo() {
        return correo;
    }

    /**
     *
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     *
     * @return
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     *
     * @param contrasena
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
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
    public Lista<Articulo> getArticulos() {
        return articulos;
    }

    /**
     *
     * @param articulos
     */
    public void setArticulos(Lista<Articulo> articulos) {
        this.articulos = articulos;
    }

    /**
     *
     * @return
     */
    public Lista<Multa> getMultas() {
        return multas;
    }

    /**
     *
     * @param multas
     */
    public void setMultas(Lista<Multa> multas) {
        this.multas = multas;
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
