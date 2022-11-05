package src;

import java.io.Serializable;

/**
 *
 * @author Acer
 */
public class Articulo implements Serializable {

    private String codigo;
    private String nombreProducto;
    private String decripcionProducto;
    private String nombreCategoria;
    private float valorDelProducto;
    private int porcentajeDescuento;
    private int cantidadProducto;

    public Articulo(String codigo, String nombreProducto, String decripcionProducto, String nombreCategoria, float valorDelProducto, int porcentajeDescuento, int cantidadProducto) {
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.decripcionProducto = decripcionProducto;
        this.nombreCategoria = nombreCategoria;
        this.valorDelProducto = valorDelProducto;
        this.porcentajeDescuento = porcentajeDescuento;
        this.cantidadProducto = cantidadProducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDecripcionProducto() {
        return decripcionProducto;
    }

    public void setDecripcionProducto(String decripcionProducto) {
        this.decripcionProducto = decripcionProducto;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public float getValorDelProducto() {
        return valorDelProducto;
    }

    public void setValorDelProducto(float valorDelProducto) {
        this.valorDelProducto = valorDelProducto;
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
}
