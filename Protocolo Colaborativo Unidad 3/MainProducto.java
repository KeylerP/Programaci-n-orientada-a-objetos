public class MainProducto {
    public static void main(String[] args) {
        Producto producto = new Producto("Camisa", 50.0);

        EtiquetaService etiqueta = new EtiquetaService();
        etiqueta.generarEtiqueta(producto);

        PrecioService precio = new PrecioService();
        System.out.println("Precio con descuento: $"
            + precio.calcularPrecioConDescuento(producto, 10.0));
    }
}