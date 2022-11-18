package src;

import excepciones.ExcepcionCorreoDuplicado;
import excepciones.ExcepcionEmpleadoDuplicado;
import java.io.Serializable;
import java.util.Date;
import static src.CentroComercial.locales;
import static src.CentroComercial.personas;
import static src.CentroComercial.serializarListaLocales;
import util.Lista;

public class Negocio implements Serializable {

    private String nombre;
    private Contrato contrato;
    private AdministradorDeNegocio administrador;
    private Lista<Venta> ventas;
    private Lista<Empleado> empleados;
    private Lista<Articulo> articulos;
    private Lista<Separado> separados;
    private Lista<Multa> multas;

    public Negocio() {
        this.nombre = null;
        this.contrato = null;
        this.administrador = null;
        this.ventas = new Lista<>();
        this.empleados = new Lista<>();
        this.articulos = new Lista<>();
        this.separados = new Lista<>();
        this.multas = new Lista<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public AdministradorDeNegocio getAdministrador() {
        return administrador;
    }

    public void setAdministrador(AdministradorDeNegocio administrador) {
        this.administrador = administrador;
    }

    public Lista<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(Lista<Venta> ventas) {
        this.ventas = ventas;
    }

    public Lista<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Lista<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Lista<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Lista<Articulo> articulos) {
        this.articulos = articulos;
    }

    public Lista<Separado> getSeparados() {
        return separados;
    }

    public void setSeparados(Lista<Separado> separados) {
        this.separados = separados;
    }

    public Lista<Multa> getMultas() {
        return multas;
    }

    public void setMultas(Lista<Multa> multas) {
        this.multas = multas;
    }

    public boolean anadirEmpleadoLocal(Empleado empleado) throws ExcepcionEmpleadoDuplicado {
        boolean existe = true;
        boolean registrado = false;
        for (int i = 0; i < empleados.Size(); i++) {
            for (int j = 0; j < CentroComercial.personas.Size(); j++) {
                if (CentroComercial.personas.obtenerDato(j).getCedula().equals(empleado.getCedula())
                        || empleados.obtenerDato(i).getCedula().equals(empleado.getCedula())
                        || empleados.obtenerDato(i).getCorreo().equals(empleado.getCorreo())
                        || empleados.obtenerDato(i).getNumeroCelular().equals(empleado.getNumeroCelular())) {
                    existe = false;
                    throw new ExcepcionEmpleadoDuplicado();
                }
            }

        }
        if (existe) {
            empleados.add(empleado);
            registrado = true;
        }
        return registrado;
    }

    public boolean modificarEmpleadoNegocio(String cedula, Empleado empleado, Negocio negocio) {
        Persona aux = buscarPorCedulaNegocio(cedula, negocio);
        Empleado empleadoAux = (Empleado) aux;
        boolean modificado = false;
        boolean disponible = true;
        if (empleadoAux != null) {
            for (int i = 0; i < negocio.getEmpleados().Size(); i++) {
                for (int j = 0; j < personas.Size(); j++) {
                    if (negocio.getEmpleados().obtenerDato(i).getCorreo().equals(empleado.getCorreo())
                            || negocio.getEmpleados().obtenerDato(i).getNumeroCelular().equals(empleado.getNumeroCelular())
                            || personas.obtenerDato(j).getCorreo().equals(empleado.getCorreo())
                            || personas.obtenerDato(j).getNumeroCelular().equals(empleado.getNumeroCelular())) {
                        disponible = false;
                    }
                }
            }
            validarCorreo(empleado.getCorreo());
            if (disponible) {
                empleadoAux.setCorreo(empleado.getCorreo());
                empleadoAux.setContrasena(empleado.getContrasena());
                empleadoAux.setEdad(empleado.getEdad());
                empleadoAux.setNombre(empleado.getNombre());
                empleadoAux.setNumeroCelular(empleado.getNumeroCelular());
                empleadoAux.setRol(empleado.getRol());
                empleadoAux.setVehiculo(empleado.getVehiculo());
                modificado = true;
                serializarListaLocales();
            }
        }
        return modificado;
    }

