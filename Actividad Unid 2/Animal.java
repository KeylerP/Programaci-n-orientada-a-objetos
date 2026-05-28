// ============================================================
//  CLASE Animal
//  Implementa AMBAS interfaces: Volador y Nadador
//  Debe definir obligatoriamente volar() y nadar()
// ============================================================

public class Animal implements Volador, Nadador {

    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Implementación obligatoria de Volador
    @Override
    public void volar() {
        System.out.println(nombre + " está volando.");
    }

    // Implementación obligatoria de Nadador
    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando.");
    }
}