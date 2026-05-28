public class MainEmpleados {
    public static void main(String[] args) {
        Empleado g = new Gerente("Luis", 5000, 2000);
        Empleado v = new Vendedor("Maria", 2000, 1500);
        g.mostrarDetalles();
        v.mostrarDetalles();
    }
}
