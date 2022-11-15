package src;

import java.io.Serializable;
import util.Queve;

public class Parqueadero implements Serializable {

    private Vehiculo vehiculos[][];
    private Queve<Vehiculo> ColaEsperaVehiculos;

    public Parqueadero() {
        this.vehiculos = new Vehiculo[5][10];
        this.ColaEsperaVehiculos = new Queve<>();
        if (vehiculos[0][0] == null) {
            initParqueadero();
        }
    }

    private void initParqueadero() {
        for (int i = 0; i < vehiculos.length; i++) {
            for (int j = 0; j < vehiculos[i].length; j++) {
                vehiculos[i][j] = new Vehiculo(null, null);
            }
        }
    }

    public Vehiculo[][] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo[][] vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Queve<Vehiculo> getColaEsperaVehiculos() {
        return ColaEsperaVehiculos;
    }

    public void setColaEsperaVehiculos(Queve<Vehiculo> ColaEsperaVehiculos) {
        this.ColaEsperaVehiculos = ColaEsperaVehiculos;
    }

    public Vehiculo espacio(int i, int j) {
        return vehiculos[i][j];
    }

    public Vehiculo buscarVehiculo(String tipo, String placa) {
        Vehiculo vehiculo = null;
        for (int i = 0; i < vehiculos.length; i++) {
            for (int j = 0; j < vehiculos[i].length; j++) {
                if (vehiculos[i][j].getPlaca() != null) {
                    if (vehiculos[i][j].getTipo().equals(tipo)
                            && vehiculos[i][j].getPlaca().equals(placa)) {
                        vehiculo = vehiculos[i][j];
                    }
                }
            }
        }
        return vehiculo;
    }

    public boolean anadirVehiculoACola(String tipo, String placa) {
        Vehiculo vehiculo = buscarVehiculo(tipo, placa);
        boolean registrado = false;
        if (vehiculo == null) {
            vehiculo = new Vehiculo(tipo, placa);
            ColaEsperaVehiculos.add(vehiculo);
            registrado = true;
            CentroComercial.serializarListaParqueadero();
        }
        return registrado;
    }

    public Queve<Vehiculo> returnCola() {
        return ColaEsperaVehiculos;
    }
}
