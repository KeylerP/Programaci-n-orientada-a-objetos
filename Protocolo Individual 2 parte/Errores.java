public class Errores {
    public static void main(String[] args) {
        System.out.println("Ver errores marcados en el código");
    }
}

// ERROR 1: herencia múltiple — Java no lo permite
// Descomenta para ver el error de compilación
/*
class ClaseA { }
class ClaseB { }
class ClaseC extends ClaseA, ClaseB { }
*/

// ERROR 2: atributo private no accesible desde la clase hija
class Vehiculo2 {
    private String marca;

    public Vehiculo2(String marca) {
        this.marca = marca;
    }
}

class Coche2 extends Vehiculo2 {
    public Coche2(String marca) {
        super(marca);
    }

    public void mostrarMarca() {
        // ERROR: marca es private, el IDE lo subraya en rojo
        System.out.println(marca);
    }
}