    public boolean eliminarEmpleadoNegocio(String cedula, Negocio negocio) {
        boolean eliminado = false;
        for (int i = 0; i < negocio.getEmpleados().Size(); i++) {
            if (negocio.getEmpleados().obtenerDato(i).getCedula().equals(cedula)) {
                negocio.getEmpleados().eliminarDato(i);
                serializarListaLocales();
                eliminado = true;
            }
        }
        return eliminado;
    }

    public Persona buscarPorCedulaNegocio(String cedula, Negocio negocio) {
        Persona persona = null;
        for (int i = 0; i < negocio.getEmpleados().Size(); i++) {
            if (negocio.getEmpleados().obtenerDato(i).getCedula().equals(cedula)) {
                persona = negocio.getEmpleados().obtenerDato(i);
            }
        }
        return persona;
    }

    public boolean validarCorreo(String correo) throws ExcepcionCorreoDuplicado {
        boolean existe = false;
        for (int k = 0; k < personas.Size(); k++) {
            if (personas.obtenerDato(k).getCorreo().equals(correo)) {
                existe = true;
            }
        }
        for (int i = 0; i < locales.length; i++) {
            for (int j = 0; j < locales[i].length; j++) {
                if (locales[i][j].getNegocio() != null) {
                    for (int k = 0; k < locales[i][j].getNegocio().getEmpleados().Size(); k++) {
                        for (int l = 0; l < personas.Size(); l++) {
                            if (locales[i][j].getNegocio().getAdministrador().getCorreo().equals(personas.obtenerDato(l).getCorreo())
                                    || locales[i][j].getNegocio().getEmpleados().obtenerDato(k).getCorreo().equals(correo)) {
                                existe = true;
                                throw new ExcepcionCorreoDuplicado();
                            }
                        }
                    }
                }
            }
        }
        return existe;
    }

    public float ingresosGenerados() {
        float ingresos = 0;
        for (int i = 0; i < ventas.Size(); i++) {
            if (ventas != null) {
                ingresos += ventas.obtenerDato(i).getValorTotal();
            }
        }
        return ingresos;
    }

    public boolean registrarNuevoArticulo(Articulo articulo) {
        boolean registrado = false;
        if (buscarArticulo(articulo.getCodigo()) == null) {
            articulos.add(articulo);
            CentroComercial.serializarListaLocales();
            registrado = true;
        }
        return registrado;
    }

    public boolean modificarArticulo(String codigo, Articulo articulo) {
        boolean modificado = false;
        Articulo articuloAux = null;
        articuloAux = buscarArticulo(codigo);
        if (articuloAux != null) {
            articuloAux.setCantidadProducto(articulo.getCantidadProducto());
            articuloAux.setDecripcionProducto(articulo.getDecripcionProducto());
            articuloAux.setNombreCategoria(articulo.getNombreCategoria());
            articuloAux.setNombreProducto(articulo.getNombreProducto());
            articuloAux.setPorcentajeDescuento(articulo.getPorcentajeDescuento());
            articuloAux.setValorDelProducto(articulo.getValorDelProducto());
            modificado = true;
            CentroComercial.serializarListaLocales();
        }
        return modificado;
    }

    public boolean eliminarArticulo(String codigo) {
        boolean eliminado = false;
        for (int i = 0; i < articulos.Size(); i++) {
            if (articulos.obtenerDato(i).getCodigo().equals(codigo)) {
                articulos.eliminarDato(i);
                eliminado = true;
                CentroComercial.serializarListaLocales();
            }
        }
        return eliminado;
    }

