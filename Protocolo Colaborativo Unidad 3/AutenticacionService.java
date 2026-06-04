public class AutenticacionService {
    public boolean autenticar(Usuario usuario, String contrasena) {
        return usuario.getContrasena().equals(contrasena);
    }
}