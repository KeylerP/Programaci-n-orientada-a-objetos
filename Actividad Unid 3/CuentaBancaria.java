public class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito realizado. Saldo: $" + saldo);
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro realizado. Saldo: $" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}