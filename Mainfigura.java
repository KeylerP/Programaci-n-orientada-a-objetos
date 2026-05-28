public class Mainfigura {

    public static void main(String[] args) {

        Figura rect = new Rectangulo(5, 3);
        Figura tri  = new Triangulo(5, 3);

        System.out.println("=== Figura abstracta con polimorfismo ===");
        rect.mostrarArea();  // Area del rectangulo: 15.0
        tri.mostrarArea();   // Area del triangulo: 7.5

        // Mismo método mostrarArea() del padre → distintos resultados
        // Eso es polimorfismo en acción
    }
}