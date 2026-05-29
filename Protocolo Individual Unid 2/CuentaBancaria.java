public class CuentaBancaria {
    private String numeroCuenta; // nadie puede acceder desde afuera
    private double saldo;
    public String tipoCuenta; // acceso libre

    public CuentaBancaria(String numero, double saldo, String tipo) {
        this.numeroCuenta = numero;
        this.saldo = saldo;
        this.tipoCuenta = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0)
            this.saldo = saldo;
    }

    public void mostrarDetalles() {
        System.out.println("Número de cuenta: " + numeroCuenta); // ← agregar esta línea
        System.out.println("Tipo: " + String.valueOf(tipoCuenta));
        System.out.println("Saldo: " + saldo);
    }
}