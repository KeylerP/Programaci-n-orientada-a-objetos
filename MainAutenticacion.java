public class MainAutenticacion {
    public static void main(String[] args) {

        // Usando autenticación local
        ServicioAutenticacion local = new AutenticacionLocal();
        GestorAutenticacion gestor = new GestorAutenticacion(local);
        System.out.println("=== Autenticación Local ===");
        gestor.iniciarSesion("admin", "1234");   // Acceso concedido
        gestor.iniciarSesion("admin", "wrong");  // Acceso denegado

        System.out.println();

        // Cambiamos a OAuth sin tocar GestorAutenticacion
        ServicioAutenticacion oauth = new AutenticacionOAuth();
        gestor = new GestorAutenticacion(oauth);
        System.out.println("=== Autenticación OAuth ===");
        gestor.iniciarSesion("usuario@gmail.com", "token123");
    }
}