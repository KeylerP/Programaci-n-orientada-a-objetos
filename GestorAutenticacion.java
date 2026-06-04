public class GestorAutenticacion {

    // Depende de la interfaz, no de una clase concreta
    private ServicioAutenticacion servicio;

    // Inyección de dependencia por constructor
    public GestorAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }

    public void iniciarSesion(String usuario, String contrasena) {
        boolean resultado = servicio.autenticar(usuario, contrasena);
        if (resultado) {
            System.out.println("Acceso concedido a: " + usuario);
        } else {
            System.out.println("Acceso denegado a: " + usuario);
        }
    }
}