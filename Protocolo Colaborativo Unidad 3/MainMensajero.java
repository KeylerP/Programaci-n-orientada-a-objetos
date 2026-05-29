public class MainMensajero {
    public static void main(String[] args) {
        Mensajero email = new MensajeroEmail();
        Mensajero sms   = new MensajeroSMS();
        Mensajero push  = new MensajeroPush();

        email.enviarMensaje("Hola equipo!");
        sms.enviarMensaje("Hola equipo!");
        push.enviarMensaje("Hola equipo!");
    }
}