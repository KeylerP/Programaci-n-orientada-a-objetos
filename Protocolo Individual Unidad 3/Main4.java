public class Main4 {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo();
        Vehiculo c = new Coche();
        Vehiculo b = new Bicicleta();

        v.mover(); // El vehículo se está moviendo.
        c.mover(); // El coche se está moviendo.
        b.mover(); // La bicicleta se está moviendo.
    }
}