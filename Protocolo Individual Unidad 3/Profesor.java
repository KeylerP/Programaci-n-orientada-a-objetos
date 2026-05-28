public class Profesor extends Persona {
    private String materia;

    public Profesor(String materia) {
        this.materia = materia;
    }

    @Override
    public void presentarse() {
        System.out.println("Soy un profesor de " + materia + ".");
    }
}