public class EtiquetaService {
    public void generarEtiqueta(Producto producto) {
        System.out.println("Etiqueta: " + producto.getNombre()
            + " - $" + producto.getPrecio());
    }
}