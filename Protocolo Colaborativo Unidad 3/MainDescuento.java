public class MainDescuento {
    public static void main(String[] args) {
        double precio = 100.0;

        Descuento porcentaje = new DescuentoPorcentaje(15);
        System.out.println("Precio con descuento porcentaje: $"
            + porcentaje.aplicarDescuento(precio));

        Descuento fijo = new DescuentoFijo(20);
        System.out.println("Precio con descuento fijo: $"
            + fijo.aplicarDescuento(precio));
    }
}