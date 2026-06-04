// Solo conduce, no carga mercancías — ISP cumplido
public class AutoPasajeros implements Conducible {
    @Override
    public void conducir() {
        System.out.println("El auto está siendo conducido.");
    }
}