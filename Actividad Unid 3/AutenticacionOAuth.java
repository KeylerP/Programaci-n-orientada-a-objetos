// Autenticación OAuth: delega en un proveedor externo (Google, GitHub, etc.)
public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        System.out.println("Autenticando via OAuth al usuario: " + usuario);
        // Simulación: siempre aprueba (en producción llamaría a la API externa)
        return true;
    }
}