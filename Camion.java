// Conduce Y carga mercancías — implementa ambas interfaces
public class Camion implements Conducible, CargadorMercancias {
    @Override
    public void conducir() {
        System.out.println("El camión está siendo conducido.");
    }

    @Override
    public void cargarMercancias() {
        System.out.println("El camión está cargando mercancías.");
    }
}