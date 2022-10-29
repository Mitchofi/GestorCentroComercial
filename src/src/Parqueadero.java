package src;

import Singleton.Singleton;
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

}
