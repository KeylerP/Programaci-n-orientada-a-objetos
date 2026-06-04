public class MainOperacionesBancarias {
    public static void main(String[] args) {
        Transferible  transferencia = new ServicioTransferencia();
        Retirable     retiro        = new ServicioRetiro();
        PagadorFactura pago         = new ServicioPago();

        transferencia.transferir(500.0);
        retiro.retirar(200.0);
        pago.pagarFactura(150.0);
    }
}