    public boolean realizarCompra(String codigo, Empleado empleado, int cantidad, Cliente cliente) {
        Articulo articulo = null;
        boolean transaccion = false;
        articulo = buscarArticulo(codigo);
        if (articulo.getCantidadProducto() > 0 && articulo.getCantidadProducto() >= cantidad) {
            int restaProducto = articulo.getCantidadProducto();
            restaProducto -= cantidad;
            articulo.setCantidadProducto(restaProducto);
            anadirCompraAHistorial(codigo, cantidad, cliente);
            anadirAVentasRegistradas(codigo, cantidad, empleado, cliente);
            CentroComercial.serializarListaLocales();
            transaccion = true;
        }
        return transaccion;
    }

    public void anadirCompraAHistorial(String codigo, int cantidad, Cliente cliente) {
        Articulo articuloHistorial = null;
        articuloHistorial = buscarArticulo(codigo);
        Articulo articuloAux = new Articulo(articuloHistorial.getCodigo(),
                articuloHistorial.getNombreProducto(),
                articuloHistorial.getDecripcionProducto(),
                articuloHistorial.getNombreCategoria(),
                articuloHistorial.getValorDelProducto(),
                articuloHistorial.getPorcentajeDescuento(),
                articuloHistorial.getCantidadProducto());
        articuloAux.setCantidadProducto(cantidad);
        articuloAux.setValorDelProducto(valorTotal(codigo, cantidad));
        for (int i = 0; i < CentroComercial.concursos.Size(); i++) {
            if (CentroComercial.concursos.obtenerDato(i).getValorMinimo() <= articuloAux.getValorDelProducto()) {
                CentroComercial.concursos.obtenerDato(i).getParticipantes().add(cliente);
                cliente.getHistorialConcurso().getConcursos().add(CentroComercial.concursos.obtenerDato(i));
            }
        }
        cliente.getHistorialCompra().getArticulos().add(articuloAux);
        CentroComercial.serializarListaConcursos();
        CentroComercial.serializarListaPersonas();
    }

    public void anadirAVentasRegistradas(String codigo, int cantidad, Empleado empleado, Cliente cliente) {
        Articulo articuloVendido = null;
        articuloVendido = buscarArticulo(codigo);
        Date fecha = new Date();
        Articulo articuloAux = new Articulo(articuloVendido.getCodigo(),
                articuloVendido.getNombreProducto(),
                articuloVendido.getDecripcionProducto(),
                articuloVendido.getNombreCategoria(),
                articuloVendido.getValorDelProducto(),
                articuloVendido.getPorcentajeDescuento(),
                articuloVendido.getCantidadProducto());
        Venta venta = new Venta(cliente, fecha, articuloAux, cantidad);
        venta.setValorTotal(valorTotal(codigo, cantidad));
        ventas.add(venta);
        CentroComercial.serializarListaLocales();
    }

    public boolean realizarSeparado(String codigo, int cantidad, Empleado empleado, Negocio negocio, Cliente cliente, Date fechaRecogida) {
        Articulo articulo = null;
        boolean transaccion = false;
        articulo = buscarArticulo(codigo);
        if (articulo.getCantidadProducto() > 0 && articulo.getCantidadProducto() >= cantidad) {
            int restaProducto = articulo.getCantidadProducto();
            restaProducto -= cantidad;
            articulo.setCantidadProducto(restaProducto);
            CentroComercial.serializarListaLocales();
            anadirAListaSeparados(codigo, cantidad, empleado, negocio, cliente, fechaRecogida);
            transaccion = true;
        }
        return transaccion;
    }

