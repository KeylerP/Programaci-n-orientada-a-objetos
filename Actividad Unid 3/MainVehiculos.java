public class MainVehiculos {
    public static void main(String[] args) {
        AutoPasajeros auto   = new AutoPasajeros();
        Camion        camion = new Camion();

        auto.conducir();
        camion.conducir();
        camion.cargarMercancias();
    }
}