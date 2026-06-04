public class ServicioTransferencia implements Transferible {
    @Override
    public void transferir(double monto) {
        System.out.println("Transferencia realizada por $" + monto);
    }
}