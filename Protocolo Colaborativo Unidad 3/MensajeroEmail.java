public class MensajeroEmail extends Mensajero {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando correo: " + mensaje);
    }
}