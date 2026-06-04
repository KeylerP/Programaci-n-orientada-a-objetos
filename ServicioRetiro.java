public class ServicioRetiro implements Retirable {
    @Override
    public void retirar(double monto) {
        System.out.println("Retiro realizado por $" + monto);
    }
}