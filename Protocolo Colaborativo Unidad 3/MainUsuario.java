public class MainUsuario {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("admin", "1234");

        AutenticacionService auth = new AutenticacionService();
        System.out.println("Autenticación exitosa: " + auth.autenticar(usuario, "1234"));

        ValidacionService validacion = new ValidacionService();
        System.out.println("Usuario válido: " + validacion.validar(usuario));
    }
}