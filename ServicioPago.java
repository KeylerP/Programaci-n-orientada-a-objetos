public class ServicioPago implements PagadorFactura {
    @Override
    public void pagarFactura(double monto) {
        System.out.println("Pago de factura realizado por $" + monto);
    }
}