public class MainCuentas {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaAhorros(500.0);

        cuenta.depositar(100.0);   // Saldo: 600
        cuenta.retirar(100.0);     // Saldo: 500 — retiro válido
        cuenta.retirar(450.0);     // Viola el mínimo — mensaje de aviso
    }
}