package src;

import java.io.Serializable;
import util.Queve;

class Parqueadero implements Serializable {

    private Vehiculo vehiculos[][];
    private Queve<Vehiculo> ColaEsperaVehiculos;

    public Parqueadero(Vehiculo[][] vehiculos, Queve<Vehiculo> ColaEsperaVehiculos) {
        this.vehiculos = new Vehiculo[5][10];
        this.ColaEsperaVehiculos = ColaEsperaVehiculos;
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

}
