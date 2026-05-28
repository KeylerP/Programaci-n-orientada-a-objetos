public class Moto extends Vehiculo {
    @Override
    public void mover() {
        super.mover(); // ⚠️ Mala práctica: no agrega nada nuevo
    }
}