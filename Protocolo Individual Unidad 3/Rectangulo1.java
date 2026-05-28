public class Rectangulo1 extends Figura1 {
    private double base, altura;

    public Rectangulo1(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("Área del rectángulo: " + area);
    }
}