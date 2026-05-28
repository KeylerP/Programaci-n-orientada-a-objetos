public class Persona implements Hablador, Trabajador {
    @Override
    public void hablar() {
        System.out.println("La persona esta hablando.");
    }

    @Override
    public void trabajar() {
        System.out.println("La persona esta trabajando.");
    }
}