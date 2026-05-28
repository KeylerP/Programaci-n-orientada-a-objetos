
public class Mainpato {

    public static void main(String[] args) {

        Pato pato = new Pato();

        System.out.println("=== Pato con dos interfaces ===");
        pato.volar();  // El pato esta volando.
        pato.nadar();  // El pato esta nadando.

        // Polimorfismo con referencia de tipo interfaz
        Volador v = new Pato();
        v.volar();

        Nadador n = new Pato();
        n.nadar();
    }
}