public class Utilidades {
    public static double sumar(double a, double b)       { return a + b; }
    public static double restar(double a, double b)      { return a - b; }
    public static double multiplicar(double a, double b) { return a * b; }
    public static double dividir(double a, double b) {
        if (b != 0) return a / b;
        System.out.println("Error: división por cero");
        return 0;
    }
}