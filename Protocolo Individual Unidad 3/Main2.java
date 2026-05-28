public class Main2 {
    public static void main(String[] args) {
        Figura1 f = new Circulo(5);
        f.calcularArea(); // 78.539...

        f = new Rectangulo1(5, 3);
        f.calcularArea(); // 15.0
    }
}