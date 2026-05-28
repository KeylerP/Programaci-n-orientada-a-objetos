
interface Jugador {
    void jugar();
}

// ❌ ERROR 1 — Descomenta para ver el error de compilación:
// class Futbolista implements Jugador {
//     // Error: Futbolista is not abstract and does not override jugar()
// }

// ✅ CORRECTO: implementa el método obligatorio
class Futbolista implements Jugador {
    @Override
    public void jugar() {
        System.out.println("El futbolista esta jugando.");
    }
}

// ── Clase abstracta ──
// En una clase abstracta los métodos concretos se escriben normalmente.
// La palabra 'default' es EXCLUSIVA de interfaces.
abstract class Vehiculo {

    // ❌ ERROR 2 — 'default' no existe en clases abstractas. Descomenta para ver el error:
    // default void encender() {
    //     System.out.println("Encendiendo...");
    // }

    // ✅ CORRECTO: método concreto en clase abstracta, sin ninguna palabra especial
    public void encender() {
        System.out.println("El vehiculo esta encendido.");
    }

    // Método abstracto obligatorio para las hijas
    public abstract void acelerar();
}

class Coche extends Vehiculo {
    @Override
    public void acelerar() {
        System.out.println("El coche esta acelerando.");
    }
}

// ── CLASE DE PRUEBA ──
public class Errores3 {

    public static void main(String[] args) {

        System.out.println("=== Error 1 resuelto: Futbolista implementa jugar() ===");
        Futbolista f = new Futbolista();
        f.jugar();

        System.out.println();

        System.out.println("=== Error 2 resuelto: metodo concreto en clase abstracta ===");
        Coche c = new Coche();
        c.encender();   // heredado de Vehiculo (concreto, sin default)
        c.acelerar();   // implementado en Coche
    }
}