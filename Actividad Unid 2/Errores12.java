// ============================================================
//  EJERCICIO 3 — Implementación incorrecta de interfaces
//  Demuestra: error por método no implementado y mala práctica
// ============================================================

// Interfaz con método obligatorio
interface Jugador {
    void jugar();
}

// ❌ ERROR DE COMPILACIÓN: Futbolista no implementa jugar()
// Descomenta para ver el error:
//
// class Futbolista implements Jugador {
//     // Error: Futbolista is not abstract and does not override jugar()
// }

// ✅ CORRECTO: implementa todos los métodos de la interfaz
class Futbolista implements Jugador {
    @Override
    public void jugar() {
        System.out.println("El futbolista está jugando.");
    }
}

// ── Conflicto de métodos default ──
interface InterfazVolador {
    default void despegar() {
        System.out.println("Volador despega.");
    }
}

interface InterfazNadador {
    default void despegar() {
        System.out.println("Nadador despega.");
    }
}

// ❌ SIN sobrescribir → error de compilación (conflicto de default)
// ✅ SOLUCIÓN: sobrescribir despegar() en la clase
class Anfibio implements InterfazVolador, InterfazNadador {
    @Override
    public void despegar() {
        InterfazVolador.super.despegar(); // elige cuál usar
        System.out.println("Anfibio resuelve el conflicto.");
    }
}

// ── Mala práctica: interfaz sin sentido lógico ──
interface Movible {
    void moverse();
}

// ⚠️ Compila pero NO tiene sentido: una casa no se mueve
class Casa implements Movible {
    @Override
    public void moverse() {
        System.out.println("Las casas no se mueven. (mala práctica)");
    }
}

// ── CLASE DE PRUEBA ──
public class Errores12 {

    public static void main(String[] args) {

        System.out.println("=== Correcto: Futbolista implementa jugar() ===");
        Futbolista f = new Futbolista();
        f.jugar();

        System.out.println();

        System.out.println("=== Conflicto de default resuelto: Anfibio ===");
        Anfibio a = new Anfibio();
        a.despegar();

        System.out.println();

        System.out.println("=== Mala práctica: Casa implements Movible ===");
        Casa c = new Casa();
        c.moverse();
    }
}