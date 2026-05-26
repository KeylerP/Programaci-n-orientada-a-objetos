public class MainCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria c = new CuentaBancaria("001-XYZ", 5000, "Ahorros");
        c.mostrarDetalles();
        // c.numeroCuenta = "hack"; ← ERROR de compilación (es private)
        System.out.println(c.tipoCuenta); // ← funciona (es public)
    }
}