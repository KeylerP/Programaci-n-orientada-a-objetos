public class Errores {
    public static void main(String[] args) {
        // ERROR 1: no se puede instanciar una clase abstracta
        // Figura f = new Figura(); // Error de compilacion

        // ERROR 2: clase hija que no implementa el metodo abstracto
        // Si Rectangulo no tuviera calcularArea(), el compilador
        // obligaria a Rectangulo a ser abstracta tambien.
    }
}