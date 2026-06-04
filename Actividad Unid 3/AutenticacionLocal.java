// Autenticación local: verifica usuario y contraseña en la propia app
public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        System.out.println("Autenticando localmente al usuario: " + usuario);
        // Simulación: solo acepta usuario "admin" con clave "1234"
        return usuario.equals("admin") && contrasena.equals("1234");
    }
}