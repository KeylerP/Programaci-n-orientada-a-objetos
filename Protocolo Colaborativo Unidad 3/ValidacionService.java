public class ValidacionService {
    public boolean validar(Usuario usuario) {
        return usuario.getNombre() != null && !usuario.getNombre().isEmpty();
    }
}