package src;

import java.io.Serializable;

/**
 *
 * @author Acer
 */
public class Articulo implements Serializable{

    private String nombreProducto;
    private String nombreDelLocal;
    private String categoria;
    private float valorDelProducto;

    /**
     *
     * @param nombreProducto
     * @param nombreDelLocal
     * @param categoria
     * @param valorDelProducto
     */
    public Articulo(String nombreProducto, String nombreDelLocal, String categoria, float valorDelProducto) {
        this.nombreProducto = nombreProducto;
        this.nombreDelLocal = nombreDelLocal;
        this.categoria = categoria;
        this.valorDelProducto = valorDelProducto;
    }

    /**
     *
     * @return
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     *
     * @param nombreProducto
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     *
     * @return
     */
    public String getNombreDelLocal() {
        return nombreDelLocal;
    }

    /**
     *
     * @param nombreDelLocal
     */
    public void setNombreDelLocal(String nombreDelLocal) {
        this.nombreDelLocal = nombreDelLocal;
    }

    /**
     *
     * @return
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     *
     * @param categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     *
     * @return
     */
    public float getValorDelProducto() {
        return valorDelProducto;
    }

    /**
     *
     * @param valorDelProducto
     */
    public void setValorDelProducto(float valorDelProducto) {
        this.valorDelProducto = valorDelProducto;
    }

}