    public void anadirAListaSeparados(String codigo, int cantidad, Empleado empleado, Negocio negocio, Cliente cliente, Date fechaRecogida) {

        Articulo articuloVendido = null;
        articuloVendido = buscarArticulo(codigo);
        Date fechaIni = new Date();
        Date fechaEnd = fechaRecogida;
        Articulo articuloAux = new Articulo(articuloVendido.getCodigo(),
                articuloVendido.getNombreProducto(),
                articuloVendido.getDecripcionProducto(),
                articuloVendido.getNombreCategoria(),
                articuloVendido.getValorDelProducto(),
                articuloVendido.getPorcentajeDescuento(),
                articuloVendido.getCantidadProducto());
        articuloAux.setCantidadProducto(cantidad);
        articuloAux.setValorDelProducto(valorTotal(codigo, cantidad));
        Separado separado = new Separado(articuloAux, cliente, negocio, fechaIni, fechaEnd);
        separado.setValorTotal(valorTotal(codigo, cantidad));
        separados.add(separado);
        cliente.getListaArticulosSeparados().add(separado);
        CentroComercial.serializarListaLocales();
        CentroComercial.serializarListaPersonas();
    }

    public void pagarSeparado(String codigo, int cantidad, Empleado empleado, Cliente cliente) {
        anadirCompraAHistorial(codigo, cantidad, cliente);
        anadirAVentasRegistradas(codigo, cantidad, empleado, cliente);
        for (int i = 0; i < separados.Size(); i++) {
            if (separados.obtenerDato(i).getProdutosSeparado().getCodigo().equals(codigo)) {
                separados.eliminarDato(i);
            }
        }
        for (int i = 0; i < cliente.getListaArticulosSeparados().Size(); i++) {
            if (cliente.getListaArticulosSeparados().obtenerDato(i).getProdutosSeparado().getCodigo().equals(codigo)) {
                cliente.getListaArticulosSeparados().eliminarDato(i);
            }
        }
        CentroComercial.serializarListaLocales();
        CentroComercial.serializarListaPersonas();
    }

    public void eliminarSeparado(String codigo, int cantidad, Empleado empleado, Cliente cliente) {
        for (int i = 0; i < cliente.getListaArticulosSeparados().Size(); i++) {
            if (cliente.getListaArticulosSeparados().obtenerDato(i).getProdutosSeparado().getCodigo().equals(codigo)) {
                cliente.getListaArticulosSeparados().eliminarDato(i);
            }
        }
        CentroComercial.serializarListaPersonas();
        Articulo articuloHistorial = null;
        articuloHistorial = buscarArticulo(codigo);
        int cantidadAux = articuloHistorial.getCantidadProducto();
        articuloHistorial.setCantidadProducto(cantidadAux + cantidad);
        serializarListaLocales();
    }

    public Articulo buscarArticulo(String codigo) {
        Articulo articulo = null;
        for (int i = 0; i < articulos.Size(); i++) {
            if (articulos.obtenerDato(i).getCodigo().equals(codigo)) {
                articulo = articulos.obtenerDato(i);
            }
        }
        return articulo;
    }

    public float valorTotal(String codigo, int cantidad) {
        float valor;
        Articulo articulo = buscarArticulo(codigo);
        if (articulo.getPorcentajeDescuento() > 0) {
            valor = articulo.calcularDescuento() * cantidad;
        } else {
            valor = articulo.getValorDelProducto() * cantidad;
        }
        return valor;
    }

    public void modificarAdmin(AdministradorDeNegocio administradorDeNegocio) {
        administrador.setNombre(administradorDeNegocio.getNombre());
        administrador.setCedula(administradorDeNegocio.getCedula());
        administrador.setContrasena(administradorDeNegocio.getContrasena());
        administrador.setCorreo(administradorDeNegocio.getCorreo());
        administrador.setEdad(administradorDeNegocio.getEdad());
        administrador.setNumeroCelular(administradorDeNegocio.getNumeroCelular());

    }

    public void modificarNegocio(String nombre, Date fechaFin, Date fechaInicio, String descripcion) {
        this.nombre = nombre;
        contrato.setFechaFin(fechaFin);
        contrato.setFechaInicio(fechaInicio);
        contrato.setDescripcion(descripcion);
    }
}
