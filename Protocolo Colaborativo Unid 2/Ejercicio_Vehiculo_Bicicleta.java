// ---------- CLASE PADRE ----------
class Vehiculo {

    public void moverse() {
        System.out.println("El vehículo se mueve.");
    }
}

// ---------- CLASE HIJA ----------
class Bicicleta extends Vehiculo {

    @Override
    public void moverse() {
        System.out.println("La bicicleta pedalea.");
    }
}

// ---------- CLASE PRINCIPAL ----------
public class Ejercicio_Vehiculo_Bicicleta {

    public static void main(String[] args) {

        Vehiculo v = new Vehiculo();
        Bicicleta bici = new Bicicleta();

        v.moverse();
        bici.moverse();
    }
}