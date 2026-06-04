public class CuentaAhorros extends CuentaBancaria {
    private static final double SALDO_MINIMO = 100.0;

    public CuentaAhorros(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void retirar(double monto) {
        // Cumple el LSP: no lanza excepción, solo valida con mensaje claro
        if (saldo - monto < SALDO_MINIMO) {
            System.out.println("Saldo insuficiente para mantener el mínimo requerido.");
        } else {
            saldo -= monto;
            System.out.println("Retiro realizado. Saldo: $" + saldo);
        }
    }
}