public class PrecioService {
    public double calcularPrecioConDescuento(Producto producto, double descuento) {
        return producto.getPrecio() - descuento;
    }
}