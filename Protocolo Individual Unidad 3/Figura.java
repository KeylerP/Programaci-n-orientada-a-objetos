public abstract class Figura {

    // Abstracto: obliga a cada subclase a definir su propia fórmula
    public abstract double calcularArea();

    // Concreto: todas las hijas lo heredan gratis
    public void mostrarArea() {
        System.out.println("Area: " + calcularArea());
    }
}