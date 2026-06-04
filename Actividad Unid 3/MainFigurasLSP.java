public class MainFigurasLSP {
    public static void main(String[] args) {
        // LSP: Figura puede ser sustituida por cualquier clase derivada
        Figura f1 = new Circulo(5);
        Figura f2 = new Rectangulo(3, 5);

        System.out.print("Área del círculo: ");
        f1.mostrarArea();

        System.out.print("Área del rectángulo: ");
        f2.mostrarArea();
    }
}