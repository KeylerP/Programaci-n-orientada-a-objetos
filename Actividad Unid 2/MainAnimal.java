// ============================================================
//  CLASE DE PRUEBA
//  Instancia un objeto Animal y usa ambos métodos
// ============================================================

public class MainAnimal {

    public static void main(String[] args) {

        // Objeto de tipo Animal que puede volar Y nadar
        Animal animal = new Animal("Pato");

        System.out.println("=== Animal usando ambas interfaces ===");
        animal.volar();   // método de Volador
        animal.nadar();   // método de Nadador

        System.out.println();

        Volador v = new Animal("Águila");
        v.volar();  

        Nadador n = new Animal("Delfín");
        n.nadar();  
    }
}